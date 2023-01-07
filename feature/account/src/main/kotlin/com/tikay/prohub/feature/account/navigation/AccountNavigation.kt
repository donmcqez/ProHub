package com.tikay.prohub.feature.account.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.account.AccountScreen

/*  
 * Created by TIKAY on Jan 03, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

object AccountNavigation : ProHubNavigationDestination {
    override val route = "account_route"
    override val destination = "account_destination"
}

fun NavGraphBuilder.accountGraph() {
    composable(route = AccountNavigation.route) {
        AccountScreen()
    }
}
