package com.tikay.prohub.feature.medicab.navigation

import android.net.Uri
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.medicab.presentation.dashboard.DashboardRoute

/*  
 * Created by TIKAY on Jan 03, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

object MedicabNavigation : ProHubNavigationDestination {
    const val authorIdArg = "authorId"
//    override val route = "medicab_route/{$authorIdArg}"
    override val route = "medicab_route"
    override val destination = "medicab_destination"

    /**
     * Creates destination route for an authorId that could include special characters
     */
    fun createNavigationRoute(authorIdArg: String): String {
        val encodedId = Uri.encode(authorIdArg)
        return "medicab_route/$encodedId"
    }

    /**
     * Returns the authorId from a [NavBackStackEntry] after an author destination navigation call
     */
    fun fromNavArgs(entry: NavBackStackEntry): String {
        val encodedId = entry.arguments?.getString(authorIdArg)!!
        return Uri.decode(encodedId)
    }
}

fun NavGraphBuilder.medicabGraph(
    navigateToTopic: (String) -> Unit,
    navigateToAuthor: (String) -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit
) {
    navigation(
        route = MedicabNavigation.route,
        startDestination = MedicabNavigation.destination
    ) {
        composable(route = MedicabNavigation.destination) {
            DashboardRoute(
                {},{}
            )
        }
        nestedGraphs()
    }
}
