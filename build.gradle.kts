// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
        classpath("com.savvasdalkitsis:module-dependency-graph:0.10") // module dependency graphs

        // [com.github.ben-manes:gradle-versions-plugin:0.42.0] check for buildSrc/composite build dependencies updates
        // run `gradle dependencyUpdates`
        classpath("com.github.ben-manes:gradle-versions-plugin:0.42.0")
        classpath("com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:1.7.20-1.0.6")
        classpath("com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:2.0.1")
    }
}
apply(plugin = "com.savvasdalkitsis.module-dependency-graph") // ./gradlew graphModules

plugins {
    id("com.android.application").version("7.3.1").apply(false)
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("android").version("1.7.20").apply(false)
    id("org.jlleitschuh.gradle.ktlint").version("11.0.0")
    id("org.jetbrains.kotlin.plugin.serialization").version("1.7.20")
    id("com.savvasdalkitsis.module-dependency-graph").version("0.10")
//    id("com.diffplug.gradle.spotless") version "6.12.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

subprojects { //
    afterEvaluate {
        tasks["ktlintCheck"].dependsOn(tasks["ktlintFormat"])
//        tasks["ktlintTestSourceSetCheck"].dependsOn(tasks["ktlintTestSourceSetFormat"])
    }
}

allprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint") // version should be inherited from parent

    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        debug.set(true)
        verbose.set(true)
        android.set(true)
        outputToConsole.set(true)
        outputColorName.set("RED")
        ignoreFailures.set(false)
//        enableExperimentalRules.set(true)
//        disabledRules.set(setOf("final-newline"))
//        additionalEditorconfigFile.set(file("/.editorconfig"))
        baseline.set(file("uberclone-ktlint-baseline.xml"))
        reporters {
            reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
            reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.JSON)
        }
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }

    afterEvaluate {
//        if (gradle.startParameter.taskNames.contains(":app:assembleDebug")) {
//            tasks["ktlintKotlinScriptCheck"].dependsOn(tasks["ktlintKotlinScriptFormat"])
//            println("Formatting scripts")
//        } else {
//            println("Formatting scripts did not work")
//        }
        tasks["ktlintKotlinScriptCheck"].dependsOn(tasks["ktlintKotlinScriptFormat"])
//            .dependsOn(tasks[":app:assembleDebug"])
    }
}
