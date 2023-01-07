package com.tikay.prohub.core.design.util

import androidx.navigation.NavController

fun NavController.clearAndNavigate(
    clearDestination: String,
    navigateToDestination: String,
) {
    navigate(navigateToDestination) {
        popUpTo(clearDestination) {
            inclusive = true
        }
    }
}
