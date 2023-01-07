package com.composite.dependencies

object AndroidX {
    private const val androidxAnnotationsVersion = "1.3.0"
    const val annotations = "androidx.annotation:annotation:$androidxAnnotationsVersion"

//    private const val coreVersion = "1.8.0"
    private const val coreVersion = "1.9.0"
    const val core = "androidx.core:core:$coreVersion"
    const val coreKtx = "androidx.core:core-ktx:$coreVersion"

//    private const val appCompatVersion = "1.5.0"
    private const val appCompatVersion = "1.6.0-beta01"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

    private const val browserVersion = "1.4.0"
    const val browser = "androidx.browser:browser:$browserVersion"

    private const val cardviewVersion = "1.0.0"
    const val cardView = "androidx.cardview:cardview:$cardviewVersion"

    private const val collectionVersion = "1.1.0"
    const val collection = "androidx.collection:collection-ktx:$collectionVersion"

    private const val coreRuntimeVersion = "2.1.0"
    const val coreRuntime = "androidx.arch.core:core-runtime:$coreRuntimeVersion"

    private const val emojiVersion = "1.1.0"
    const val emoji = "androidx.emoji:emoji:$emojiVersion"

    //////////////////////////////        LIFECYCLE             \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private const val commonJava8Version = "2.5.1"
    const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$commonJava8Version"

    private const val lifecycleRuntimeVersion = "2.5.1"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:$lifecycleRuntimeVersion"

    private const val lifecycleRuntimeKtxVersion = "2.5.1"
    const val lifecycleRuntimeKtx =  "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimeKtxVersion"

    private const val extensionVersion = "2.2.0"
    const val extension  = "androidx.lifecycle:lifecycle-extensions:$extensionVersion"

    private const val viewModelVersion = "2.5.1"
    const val viewModelKtx =  "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModelVersion"

    ////////////////////////////////////////////////////////////////////////////////////////////////


    //////////////////////////////////       PAGING       \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    private const val pagingVersion = "3.1.0"
    const val pagingCommon  = "androidx.paging:paging-common-ktx:$pagingVersion"
    const val pagingRuntime =  "androidx.paging:paging-runtime-ktx:$pagingVersion"

    ////////////////////////////////////////////////////////////////////////////////////////////////


    private const val workRuntimeVersion = "2.7.0"
    const val workRuntime = "androidx.work:work-runtime-ktx:$workRuntimeVersion"

    private const val constraintLayoutVersion = "2.1.2"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    private const val recyclerViewVersion = "1.2.1"
    const val recyclerView = "androidx.recyclerview:recyclerview:$recyclerViewVersion"

    private const val swipeRefreshVersion = "1.1.0"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshVersion"

//    private const val activityKtxVersion = "1.4.0"
    private const val activityKtxVersion = "1.6.0-rc01"
    const val activityKtx = "androidx.activity:activity-ktx:$activityKtxVersion"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$activityKtxVersion"

    private const val transitionVersion = "1.4.1"
    const val transition = "androidx.transition:transition:$transitionVersion"

    private const val paletteKtxVersion = "1.0.0"
    const val paletteKtx = "androidx.palette:palette-ktx:$paletteKtxVersion"

    private const val preferenceKtxVersion = "1.1.1"
    const val preferenceKtx = "androidx.preference:preference-ktx:$preferenceKtxVersion"

    private const val percentageLayoutVersion = "1.0.0"
    const val percentLayout = "androidx.percentlayout:percentlayout:$percentageLayoutVersion"

    private const val multidexVersion = "2.0.1"
    const val multidex = "androidx.multidex:multidex:$multidexVersion"

    private const val gridlayoutVersion = "1.0.0"
    const val gridlayout = "androidx.gridlayout:gridlayout:$gridlayoutVersion"

    private const val legacyVersion = "1.0.0"
    const val legacySupport_V4 = "androidx.legacy:legacy-support-v4:$legacyVersion"
    const val legacySupport_V13 = "androidx.legacy:legacy-support-v13:$legacyVersion"
    const val legacySupportCoreUtils = "androidx.legacy:legacy-support-core-utils:$legacyVersion"

    private const val vectorDrawableVersion = "1.1.0"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:$vectorDrawableVersion"
    const val vectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:$vectorDrawableVersion"

    private const val navigationUiVersion = "2.5.1"
    const val navigationUi = "androidx.navigation:navigation-ui:$navigationUiVersion"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$navigationUiVersion"

    private const val fragmentKtxVersion = "2.3.5"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$fragmentKtxVersion"

    private const val viewpager2Version = "1.1.0"
    const val viewpager2 = "androidx.viewpager2:viewpager2:$viewpager2Version"

    private const val dynamicAnimationVersion = "1.1.0-alpha03"
    const val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation:$dynamicAnimationVersion"

    private const val dataStoreVersion = "1.0.0"
    const val dataStorePreference = "androidx.datastore:datastore-preferences:$dataStoreVersion"
    const val dataStorePreferenceCore = "androidx.datastore:datastore-preferences-core:$dataStoreVersion"

    private const val androidxCryptoVersion = "1.1.0-alpha03"
    const val crypto = "androidx.security:security-crypto:$androidxCryptoVersion"

    private const val splashScreenVersion = "1.0.0"
    const val splashScreen = "androidx.core:core-splashscreen:$splashScreenVersion"

    private const val androidxMetricsVersion = "1.0.0-alpha03"
    const val metrics = "androidx.metrics:metrics-performance:$androidxMetricsVersion"

    private const val savedStateVersion = "1.2.0"
    const val savedState = "androidx.savedstate:savedstate-ktx:$savedStateVersion"

    private const val startupVersion = "1.1.1"
    const val startup = "androidx.startup:startup-runtime:$startupVersion"

    private const val profileInstallerVersion = "1.2.0-rc01"
    const val profileInstaller = "androidx.profileinstaller:profileinstaller:$profileInstallerVersion"

    private const val androidxCustomViewVersion = "1.0.0"
    const val customView = "androidx.customview:customview-poolingcontainer:$androidxCustomViewVersion"

    private const val androidxMacroBenchmarkVersion = "1.1.0"
    const val macroBenchmark = "androidx.benchmark:benchmark-macro-junit4:$androidxMacroBenchmarkVersion"

    private const val androidxWorkVersion = "2.7.1"
    const val work = "androidx.work:work-runtime-ktx:$androidxWorkVersion"

    private const val androidxTracingVersion = "1.1.0"
    const val tracing = "androidx.tracing:tracing-ktx:$androidxTracingVersion"

    private const val  androidxWindowManagerVersion = "1.0.0"
    const val windowManager = "androidx.window:window:$androidxWindowManagerVersion"

    private const val desugarJdkLibsVersion = "1.1.5"
    const val desugaringJdkLib = "com.android.tools:desugar_jdk_libs:$desugarJdkLibsVersion"

    private const val turbineVersion = "0.8.0"
    const val turbine = "com.android.tools:desugar_jdk_libs:$desugarJdkLibsVersion"

//    androidx-metrics = { group = "androidx.metrics", name = "metrics-performance", version.ref = "androidxMetrics" }
}
