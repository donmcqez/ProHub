import com.composite.dependencies.implementation
import com.composite.dependencies.Google

plugins {
    id("feature_precompiled")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

dependencies {
    with(Google) {
        implementation(playServicesMap)
        implementation(composeMap)
        implementation(composeMapWidgets)
        implementation(googleWallet)
    }
}