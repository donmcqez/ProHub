package com.composite.dependencies

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependencyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
//        config(project)
    }

//    private fun config(project: Project) {
//        project.allprojects {
//            android.apply {
//                buildToolsVersion = BuildConfig.BUILD_TOOLS_VERSION
//
//                applicationVariants.all {
//                    kotlin.sourceSets {
//                        getByName(name) {
//                            kotlin.srcDir("build/generated/ksp/$name/kotlin")
//                        }
//                    }
//                }
//            }
//        }
//    }
}

