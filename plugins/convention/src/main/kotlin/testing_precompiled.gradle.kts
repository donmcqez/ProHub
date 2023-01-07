import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Compose
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.TestDependencies
import com.composite.dependencies.api
import com.composite.dependencies.implementation
import com.composite.dependencies.kapt

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
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

    with(Coroutines) {
        implementation(core)
    }

    with(Kotlin) {
        implementation(kotlinStdlib)
    }

    api(TestDependencies.ANDROIDX_EXT_JUNIT)
    api(TestDependencies.ANDROIDX_EXT_JUNIT_KTX)

    api(TestDependencies.ANDROIDX_CORE)
    api(TestDependencies.ANDROIDX_CORE_KTX)
    api(TestDependencies.ANDROIDX_ARCH_CORE)
    api(TestDependencies.ANDROIDX_RULES)
    api(TestDependencies.ANDROIDX_RUNNER)



    api(TestDependencies.COROUTINES)

    api(TestDependencies.ESPRESSO_CORE)
    api(TestDependencies.JUNIT)
    api(TestDependencies.MOCK_WEBSERVER)
    api(TestDependencies.MOCKK)
    api(TestDependencies.MOCKITO)
    api(TestDependencies.ROBO_ELECTRIC)
    api(TestDependencies.TRUTH)
    api(TestDependencies.COMPOSE_UI_TEST)



    api(TestDependencies.HILT_TEST)

    api(Compose.uiTest)
    debugApi(Compose.uiTestManifest)
}


kapt {
    correctErrorTypes = true
}

hilt {
    enableAggregatingTask = true
}
