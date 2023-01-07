package com.tikay.prohub.core.model

data class IdCard(
    val userId: String,
    val type: IdType
)

enum class IdType(private val type: String) {
    National("national"),
    Passport("passport");

    operator fun invoke() = type
}
