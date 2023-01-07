package com.composite.dependencies

object Emoji {
    private const val version = "0.8.0"
    val emojiIos by lazy { "com.vanniktech:emoji-ios:${com.composite.dependencies.Emoji.version}" }
    val emojiGoogle by lazy { "com.vanniktech:emoji-google:${com.composite.dependencies.Emoji.version}" }
    val emojiTwitter by lazy { "com.vanniktech:emoji-twitter:${com.composite.dependencies.Emoji.version}" }
    val emojiMaterial by lazy { "com.vanniktech:emoji-material:${com.composite.dependencies.Emoji.version}" }
}