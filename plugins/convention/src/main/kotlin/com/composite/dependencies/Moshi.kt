package com.composite.dependencies

object Moshi {
    private const val version = "1.13.0"
//    private const val version = "1.14.0"
    const val moshi = "com.squareup.moshi:moshi:$version"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:$version"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:$version"
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$version"  //kapt

    private const val kotlinPoetVersion = "1.10.2"
    const val kotlinPoet = "com.squareup:kotlinpoet:$kotlinPoetVersion" //kapt
}