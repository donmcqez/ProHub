package com.composite.dependencies

object Retrofit {
    private const val version = "2.9.0"
    const val retrofit= "com.squareup.retrofit2:retrofit:$version"
    const val okhttp ="com.squareup.okhttp3:okhttp:$version"

    private const val okhttpLoggingVersion = "4.9.3"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okhttpLoggingVersion"

    const val retrofitConverterMoshi =  "com.squareup.retrofit2:converter-moshi:$version"
    const val retrofitConverterGson  = "com.squareup.retrofit2:converter-gson:$version"

    private const val kotlinSerializationConverterVersion = "0.8.0"
    const val kotlinSerializationConverter =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:$kotlinSerializationConverterVersion"
}