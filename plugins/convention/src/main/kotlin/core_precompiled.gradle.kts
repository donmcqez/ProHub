import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.addHiltTestsDependencies
import com.composite.dependencies.addLocalTestsDependencies
import com.composite.dependencies.addUITestsDependencies
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
        debug{
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = true
        }
    }

    compileOptions {
        sourceCompatibility = BuildConfig.javaVersion
        targetCompatibility = BuildConfig.javaVersion
    }
}


dependencies {

    with(Hilt) {
        implementation(android)
        kapt(compiler)
    }

//    implementation(Annotations.jetbrainsAnnotations)

    with(Kotlin) {
        implementation(kotlinStdlib)
    }


//    addLocalTestsDependencies()
//    addUITestsDependencies()
//    addHiltTestsDependencies()
}


kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}
