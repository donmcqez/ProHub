package com.tikay.prohub.core.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

/**
 * An {@see [Interceptor]} that adds an [accessToken] to requests if one is provided, otherwise
 * adds a client id.
 * @property accessToken String
 * @constructor
 */
@Singleton
class AuthenticationInterceptor @Inject constructor(
//    @AccessToken private val accessToken: String,
//    private val logger: Logger,
) : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        // check if request requires authentication
        if (request.header("No-Authentication").isNullOrEmpty()) {
//            if (accessToken.isNotEmpty()) {
//                request = request.newBuilder()
//                    .addHeader("Authorization", "Bearer $accessToken")
//                    .build()
//            } else {
//                logger.i("TOKEN:  ==========> $accessToken")
//                logger.e("ERROR:  ==========> Authentication is required")
//            }
        }

        return chain.proceed(request)
    }
}
