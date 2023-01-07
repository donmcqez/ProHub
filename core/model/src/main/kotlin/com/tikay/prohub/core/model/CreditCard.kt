package com.tikay.prohub.core.model

data class CreditCard(
    val id: String,
    val brand: String,
    val name: String,
    val expirationMonth: String,
    val expirationYear: String,
    val lastDigits: String,
    val defaultCard:Boolean=false,
    val type: CardType
)

enum class CardType {
    VISA,
    MASTER_CARD
}
