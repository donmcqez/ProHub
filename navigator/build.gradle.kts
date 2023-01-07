import com.composite.dependencies.*

plugins {
    id("base_android_precompiled")
}

dependencies {
//    projectImplementation(BuildModules.DESIGN)
    projectImplementation(BuildModules.ACCOUNT)
    projectImplementation(BuildModules.MEDICAB)
    projectImplementation(BuildModules.MEDICARE)
    projectImplementation(BuildModules.CHECK_OUT)
    projectImplementation(BuildModules.PROFILE)
    projectImplementation(BuildModules.SETTINGS)
}
