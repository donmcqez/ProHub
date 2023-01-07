import com.composite.dependencies.AndroidX
import com.composite.dependencies.Annotations
import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.Libraries
import com.composite.dependencies.Room
import com.composite.dependencies.implementation
import com.composite.dependencies.kapt
import com.composite.dependencies.ksp

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
//    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    compileSdk = BuildConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK_VERSION
        targetSdk = BuildConfig.TARGET_SDK_VERSION
    }

    buildTypes {
        debug{
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = true
        }
    }

    compileOptions {
//        coreLibraryDesugaringEnabled = true
        sourceCompatibility = BuildConfig.javaVersion
        targetCompatibility = BuildConfig.javaVersion
    }
}


dependencies {

    with(Hilt) {
        implementation(android)
        kapt(compiler)
    }

    implementation(Annotations.jetbrainsAnnotations)

    with(Kotlin) {
        implementation(kotlinStdlib)
    }

    with(AndroidX) {
        implementation(pagingCommon)
        implementation(pagingRuntime)
    }

    with(Coroutines) {
        implementation(core)
        implementation(coreJvm)
        implementation(android)
    }

    with(Room) {
        implementation(roomCommon)
        implementation(roomRuntime)
        implementation(roomKtx)
        ksp(roomCompiler)
//        kapt(roomCompiler)
    }


    with(Libraries) {
//        implementation(store)
        implementation(threeTen)
    }

}


kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}