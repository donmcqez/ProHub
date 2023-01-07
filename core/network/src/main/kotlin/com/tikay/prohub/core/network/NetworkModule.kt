package com.tikay.prohub.core.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.tikay.prohub.network.BuildConfig
import com.tikay.prohub.core.network.interceptors.AuthenticationInterceptor
import com.tikay.prohub.core.network.interceptors.NetworkStatusInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.ConnectionPool
import okhttp3.Dispatcher
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            HttpLoggingInterceptor.Level.BODY
            if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        networkStatusInterceptor: NetworkStatusInterceptor,
        authenticationInterceptor: AuthenticationInterceptor,
        httpLoggingInterceptor: HttpLoggingInterceptor, // 1
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(networkStatusInterceptor) // 2
            .addInterceptor(authenticationInterceptor) // 3
            .addInterceptor(httpLoggingInterceptor) // 4
            .retryOnConnectionFailure(true)
//            .cache(Cache(File(context.cacheDir, "api_cache"), 50L * 1024 * 1024))
            // Adjust the Connection pool to account for historical use of 3 separate clients
            // but reduce the keepAlive to 2 minutes to avoid keeping radio open.
            .connectionPool(ConnectionPool(10, 2, TimeUnit.MINUTES))
            .dispatcher(
                Dispatcher().apply {
                    // Allow for high number of concurrent image fetches on same host.
                    maxRequestsPerHost = 15
                }
            )
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .pingInterval(5, TimeUnit.SECONDS)
            .build()
    }

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    fun provideConverterFactory(): Converter.Factory {
        val contentType = "application/json".toMediaType()
        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
            prettyPrint = true
            encodeDefaults = true
            classDiscriminator = "#class"
        }
        return json.asConverterFactory(contentType)
    }

}