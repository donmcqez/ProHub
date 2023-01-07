package com.composite.dependencies


object Kotlin {
//    const val version = "1.7.10"
//    const val version = "1.7.20-Beta"
    const val version = "1.7.20"
    val kotlinStdlib by lazy { "org.jetbrains.kotlin:kotlin-stdlib:$version" }
    val kotlinStdlibJdk by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version" }
    val kotlinStdlibJdk7 by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version" }
    val kotlinStdlibCommon by lazy { "org.jetbrains.kotlin:kotlin-stdlib-common:$version" }
    val kotlinReflect by lazy { "org.jetbrains.kotlin:kotlin-reflect:$version" }
}