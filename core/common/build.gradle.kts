import com.composite.dependencies.Coroutines
import com.composite.dependencies.implementation
import com.composite.dependencies.projectTestImplementation
import com.composite.dependencies.BuildModules

plugins {
    id("core_precompiled")
}

dependencies {
    with(Coroutines) {
        implementation(android)
    }

    projectTestImplementation(BuildModules.TESTING)
}

kapt {
    correctErrorTypes = true
}
