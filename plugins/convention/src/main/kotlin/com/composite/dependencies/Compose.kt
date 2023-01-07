package com.composite.dependencies

object Compose {
//    const val version = "1.2.0-rc03"
//    const val version = "1.3.0-beta01"
//    const val version = "1.3.0-beta02"
    const val androidxVersion = "1.3.0"

    const val animation = "androidx.compose.animation:animation:$androidxVersion"
    const val animationCore = "androidx.compose.animation:animation-core:$androidxVersion"

    const val ui = "androidx.compose.ui:ui:$androidxVersion"
    const val uiUtil = "androidx.compose.ui:ui-util:$androidxVersion"
    const val uiTooling = "androidx.compose.ui:ui-tooling:$androidxVersion"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$androidxVersion"
    const val uiTest = "androidx.compose.ui:ui-test-junit4:$androidxVersion"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$androidxVersion"

    const val material = "androidx.compose.material:material:$androidxVersion"
    const val materialIconExt = "androidx.compose.material:material-icons-extended:$androidxVersion"


    const val viewBinding = "androidx.compose.ui:ui-viewbinding:$androidxVersion"
    const val foundation = "androidx.compose.foundation:foundation:$androidxVersion"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:$androidxVersion"
    const val composeRuntime = "androidx.compose.runtime:runtime:$androidxVersion"

    //    const val compilerVersion = "1.3.0-rc01"
//    const val compilerVersion = "1.3.0"
    const val compilerVersion = "1.3.2"
    const val compiler = "androidx.compose.compiler:compiler:$compilerVersion"

//    private const val activityVersion = "1.5.1"
//    private const val activityVersion = "1.6.0-rc02"
    private const val activityVersion = "1.6.1"
    const val activityCompose = "androidx.activity:activity-compose:$activityVersion"

//    private const val material3Version = "1.0.0-beta01"
    private const val material3Version = "1.0.0-beta02"
    const val material3 = "androidx.compose.material3:material3:$material3Version"
    const val material3WindowSizeClass = "androidx.compose.material3:material3-window-size-class:$material3Version"

    private const val navigationVersion = "2.5.1"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

//    private const val destinationsVersion = "1.7.16-beta"
    private const val destinationsVersion = "1.7.19-beta"
    const val destinations = "io.github.raamcosta.compose-destinations:core:$destinationsVersion"
    const val destinationsKsp = "io.github.raamcosta.compose-destinations:ksp:$destinationsVersion"

    private const val constraintLayoutVersion = "1.0.1"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:$constraintLayoutVersion"

    private const val pagingVersion = "1.0.0-alpha14"
    const val paging = "androidx.paging:paging-compose:$pagingVersion"

    private const val hiltNavigationVersion = "1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationVersion"

    private  const val viewModelVersion = "2.5.1"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelVersion"
    const val runtimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:2.6.0-alpha01"
    // https://coil-kt.github.io/coil/compose/
    const val coilCompose =  "io.coil-kt:coil-compose:${Coil.version}"

    private const val dateTimePickerVersion = "0.8.1-rc"
    const val dateTimePicker = "io.github.vanpra.compose-material-dialogs:datetime:$dateTimePickerVersion"
}


object ComposeTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.androidxVersion}"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.androidxVersion}"
}