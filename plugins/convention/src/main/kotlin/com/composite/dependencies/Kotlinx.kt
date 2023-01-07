package com.composite.dependencies

object Kotlinx {
    private const val kotlinxDatetimeVersion = "0.4.0"
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:$kotlinxDatetimeVersion"

    // Need for tests. Plugin doesn't work.
//    private const val serializationVersion = "1.2.2"
    private const val serializationVersion = "1.4.0"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion"

}