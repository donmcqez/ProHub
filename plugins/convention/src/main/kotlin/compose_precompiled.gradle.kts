import com.composite.dependencies.Accompanist
import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Compose
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Google
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.addComposeTestsDependencies
import com.composite.dependencies.addHiltTestsDependencies
import com.composite.dependencies.addLocalTestsDependencies
import com.composite.dependencies.addUITestsDependencies
import com.composite.dependencies.debugImplementation
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

    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    compileSdk = BuildConfig.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = BuildConfig.MIN_SDK_VERSION
        targetSdk = BuildConfig.TARGET_SDK_VERSION
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = true
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.compilerVersion
    }
    compileOptions {
        sourceCompatibility = BuildConfig.javaVersion
        targetCompatibility = BuildConfig.javaVersion
    }

    sourceSets {
        getByName("main").apply {
            kotlin.srcDir("build/generated/ksp/main/kotlin")
        }
        getByName("debug").apply {
            kotlin.srcDir("build/generated/ksp/debug/kotlin")
        }
        getByName("release").apply {
            kotlin.srcDir("build/generated/ksp/release/kotlin")
        }
        getByName("test").apply {
            kotlin.srcDir("build/generated/ksp/test/kotlin")
        }
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
        implementation(coreJvm)
        implementation(android)
    }

    // google maps and apis
    with(Google) {
        implementation(material)
        implementation(playServicesMap)
        implementation(composeMap)
        implementation(composeMapWidgets)
        implementation(googleWallet)
    }

    with(Compose) {
        implementation(activityCompose)
        implementation(material)
        implementation(material3)
        implementation(material3WindowSizeClass)
        implementation(materialIconExt)
        implementation(animation)
        implementation(animationCore)
        implementation(foundation)
        implementation(foundationLayout)
        implementation(constraintLayout)
        implementation(navigation)
        implementation(composeRuntime)
        implementation(runtimeCompose)
        implementation(viewBinding)
        implementation(uiTooling)
        debugImplementation(uiTooling)
        implementation(uiToolingPreview)
        implementation(ui)
        implementation(uiUtil)
        implementation(material)
        implementation(dateTimePicker)
        implementation(viewModelCompose)
        implementation(hiltNavigationCompose)

        implementation(destinations)
        ksp(destinationsKsp)

    }


    with(Accompanist) {
        implementation(material)
        implementation(animation)
        implementation(flowLayout)
        implementation(swipeRefresh)
        implementation(pager)
        implementation(pagerIndicator)
        implementation(insets)
        implementation(insetsUi)
        implementation(navigationAnimation)
        implementation(systemUiController)
    }


//    addLocalTestsDependencies()
//    addUITestsDependencies()
//    addComposeTestsDependencies()
//    addHiltTestsDependencies()

}


kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}