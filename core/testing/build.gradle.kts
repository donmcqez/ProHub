import com.composite.dependencies.BuildModules
import com.composite.dependencies.projectImplementation

plugins {
    id("testing_precompiled")
}

dependencies {
    // implement optional dependencies
//    projectImplementation(BuildModules.COMMON)
    projectImplementation(BuildModules.MODEL)
}

kapt {
    correctErrorTypes = true
//    useBuildCache = true
}
