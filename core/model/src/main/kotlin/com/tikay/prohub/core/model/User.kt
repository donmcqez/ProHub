package com.tikay.prohub.core.model

interface UserInterface {
    val id: String
    val firstName: String
    val lastName: String
    val phone: String
    val email:String
    val image:String
    val address: Address
}

sealed interface User : UserInterface{
    data class Agent(
        override val id: String,
        override val firstName: String,
        override val lastName: String,
        override val phone: String,
        override val email: String,
        override val address: Address,
        val idCard: IdCard,
        val licenceNumber: String,
        val specialty:String,
        override val image: String,
    ) : User

    data class Client(
        override val id: String,
        override val firstName: String,
        override val lastName: String,
        override val phone: String,
        override val email: String,
        override val address: Address,
        override val image: String,
        val ratingAvg:Float = 0F
    ) : User
}



data class Doctor(
    val id: String,
    val name: String
) {
    fun checkUser(user: User){
        val client = User.Client(id, name, "", "", "", Address("", "", ""), "")
        when(user){
            is User.Agent -> {
                user.firstName
            }
            is User.Client -> {

            }
        }
    }
}


//data class User(
//    val id: String,
//    val firstName: String,
//    val lastName: String,
//    val phone: String,
//    val accountType: AccountType,
//    val idCard: IdCard
//)
//
//enum class AccountType(private val type: String) {
//    Agent("agent"),
//    Client("client");
//
//    operator fun invoke() = type
//}