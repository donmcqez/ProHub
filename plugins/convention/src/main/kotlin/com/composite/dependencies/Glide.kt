package com.composite.dependencies

object Glide {
    private const val glideVersion = "4.12.0"
    val glide by lazy { "com.github.bumptech.glide:glide:$glideVersion" }
    val glide_okhttp3 by lazy { "com.github.bumptech.glide:okhttp3-integration:$glideVersion" }
    val glideCompiler by lazy { "com.github.bumptech.glide:compiler:$glideVersion" }
}