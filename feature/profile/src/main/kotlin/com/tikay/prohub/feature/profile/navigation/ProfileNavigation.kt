package com.tikay.prohub.feature.profile.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.profile.ProfileScreen

/*  
 * Created by TIKAY on Jan 03, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

object ProfileNavigation : ProHubNavigationDestination {
    override val route = "profile_route"
    override val destination = "profile_destination"
}

fun NavGraphBuilder.profileGraph() {
    navigation(
        route = ProfileNavigation.route,
        startDestination =  ProfileNavigation.destination
    ) {
        composable(route = ProfileNavigation.destination) {
            ProfileScreen()
        }
        composable(route = "test") {
            ProfileScreen()
        }
    }
}