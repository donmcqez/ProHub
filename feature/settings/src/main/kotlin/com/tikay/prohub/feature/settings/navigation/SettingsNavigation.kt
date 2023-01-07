package com.tikay.prohub.feature.settings.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.settings.SettingsScreen

/*  
 * Created by TIKAY on Jan 03, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

object SettingsNavigation : ProHubNavigationDestination {
    override val route = "medicab_route"
    override val destination = "medicab_destination"
}

fun NavGraphBuilder.settingsGraph(
    nestedGraphs: NavGraphBuilder.() -> Unit

) {
    composable(route = SettingsNavigation.route) {
        SettingsScreen()
    }
}