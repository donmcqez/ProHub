import com.composite.dependencies.Accompanist
import com.composite.dependencies.AndroidX
import com.composite.dependencies.Annotations
import com.composite.dependencies.BuildConfig
import com.composite.dependencies.Coil
import com.composite.dependencies.Compose
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Flavor
import com.composite.dependencies.FlavorDimension
import com.composite.dependencies.Google
import com.composite.dependencies.Hilt
import com.composite.dependencies.Kotlin
import com.composite.dependencies.Kotlinx
import com.composite.dependencies.Libraries
import com.composite.dependencies.debugImplementation
import com.composite.dependencies.implementation
import com.composite.dependencies.kapt
import com.composite.dependencies.ksp

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.devtools.ksp")
    id("com.github.ben-manes.versions") // check for buildSrc/composite build dependencies updates
    id("kotlinx-serialization")
}

android {
    namespace = BuildConfig.APPLICATION_ID
    buildToolsVersion = BuildConfig.BUILD_TOOLS_VERSION

    compileSdk = BuildConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = BuildConfig.APPLICATION_ID
        minSdk = BuildConfig.MIN_SDK_VERSION
        targetSdk = BuildConfig.TARGET_SDK_VERSION
        versionCode = BuildConfig.VERSION_CODE
        versionName = BuildConfig.VERSION_NAME

        vectorDrawables {
            useSupportLibrary = true
        }
    }
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
    buildTypes {
        val debug by getting {
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
        val release by getting {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            // To publish on the Play store a private signing key is required, but to allow anyone
            // who clones the code to sign and run the release variant, use the debug signing key.
            // TODO: Abstract the signing configuration to a separate file to avoid hardcoding this.
            signingConfig = signingConfigs.getByName("debug")
        }
//        val benchmark by creating {
//            // Enable all the optimizations from release build through initWith(release).
//            initWith(release)
//            matchingFallbacks.add("release")
//            // Debug key signing is available to everyone.
//            signingConfig = signingConfigs.getByName("debug")
//            // Only use benchmark proguard rules
//            proguardFiles("benchmark-rules.pro")
//            //  FIXME enabling minification breaks access to demo backend.
//            isMinifyEnabled = false
//            applicationIdSuffix = ".benchmark"
//        }
    }
    // @see Flavor for more details on the app product flavors.
    flavorDimensions += FlavorDimension.contentType.name
    productFlavors {
        Flavor.values().forEach { flavor ->
            create(flavor.name) {
                dimension = flavor.dimension.name
                if (flavor.applicationIdSuffix != null) {
                    applicationIdSuffix = flavor.applicationIdSuffix
                }
            }
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = BuildConfig.javaVersion
        targetCompatibility = BuildConfig.javaVersion
    }
    java {
        sourceCompatibility = BuildConfig.javaVersion
        targetCompatibility = BuildConfig.javaVersion
    }
    kotlinOptions {
        jvmTarget = BuildConfig.javaVersion.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.compilerVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/NOTICE.txt"
            excludes += "META-INF/LICENSE.md"
            excludes += "META-INF/LICENSE-notice.md"
        }
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}


dependencies {
    implementation(Annotations.jetbrainsAnnotations)
    implementation(Annotations.kspApi)

    with(Hilt) {
        implementation(android)
        implementation(work)
        kapt(compiler)
    }

    with(Kotlin) {
        implementation(kotlinStdlib)
        implementation(kotlinReflect)
        implementation(kotlinStdlibJdk)
        implementation(kotlinStdlibJdk7)
        implementation(kotlinStdlibCommon)
    }
    with(Coil) {
        implementation(coil)
        implementation(coilCompose)
        implementation(coilSvg)
    }

    with(Coroutines) {
        implementation(core)
        implementation(coreJvm)
        implementation(android)
    }

    with(Google) {
        implementation(material)
        implementation(playServicesMap)
        implementation(composeMap)
        implementation(composeMapWidgets)
    }

    with(AndroidX) {
        implementation(appCompat)
        implementation(core)
        implementation(coreRuntime)
        implementation(collection)
        implementation(coreKtx)
        implementation(activityKtx)
        implementation(navigationUiKtx)
        implementation(splashScreen)
        coreLibraryDesugaring(desugaringJdkLib)
        implementation(lifecycleRuntime)
        implementation(lifecycleRuntimeKtx)

        implementation(windowManager)
        implementation(profileInstaller)
        implementation(tracing)
        implementation(work)
        implementation(metrics)
        implementation(startup)

        debugImplementation(customView)


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

    with(Kotlinx) {
        implementation(datetime)
        implementation(serialization)
    }

    with(Libraries) {
        implementation(barricade)
        implementation(barricadeAnnotation)
        ksp(barricadeCompiler)
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






