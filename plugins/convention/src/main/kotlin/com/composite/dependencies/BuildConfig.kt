package com.composite.dependencies

import org.gradle.api.JavaVersion

/**
 * Configuration of android build
 */
object BuildConfig {
    const val APPLICATION_ID = "com.tikay.prohub"

    const val COMPILE_SDK_VERSION = 33
    const val MIN_SDK_VERSION = 24
    const val TARGET_SDK_VERSION = 33

    const val VERSION_CODE = 1
    const val VERSION_NAME = "0.0.1" // X.Y.Z; X = Major, Y = minor, Z = Patch level

    const val BUILD_TOOLS_VERSION = "33.0.0"

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

    val javaVersion = JavaVersion.VERSION_1_8
//    val javaVersion = JavaVersion.VERSION_11
}