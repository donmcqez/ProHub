import com.composite.dependencies.AndroidX
import com.composite.dependencies.Annotations
import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.Kotlinx
import com.composite.dependencies.Libraries
import com.composite.dependencies.Moshi
import com.composite.dependencies.Retrofit
import com.composite.dependencies.Room
import com.composite.dependencies.implementation
import com.composite.dependencies.kapt
import com.composite.dependencies.ksp

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")

    id("kotlinx-serialization")
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
        implementation(dataStorePreference)
        implementation(dataStorePreferenceCore)
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

    with(Retrofit) {
        implementation(retrofit)
        implementation(retrofitConverterMoshi)
        implementation(retrofitConverterGson)
        implementation(kotlinSerializationConverter)
        implementation(okhttp)
        implementation(okhttpLoggingInterceptor)
    }

    with(Moshi) {
        implementation(moshi) // moshi core
        implementation(moshiKotlin)
        implementation(moshiAdapters)
        kapt(moshiKotlinCodegen) // moshi codegen
//        ksp(moshiKotlinCodegen) // moshi codegen
        implementation(kotlinPoet)
    }


    with(Libraries) {
        implementation(store)
    }

    with(Kotlinx){
        implementation(serialization)
    }
}


kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}