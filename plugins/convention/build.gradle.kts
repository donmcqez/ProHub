plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
    id("com.google.devtools.ksp") version "1.7.20-1.0.6"
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
    kotlin("jvm") version "1.7.20"
    kotlin("plugin.serialization") version "1.7.20"
}

group = "com.tikay.prohub.buildLogic"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

gradlePlugin {

    plugins {
        create("dependencies") {
            id = "tikay.composite.dependencies"
            implementationClass = "com.composite.dependencies.DependencyPlugin"
        }
    }

}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("com.android.tools.build:gradle-api:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.7.20")
        classpath("com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:2.0.1")
    }
}


// dependencies for precompiled gradle scripts
dependencies {
    // Add dependency on  Kotlin Gradle plugin to apply and use it classes
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.7.20")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    implementation("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.7.20-1.0.6")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
    implementation("com.android.tools.build:gradle:7.3.1")
    implementation("com.android.tools.build:gradle-api:7.3.1")
    implementation("com.squareup:javapoet:1.13.0")
    implementation("com.github.ben-manes:gradle-versions-plugin:0.42.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.20")
    implementation("com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:2.0.1")
}
