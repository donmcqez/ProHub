package com.composite.dependencies

/**
 * Configuration of build modules
 */
object BuildModules {
    const val APP = ":app"

    const val DOMAIN = ":domain"
    const val NAVIGATOR = ":navigator"

    const val COMPOSE_UI = ":core:compose_ui"
    const val DESIGN = ":core:design"
    const val MODEL = ":core:model"
    const val NETWORK = ":core:network"
    const val COMMON = ":core:common"
    const val NAVIGATION = ":core:navigation"
    const val TESTING = ":core:testing"



    const val LOCAL_DATA = ":data:local"
    const val REMOTE_DATA = ":data:remote"
    const val DATA_REPOSITORY = ":data:repository"

    const val ACCOUNT = ":feature:account"
    const val MEDICAB = ":feature:medicab"
    const val MEDICARE = ":feature:medicare"
    const val CHECK_OUT = ":feature:checkout"
    const val PROFILE = ":feature:profile"
    const val SEARCH = ":feature:search"
    const val SETTINGS = ":feature:settings"
}