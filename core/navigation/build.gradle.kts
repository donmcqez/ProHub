import com.composite.dependencies.Compose
import com.composite.dependencies.api

plugins {
    id("core_precompiled")
}

dependencies {
    with(Compose) {
        api(navigation)
        api(hiltNavigationCompose)
    }
}
