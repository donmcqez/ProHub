import com.composite.dependencies.projectTestImplementation
import com.composite.dependencies.BuildModules
import com.composite.dependencies.projectImplementation

plugins {
    id("network_precompiled")
}

dependencies {
    // implement optional dependencies
    projectImplementation(BuildModules.COMMON)
    projectTestImplementation(BuildModules.TESTING)
}
