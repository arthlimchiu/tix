package com.arthlimchiu.tix.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.arthlimchiu.feature.nowplaying.navigation.navigateToNowPlaying
import com.arthlimchiu.feature.popular.navigation.navigateToPopular
import com.arthlimchiu.feature.toprated.navigation.navigateToTopRated
import com.arthlimchiu.tix.navigation.TopLevelScreen
import com.arthlimchiu.upcoming.navigation.navigateToUpcoming

@Composable
fun rememberTixAppState(navController: NavHostController = rememberNavController()): TixAppState {
    return remember(navController) {
        TixAppState(navController = navController)
    }
}

@Stable
class TixAppState(val navController: NavHostController) {
    val currentDestination: NavDestination?
        @Composable get() = navController.currentBackStackEntryAsState().value?.destination

    val topLevelScreens = TopLevelScreen.entries

    fun navigateToTopLevelScreen(screen: TopLevelScreen) {
        val navOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (screen) {
            TopLevelScreen.NOW_PLAYING -> navController.navigateToNowPlaying(navOptions)
            TopLevelScreen.POPULAR -> navController.navigateToPopular(navOptions)
            TopLevelScreen.TOP_RATED -> navController.navigateToTopRated(navOptions)
            TopLevelScreen.UPCOMING -> navController.navigateToUpcoming(navOptions)
        }
    }
}