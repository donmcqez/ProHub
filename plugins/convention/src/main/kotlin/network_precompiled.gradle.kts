import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.Kotlinx
import com.composite.dependencies.Moshi
import com.composite.dependencies.Retrofit
import com.composite.dependencies.implementation
import com.composite.dependencies.kapt

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")

    id("kotlinx-serialization")
}

android {
    compileSdk = BuildConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK_VERSION
        targetSdk = BuildConfig.TARGET_SDK_VERSION

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
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

    with(Kotlin) {
        implementation(kotlinStdlib)
    }

    with(Coroutines) {
        implementation(core)
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
//                ksp(moshiKotlinCodegen) // moshi codegen
        implementation(kotlinPoet)
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