pluginManagement {
    includeBuild("plugins")

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ProHub"

include(":app")
include(":domain")

include(":core:common")
include(":core:design")
include(":core:model")
include(":core:navigation")
include(":core:network")
include(":core:testing")

include(":data:local")
include(":data:remote")
include(":data:repository")

include(":feature:account")
include(":feature:checkout")
include(":feature:profile")
include(":feature:medicab")
include(":feature:medicare")
include(":feature:settings")
