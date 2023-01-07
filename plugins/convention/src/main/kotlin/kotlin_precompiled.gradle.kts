import com.composite.dependencies.BuildConfig

plugins {
    id("java-library")
    id("kotlin")
}

java {
    sourceCompatibility = BuildConfig.javaVersion
    targetCompatibility = BuildConfig.javaVersion
}