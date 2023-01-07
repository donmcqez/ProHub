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

package com.tikay.prohub.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.tikay.prohub.Screen
import com.tikay.prohub.core.navigation.ProHubNavigationDestination
import com.tikay.prohub.feature.account.navigation.accountGraph
import com.tikay.prohub.feature.medicab.navigation.MedicabNavigation
import com.tikay.prohub.feature.medicab.navigation.medicabGraph
import com.tikay.prohub.feature.medicare.navigation.medicareGraph
import com.tikay.prohub.feature.profile.navigation.profileGraph
import com.tikay.prohub.feature.settings.navigation.settingsGraph

/**
 * Top-level navigation graph. Navigation is organized as explained at
 * https://d.android.com/jetpack/compose/nav-adaptive
 *
 * The navigation graph defined in this file defines the different top level routes. Navigation
 * within each route is handled using state and Back Handlers.
 */
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NiaNavHost(
    navController: NavHostController,
    onNavigateToDestination: (ProHubNavigationDestination, String) -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    startDestination: String = MedicabNavigation.route
) {
    // 0302200390 quick loans
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
//    AnimatedNavHost(
//        navController = navController,
//        startDestination = startDestination,
//        enterTransition = { defaultEnterTransition(initialState, targetState) },
//        exitTransition = { defaultExitTransition(initialState, targetState) },
//        popEnterTransition = { defaultPopEnterTransition() },
//        popExitTransition = { defaultPopExitTransition() },
//        modifier = modifier
//    ) {
//        profileGraph()
        medicabGraph(
            {},{},{}
        )
        medicareGraph(
            {},{},{}
        )

        accountGraph()
//        settingsGraph {
//
//        }
//        interestsGraph(
//            navigateToTopic = {
//                onNavigateToDestination(
//                    TopicDestination, TopicDestination.createNavigationRoute(it)
//                )
//            },
//            navigateToAuthor = {
//                onNavigateToDestination(
//                    AuthorDestination, AuthorDestination.createNavigationRoute(it)
//                )
//            },
//            nestedGraphs = {
//                topicGraph(onBackClick)
//                authorGraph(onBackClick)
//            }
//        )
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
