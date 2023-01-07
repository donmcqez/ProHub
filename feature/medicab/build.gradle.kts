import com.composite.dependencies.Google
import com.composite.dependencies.implementation

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
