package com.tikay.prohub.feature.medicare.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.medicare.MedicareScreen

/*  
 * Created by TIKAY on Jan 03, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

object MedicareNavigation : ProHubNavigationDestination {
    override val route = "medicare_route"
    override val destination = "medicare_destination"
}

fun NavGraphBuilder.medicareGraph(
    navigateToTopic: (String) -> Unit,
    navigateToAuthor: (String) -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit
) {
    navigation(
        route = MedicareNavigation.route,
        startDestination = MedicareNavigation.destination
    ) {
        composable(route = MedicareNavigation.destination) {
            MedicareScreen()
        }
        nestedGraphs()
    }
}