package com.tikay.prohub.core.model

data class Profession(
    val name: String,
    val licence: String,
    val licenceExpirationYear: String,
    val association: String,
    val proType: Category = HealthCategory.DOCTOR
)

interface Category{
    fun getName():String
}


enum class General : Category {
    HEALTH, EDUCATION, SECURITY, JUDICIARY, ENGINEERING, CIVIL_SERVANT, FINANCE;
    override fun getName() = name
}
enum class HealthCategory : Category {
    DOCTOR, NURSE, PHARMACIST, LAB_TECHNICIAN, ANAESTHETIST, MIDWIFE;

    override fun getName() = name
}