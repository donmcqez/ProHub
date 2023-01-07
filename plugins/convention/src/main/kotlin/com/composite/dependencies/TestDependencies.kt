package com.composite.dependencies

/**
 * Project test dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object TestDependencies {
    private const val junitVersion = "4.13.2"
    const val JUNIT = "junit:junit:$junitVersion"

    private const val truthVersion = "1.1.3"
    const val TRUTH = "com.google.truth:truth:$truthVersion"

    private const val coroutineTestVersion = "1.6.4"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutineTestVersion"

//    private const val mockitoVersion = "2.23.0"
    private const val mockitoVersion = "4.8.0"
    const val MOCKITO = "org.mockito:mockito-core:$mockitoVersion"

    private const val hamcrestVersion = "1.3"
    const val HAMCREST = "org.hamcrest:hamcrest-all:$hamcrestVersion"

//    private const val robolectricVersion = "4.7.3"
    private const val robolectricVersion = "4.8.2"
    const val ROBO_ELECTRIC = "org.robolectric:robolectric:$robolectricVersion"

    private const val mockWebserverVersion = "4.9.1"
    const val MOCK_WEBSERVER = "com.squareup.okhttp3:mockwebserver:$mockWebserverVersion"

//    private const val mockVersion = "1.12.4"
    private const val mockVersion = "1.12.7"
    const val MOCKK = "io.mockk:mockk:$mockVersion"

    private const val dexmakerMockitoVersion = "2.12.1"
    const val DEXMAKER_MOCKITO = "com.linkedin.dexmaker:dexmaker-mockito:$dexmakerMockitoVersion"

    private const val coreAndroidxVersion = "1.4.0"
    const val ANDROIDX_CORE = "androidx.test:core:$coreAndroidxVersion"
    const val ANDROIDX_CORE_KTX = "androidx.test:core-ktx:$coreAndroidxVersion"
    const val ANDROIDX_RUNNER = "androidx.test:runner:$coreAndroidxVersion"
    const val ANDROIDX_RULES = "androidx.test:rules:$coreAndroidxVersion"

    private const val androidxJunitVersion: String = "1.1.3"
    const val ANDROIDX_EXT_JUNIT = "androidx.test.ext:junit:$androidxJunitVersion"
    const val ANDROIDX_EXT_JUNIT_KTX = "androidx.test.ext:junit-ktx:$androidxJunitVersion"

    private const val androidxCoreTestingVersion: String = "2.1.0"
    const val ANDROIDX_ARCH_CORE = "androidx.arch.core:core-testing:$androidxCoreTestingVersion"

    private const val androidxEspressoVersion: String = "3.4.0"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:$androidxEspressoVersion"

    const val HILT_TEST = "com.google.dagger:hilt-android-testing:${Hilt.version}"
    const val HILT_KAPT = "com.google.dagger:hilt-compiler:${Hilt.version}"

    const val COMPOSE_UI_TEST = "androidx.compose.ui:ui-test-junit4:${Compose.androidxVersion}"
    const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest:${Compose.androidxVersion}"

}