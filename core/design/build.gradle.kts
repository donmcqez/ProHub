import com.composite.dependencies.*

plugins {
    id("compose_precompiled")
}

dependencies {
    implementation(AndroidX.splashScreen)

    with(Google) {
        implementation(material)
        implementation(playServicesMap)
        implementation(composeMap)
        implementation(composeMapWidgets)
    }
}
