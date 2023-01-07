package com.composite.dependencies

import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * Adds a dependency to the `implementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.implementation(dependencyNotation: String): Dependency? =
    add("implementation", dependencyNotation)

/**
 * Adds a dependency to the `api` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.api(dependencyNotation: String): Dependency? =
    add("api", dependencyNotation)

/**
 * Adds a dependency to the `kapt` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.kapt(dependencyNotation: String): Dependency? =
    add("kapt", dependencyNotation)

fun DependencyHandler.ksp(dependencyNotation: String): Dependency? =
    add("ksp", dependencyNotation)

/**
 * Adds a dependency to the `androidTestImplementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.androidTestImplementation(dependencyNotation: String): Dependency? =
    add("androidTestImplementation", dependencyNotation)

fun DependencyHandler.androidTestApi(dependencyNotation: String): Dependency? =
    add("androidTestApi", dependencyNotation)

/**
 * Adds a dependency to the `debugImplementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.debugImplementation(dependencyNotation: String): Dependency? =
    add("debugImplementation", dependencyNotation)

/**
 * Adds a dependency to the `kaptTest` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.kaptTest(dependencyNotation: String): Dependency? =
    add("kaptTest", dependencyNotation)

/**
 * Adds a dependency to the `kaptAndroidTest` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.kaptAndroidTest(dependencyNotation: String): Dependency? =
    add("kaptAndroidTest", dependencyNotation)

/**
 * Adds a dependency to the `testImplementation` configuration.
 *
 * @param dependencyNotation name of dependency to add at specific configuration
 *
 * @return the dependency
 */
fun DependencyHandler.testImplementation(dependencyNotation: String): Dependency? =
    add("testImplementation", dependencyNotation)

fun Project.projectImplementation(module: String) {
    dependencies.add("implementation", project(module))
}
fun Project.projectTestImplementation(module: String) {
    dependencies.add("testImplementation", this.project(module))
}
fun Project.projectAndroidTestImplementation(module: String) {
    dependencies.add("androidTestImplementation", this.project(module))
}
fun Project.projectApi(module: String) {
    dependencies.add("api", this.project(module))
}

/**
 * Adds all the tests dependencies to specific configuration.
 */
fun DependencyHandler.addLocalTestsDependencies() {
    testImplementation(TestDependencies.ANDROIDX_CORE)
    testImplementation(TestDependencies.ANDROIDX_CORE_KTX)
    testImplementation(TestDependencies.ANDROIDX_ARCH_CORE)
    testImplementation(TestDependencies.ANDROIDX_RULES)
    testImplementation(TestDependencies.ANDROIDX_RUNNER)
    testImplementation(TestDependencies.ANDROIDX_EXT_JUNIT)
    testImplementation(TestDependencies.ANDROIDX_EXT_JUNIT_KTX)
    testImplementation(TestDependencies.COROUTINES)
    testImplementation(TestDependencies.JUNIT)
    testImplementation(TestDependencies.MOCKK)
    testImplementation(TestDependencies.MOCKITO)
    testImplementation(TestDependencies.MOCK_WEBSERVER)
    testImplementation(TestDependencies.ROBO_ELECTRIC)
    testImplementation(TestDependencies.TRUTH)
}


fun DependencyHandler.addComposeTestsDependencies() {
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.2.0")
    debugImplementation("androidx.compose.ui:ui-tooling:${com.composite.dependencies.Compose.androidxVersion}")
}

fun DependencyHandler.addHiltTestsDependencies() {
    testImplementation(TestDependencies.HILT_TEST)
    kaptTest(TestDependencies.HILT_KAPT)
    androidTestImplementation(TestDependencies.HILT_TEST)
    kaptAndroidTest(TestDependencies.HILT_KAPT)
}

fun DependencyHandler.addUITestsDependencies() {
    androidTestImplementation(TestDependencies.ANDROIDX_CORE)
    androidTestImplementation(TestDependencies.ANDROIDX_CORE_KTX)
    androidTestImplementation(TestDependencies.ANDROIDX_ARCH_CORE)
    androidTestImplementation(TestDependencies.ANDROIDX_EXT_JUNIT)
    androidTestImplementation(TestDependencies.ANDROIDX_EXT_JUNIT_KTX)
    androidTestImplementation(TestDependencies.ANDROIDX_RULES)
    androidTestImplementation(TestDependencies.ANDROIDX_RUNNER)
    androidTestImplementation(TestDependencies.COROUTINES)
    androidTestImplementation(TestDependencies.ESPRESSO_CORE)
    androidTestImplementation(TestDependencies.JUNIT)
    androidTestImplementation(TestDependencies.MOCK_WEBSERVER)
    androidTestImplementation(TestDependencies.MOCKK)
    androidTestImplementation(TestDependencies.MOCKITO)
    androidTestImplementation(TestDependencies.ROBO_ELECTRIC)
    androidTestImplementation(TestDependencies.TRUTH)

}

fun DependencyHandlerScope.kotlinProject() {
    implementation(Kotlin.kotlinStdlib)
}
fun DependencyHandlerScope.composeDependencies() {
    with(Compose) {
        implementation(activityCompose)
        implementation(material)
        implementation(material3)
        implementation(materialIconExt)
        implementation(animation)
        implementation(animationCore)
        implementation(foundation)
        implementation(foundationLayout)
        implementation(constraintLayout)
        implementation(navigation)
        implementation(composeRuntime)
        implementation(runtimeCompose)
        implementation(viewBinding)
        implementation(uiTooling)
        debugImplementation(uiTooling)
        implementation(uiToolingPreview)
        implementation(ui)
        implementation(uiUtil)
        implementation(material)
        implementation(dateTimePicker)
        implementation(viewModelCompose)
        implementation(hiltNavigationCompose)

        implementation(destinations)
        ksp(destinationsKsp)
    }

    with(Accompanist) {
        implementation(material)
        implementation(animation)
        implementation(flowLayout)
        implementation(swipeRefresh)
        implementation(pager)
        implementation(pagerIndicator)
        implementation(insets)
        implementation(insetsUi)
        implementation(navigationAnimation)
        implementation(systemUiController)
    }

}
