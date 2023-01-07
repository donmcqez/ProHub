import com.composite.dependencies.AndroidX
import com.composite.dependencies.Annotations
import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.Libraries
import com.composite.dependencies.addHiltTestsDependencies
import com.composite.dependencies.addLocalTestsDependencies
import com.composite.dependencies.addUITestsDependencies
import com.composite.dependencies.api
import com.composite.dependencies.implementation
import com.composite.dependencies.kapt

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    compileSdk = BuildConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK_VERSION
        targetSdk = BuildConfig.TARGET_SDK_VERSION

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        debug {
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = true
        }
    }
//    buildFeatures {
//        compose = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = Compose.compilerVersion
//    }
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

    api(Annotations.jetbrainsAnnotations)

    with(Kotlin) {
        implementation(kotlinStdlib)
    }

//    with(AndroidX) {
//        implementation(pagingCommon)
//        implementation(pagingRuntime)
//    }

    with(AndroidX) {
        implementation(collection)
        implementation(emoji)

//                implementation(commonJava8)
        implementation(lifecycleRuntimeKtx)
        implementation(extension)
    }

//    with(Retrofit) {
//        implementation(retrofit)
//        implementation(retrofitConverterMoshi)
//        implementation(retrofitConverterGson)
//        implementation(okhttp)
//        implementation(okhttpLoggingInterceptor)
//    }

    with(Libraries) {
        api(threeTen)
        api(timber)
        api(threeTenAbp)
    }

//    addLocalTestsDependencies()
//    addUITestsDependencies()
//    addHiltTestsDependencies()
}


// Allow references to generated code
kapt {
    correctErrorTypes = true
//    useBuildCache = true
}

hilt {
    enableAggregatingTask = true
}