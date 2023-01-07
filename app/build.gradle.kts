import com.composite.dependencies.BuildModules
import com.composite.dependencies.projectImplementation
import com.composite.dependencies.projectAndroidTestImplementation

plugins {
    id("application_precompiled")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
//    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
}

dependencies { //
    projectImplementation(BuildModules.NAVIGATION)
    projectImplementation(BuildModules.DESIGN)
    projectImplementation(BuildModules.ACCOUNT)
    projectImplementation(BuildModules.MEDICAB)
    projectImplementation(BuildModules.MEDICARE)
    projectImplementation(BuildModules.CHECK_OUT)
    projectImplementation(BuildModules.PROFILE)
    projectImplementation(BuildModules.SETTINGS)

    projectAndroidTestImplementation(BuildModules.TESTING)
}

secrets {
    // To add your Maps API key to this project:
    // 1. Add this line to your local.properties file, where YOUR_API_KEY is your API key:
    // MAPS_API_KEY=YOUR_API_KEY
    // defaultPropertiesFileName 'local.properties'
    defaultPropertiesFileName = "local.properties"
}
