/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tikay.prohub.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.util.trace
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.tikay.prohub.core.design.icon.Icon
import com.tikay.prohub.core.design.icon.ProHubIcons
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.account.navigation.AccountNavigation
import com.tikay.prohub.feature.medicab.navigation.MedicabNavigation
import com.tikay.prohub.feature.medicare.navigation.MedicareNavigation
import com.tikay.prohub.navigation.TopLevelDestination
import com.tikay.prohub.feature.medicab.R as medicabR
import com.tikay.prohub.feature.medicare.R as medicareR
import com.tikay.prohub.feature.profile.R as profileR
import com.tikay.prohub.feature.account.R as accountR

//val navController = rememberAnimatedNavController()
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun rememberNiaAppState(
    windowSizeClass: WindowSizeClass,
    navController: NavHostController = rememberAnimatedNavController()
): NiaAppState {
    NavigationTrackingSideEffect(navController)
    return remember(navController, windowSizeClass) {
        NiaAppState(navController, windowSizeClass)
    }
}

@Stable
class NiaAppState(
    val navController: NavHostController,
    val windowSizeClass: WindowSizeClass
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val shouldShowBottomBar: Boolean
        get() = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact ||
            windowSizeClass.heightSizeClass == WindowHeightSizeClass.Compact

    val shouldShowNavRail: Boolean
        get() = !shouldShowBottomBar

    /**
     * Top level destinations to be used in the BottomBar and NavRail
     */
    val topLevelDestinations: List<TopLevelDestination> = listOf(
        TopLevelDestination(
            route = MedicabNavigation.route,
            destination = MedicabNavigation.destination,
            selectedIcon = Icon.DrawableResourceIcon(ProHubIcons.Upcoming),
            unselectedIcon = Icon.DrawableResourceIcon(ProHubIcons.UpcomingBorder),
            iconTextId = medicabR.string.medicab
        ),
        TopLevelDestination(
            route = MedicareNavigation.route,
            destination = MedicareNavigation.destination,
            selectedIcon = Icon.DrawableResourceIcon(ProHubIcons.Bookmarks),
            unselectedIcon = Icon.DrawableResourceIcon(ProHubIcons.BookmarksBorder),
            iconTextId = medicareR.string.medicare
        ),
        TopLevelDestination(
            route = AccountNavigation.route,
            destination = AccountNavigation.destination,
            selectedIcon = Icon.ImageVectorIcon(ProHubIcons.Grid3x3),
            unselectedIcon = Icon.ImageVectorIcon(ProHubIcons.Grid3x3),
            iconTextId = accountR.string.account
//            iconTextId = medicareR.string.add_payment
        )
    )

    /**
     * UI logic for navigating to a particular destination in the app. The NavigationOptions to
     * navigate with are based on the type of destination, which could be a top level destination or
     * just a regular destination.
     *
     * Top level destinations have only one copy of the destination of the back stack, and save and
     * restore state whenever you navigate to and from it.
     * Regular destinations can have multiple copies in the back stack and state isn't saved nor
     * restored.
     *
     * @param destination: The [ProHubNavigationDestination] the app needs to navigate to.
     * @param route: Optional route to navigate to in case the destination contains arguments.
     */
    fun navigate(destination: ProHubNavigationDestination, route: String? = null) {
        trace("Navigation: $destination") {
            if (destination is TopLevelDestination) {
                navController.navigate(route ?: destination.route) {
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    // Avoid multiple copies of the same destination when
                    // reselecting the same item
                    launchSingleTop = true
                    // Restore state when re-selecting a previously selected item
                    restoreState = true
                }
            } else {
                navController.navigate(route ?: destination.route)
            }
        }
    }

    fun onBackClick() {
        navController.popBackStack()
    }
}

/**
 * Stores information about navigation events to be used with JankStats
 */
@Composable
private fun NavigationTrackingSideEffect(navController: NavHostController) {
//    JankMetricDisposableEffect(navController) { metricsHolder ->
//        val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
//            metricsHolder.state?.putState("Navigation", destination.route.toString())
//        }
//
//        navController.addOnDestinationChangedListener(listener)
//
//        onDispose {
//            navController.removeOnDestinationChangedListener(listener)
//        }
//    }
}
