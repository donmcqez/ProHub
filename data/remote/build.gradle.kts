import com.composite.dependencies.BuildModules
import com.composite.dependencies.addHiltTestsDependencies
import com.composite.dependencies.addLocalTestsDependencies
import com.composite.dependencies.addUITestsDependencies
import com.composite.dependencies.projectImplementation
import com.composite.dependencies.projectTestImplementation

plugins {
    id("data_precompiled")
}

dependencies {
//    projectImplementation(BuildModules.MODEL)
//    projectImplementation(BuildModules.DOMAIN)
    projectImplementation(BuildModules.DATA_REPOSITORY)
    projectImplementation(BuildModules.NETWORK)
    projectTestImplementation(BuildModules.TESTING)

//    projectImplementation(BuildModules.TESTING)

//    addLocalTestsDependencies()
//    addUITestsDependencies()
//    addHiltTestsDependencies()
}
