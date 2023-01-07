package com.composite.dependencies

object Hilt {
    const val version = "2.43.2"
    const val android  = "com.google.dagger:hilt-android:$version"
    const val compiler = "com.google.dagger:hilt-compiler:$version"

    private const val workVersion = "1.0.0"
    const val work = "androidx.hilt:hilt-work:$workVersion"

    const val androidTesting = "com.google.dagger:hilt-android-testing:$version"
}