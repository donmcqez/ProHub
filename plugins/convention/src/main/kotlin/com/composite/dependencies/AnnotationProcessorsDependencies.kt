package com.composite.dependencies


/**
 * Project annotation processor dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object AnnotationProcessorsDependencies {
    private const val roomVersion = "2.4.3"
    const val ROOM = "androidx.room:room-compiler:${com.composite.dependencies.AnnotationProcessorsDependencies.roomVersion}"
    const val HILT = "com.google.dagger:hilt-android-compiler:${com.composite.dependencies.Hilt.version}"
}