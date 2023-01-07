package com.composite.dependencies

object Annotations {
    private const val jetbrainsAnnotationsVersion = "23.0.0"
    const val jetbrainsAnnotations = "org.jetbrains:annotations:$jetbrainsAnnotationsVersion"

    private const val ktxSerializationJsonVersion = "1.3.3"
    const val ktxSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:$ktxSerializationJsonVersion"

//    private const val kspApiVersion = "1.7.10-1.0.6"
    private const val kspVersion = "1.7.20-Beta-1.0.6"
    const val kspApi = "com.google.devtools.ksp:symbol-processing-api:$kspVersion"
}