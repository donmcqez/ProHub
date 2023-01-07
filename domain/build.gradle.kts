import com.composite.dependencies.*

plugins {
    id("base_android_precompiled")
}

dependencies {
    projectApi(BuildModules.MODEL)
    projectTestImplementation(BuildModules.TESTING)
    implementation(Libraries.store)
}

kapt {
    correctErrorTypes = true
}
