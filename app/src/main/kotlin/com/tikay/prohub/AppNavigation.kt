/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tikay.prohub

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.navigation
import com.tikay.prohub.core.design.util.clearAndNavigate
import com.tikay.prohub.home.DashBoard
import com.tikay.prohub.feature.medicab.presentation.dashboard.DashboardScreen
import com.tikay.prohub.splash.SplashScreen

//enum class Screens(private val route: String) {
//    SplashScreen("splashScreen"),
//    DashboardScreen("dashboardScreen"),
//    PaymentOptionsScreen("paymentOptionsScreen"),
//    SchedulePickupScreen("schedulePickupScreen"),
//    AddPaymentMethodScreen("addPaymentMethodScreen"),
//    MapScreen("MapScreen"),
//    ConfirmPickUpLocation("ConfirmPickUpLocation"),
//    WhereToScreen("whereToScreen");
//
//    operator fun invoke() = route
//}


private sealed class LeafScreen(
    private val route: String,
) {
    fun createRoute(root: Screen) = "${root.route}/$route"

    object Account : LeafScreen("account")
    object CheckOut : LeafScreen("checkout")
    object DashBoard : LeafScreen("dashboard")
    object MediCab : LeafScreen("medicab")
    object MediCare : LeafScreen("medicare")
    object Splash : LeafScreen("splash")

    object PaymentOptions : LeafScreen("paymentOptions")
    object SchedulePickup : LeafScreen("schedulePickup")
    object AddPaymentMethod : LeafScreen("addPaymentMethod")
    object Map : LeafScreen("map")
    object ConfirmPickUpLocation : LeafScreen("confirmPickUpLocation")
    object WhereTo : LeafScreen("whereTo")
    object Search : LeafScreen("search")

    object ShowDetails : LeafScreen("show/{showId}") {
        fun createRoute(root: Screen, showId: Long): String {
            return "${root.route}/show/$showId"
        }
    }

    object ShowSeasons : LeafScreen("show/{showId}/seasons?seasonId={seasonId}") {
        fun createRoute(
            root: Screen,
            showId: Long,
            seasonId: Long? = null,
        ): String {
            return "${root.route}/show/$showId/seasons".let {
                if (seasonId != null) "$it?seasonId=$seasonId" else it
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
internal fun AppNavigation(
    navController: NavHostController,
    onOpenSettings: () -> Unit,
    changeSystemBarColors: () -> Unit,
    modifier: Modifier = Modifier
) {
//    NavHost(
//        navController = navController,
//        startDestination = Screen.Splash.route
//    )
    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route,
//        startDestination = Screen.Splash.route,
        enterTransition = { defaultEnterTransition(initialState, targetState) },
        exitTransition = { defaultExitTransition(initialState, targetState) },
        popEnterTransition = { defaultPopEnterTransition() },
        popExitTransition = { defaultPopExitTransition() },
        modifier = modifier
    ) {
//        composable(LeafScreen.Splash.createRoute(root)) {
//        composable(Screen.Splash.route) {
//            SplashScreen {
//                changeSystemBarColors()
//
//                navController.clearAndNavigate(
//                    clearDestination = Screen.Splash.route,
//                    navigateToDestination = Screen.Dashboard.route
//                )
//            }
//        }
////        composable(LeafScreen.DashBoard.createRoute(root)) {
//        composable(Screen.Dashboard.route) {
//            DashBoard()
//        }
//        addSplashScreenTopLevel(navController, onOpenSettings, changeSystemBarColors)
        addDashBoardTopLevel(navController, onOpenSettings, changeSystemBarColors)
        addAccountTopLevel(navController, onOpenSettings)
        addMediCabTopLevel(navController, onOpenSettings)
        addMediCareTopLevel(navController, onOpenSettings)
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addDashBoardTopLevel(
    navController: NavController,
    openSettings: () -> Unit,
    changeSystemBarColors: () -> Unit,
) {
    navigation(
        route = Screen.Dashboard.route,
        startDestination = LeafScreen.Splash.createRoute(Screen.Dashboard)
    ) {
        addDashBoardScreen(navController, Screen.Dashboard)
        addSplashScreen(navController, Screen.Dashboard, changeSystemBarColors)
    }

}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addAccountTopLevel(
    navController: NavController,
    openSettings: () -> Unit,
) {
    navigation(
        route = Screen.Account.route,
        startDestination = LeafScreen.Account.createRoute(Screen.Account),
    ) {

    }
}


@ExperimentalAnimationApi
private fun NavGraphBuilder.addMediCabTopLevel(
    navController: NavController,
    openSettings: () -> Unit,
) {
    navigation(
        route = Screen.MediCab.route,
        startDestination = LeafScreen.MediCab.createRoute(Screen.MediCab),
    ) {

    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addMediCareTopLevel(
    navController: NavController,
    openSettings: () -> Unit,
) {
    navigation(
        route = Screen.MediCare.route,
        startDestination = LeafScreen.MediCare.createRoute(Screen.MediCare),
    ) {

    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addSearchTopLevel(
    navController: NavController,
    openSettings: () -> Unit,
) {
    navigation(
        route = Screen.Search.route,
        startDestination = LeafScreen.Search.createRoute(Screen.Search),
    ) {
//        addSearch(navController, Screen.Search)
//        addAccount(navController, Screen.Search, openSettings)
//        addShowDetails(navController, Screen.Search)
//        addShowSeasons(navController, Screen.Search)
//        addEpisodeDetails(navController, Screen.Search)
    }
}

//@ExperimentalAnimationApi
//private fun NavGraphBuilder.addSplashScreenTopLevel(
//    navController: NavController,
//    openSettings: () -> Unit,
//    changeSystemBarColors: () -> Unit,
//) {
//    navigation(
//        route = Screen.Splash.route,
//        startDestination = LeafScreen.Splash.createRoute(Screen.Splash)
//    ) {
//        addSplashScreen(navController, Screen.Splash, changeSystemBarColors)
//    }
//}


@ExperimentalAnimationApi
private fun NavGraphBuilder.addSplashScreen(
    navController: NavController,
    root: Screen,
    changeSystemBarColors: () -> Unit,
) {
    composable(LeafScreen.Splash.createRoute(root)) {
        SplashScreen {
            changeSystemBarColors()

            navController.clearAndNavigate(
                clearDestination = Screen.Dashboard.route,
                navigateToDestination = LeafScreen.DashBoard.createRoute(root)
            )
        }
    }
}

@ExperimentalAnimationApi
private fun NavGraphBuilder.addDashBoardScreen(
    navController: NavController,
    root: Screen
) {
    composable(LeafScreen.DashBoard.createRoute(root)) {
        DashBoard()
        DashboardScreen(
            onGotoWhereScreen = {
//                navController.navigate(LeafScreen.DashBoard.createRoute(root))
            },
            onGotoMap = {
//                navController.navigate(LeafScreen.DashBoard.createRoute(root))
            }
        )
    }
}


@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultEnterTransition(
    initial: NavBackStackEntry,
    target: NavBackStackEntry,
): EnterTransition {
    val initialNavGraph = initial.destination.hostNavGraph
    val targetNavGraph = target.destination.hostNavGraph
    // If we're crossing nav graphs (bottom navigation graphs), we crossfade
    if (initialNavGraph.id != targetNavGraph.id) {
        return fadeIn()
    }
    // Otherwise we're in the same nav graph, we can imply a direction
    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.Start)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultExitTransition(
    initial: NavBackStackEntry,
    target: NavBackStackEntry,
): ExitTransition {
    val initialNavGraph = initial.destination.hostNavGraph
    val targetNavGraph = target.destination.hostNavGraph
    // If we're crossing nav graphs (bottom navigation graphs), we crossfade
    if (initialNavGraph.id != targetNavGraph.id) {
        return fadeOut()
    }
    // Otherwise we're in the same nav graph, we can imply a direction
    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.Start)
}

private val NavDestination.hostNavGraph: NavGraph
    get() = hierarchy.first { it is NavGraph } as NavGraph

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopEnterTransition(): EnterTransition {
    return fadeIn() + slideIntoContainer(AnimatedContentScope.SlideDirection.End)
}

@ExperimentalAnimationApi
private fun AnimatedContentScope<*>.defaultPopExitTransition(): ExitTransition {
    return fadeOut() + slideOutOfContainer(AnimatedContentScope.SlideDirection.End)
}
