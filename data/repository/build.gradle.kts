import com.composite.dependencies.BuildModules
import com.composite.dependencies.Coroutines
import com.composite.dependencies.Libraries
import com.composite.dependencies.Retrofit
import com.composite.dependencies.implementation
import com.composite.dependencies.projectImplementation
import com.composite.dependencies.projectTestImplementation

plugins {
    id("data_precompiled")
}

dependencies {
    // implement optional dependencies
    projectImplementation(BuildModules.DOMAIN)
    projectTestImplementation(BuildModules.TESTING)
//    projectImplementation(BuildModules.TESTING)
    with(Coroutines) {
        implementation(core)
    }

    with(Retrofit) {
        implementation(okhttp)
    }
    implementation(Libraries.store)
}
