package com.composite.dependencies

object Google {
    private const val materialVersion = "1.6.1"
    const val material = "com.google.android.material:material:$materialVersion"

    private const val androidAnnotationsVersion = "30.2.2"
    const val androidAnnotations = "com.android.tools:annotations:$androidAnnotationsVersion"

    //google maps compose
    private const val playServiceMapsVersion = "18.1.0"
    const val playServicesMap = "com.google.android.gms:play-services-maps:$playServiceMapsVersion"
    private const val composeMapsVersion = "2.7.0"
    const val composeMap =  "com.google.maps.android:maps-compose:$composeMapsVersion"
    const val composeMapWidgets = "com.google.maps.android:maps-compose-widgets:$composeMapsVersion"
    private const val googleWalletVersion = "18.0.0"
    const val googleWallet = "com.google.android.gms:play-services-wallet:$googleWalletVersion"
}