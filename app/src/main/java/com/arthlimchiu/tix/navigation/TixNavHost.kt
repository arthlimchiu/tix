package com.arthlimchiu.tix.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.arthlimchiu.feature.nowplaying.navigation.NOW_PLAYING_ROUTE
import com.arthlimchiu.feature.nowplaying.navigation.nowPlayingScreen
import com.arthlimchiu.feature.popular.navigation.popularScreen
import com.arthlimchiu.feature.toprated.navigation.topRatedScreen
import com.arthlimchiu.tix.ui.TixAppState
import com.arthlimchiu.upcoming.navigation.upcomingScreen

@Composable
fun TixNavHost(
    appState: TixAppState,
    modifier: Modifier = Modifier,
    startDestination: String = NOW_PLAYING_ROUTE
) {
    NavHost(
        navController = appState.navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        nowPlayingScreen()
        popularScreen()
        topRatedScreen()
        upcomingScreen()
    }
}