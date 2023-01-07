import com.composite.dependencies.BuildModules
import com.composite.dependencies.projectImplementation
import com.composite.dependencies.projectTestImplementation

plugins {
    id("database_precompiled")
}

dependencies {
//    projectImplementation(BuildModules.MODEL)
//    projectImplementation(BuildModules.DOMAIN)
    projectImplementation(BuildModules.DATA_REPOSITORY)
    projectTestImplementation(BuildModules.TESTING)

//    addLocalTestsDependencies()
//    addUITestsDependencies()
//    addHiltTestsDependencies()
}
