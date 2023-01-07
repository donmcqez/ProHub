package com.composite.dependencies

/**
 * Configuration of all gradle build plugins
 */
object BuildPlugins {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_PARCELIZE = "kotlin-parcelize"
    const val KOTLIN_KAPT = "kotlin-kapt"
    const val HILT = "dagger.hilt.android.plugin"
    const val HILT_ANDROID = "com.google.dagger.hilt.android"
    const val NAVIGATION = "androidx.navigation.safeargs"
    const val KSP = "com.google.devtools.ksp"
}