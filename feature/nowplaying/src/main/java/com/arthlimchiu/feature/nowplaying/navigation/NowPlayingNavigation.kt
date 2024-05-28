package com.arthlimchiu.feature.nowplaying.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.arthlimchiu.feature.nowplaying.NowPlayingRoute

const val NOW_PLAYING_ROUTE = "now_playing_route"

fun NavController.navigateToNowPlaying(navOptions: NavOptions) = navigate(NOW_PLAYING_ROUTE, navOptions)

fun NavGraphBuilder.nowPlayingScreen() {
    composable(route = NOW_PLAYING_ROUTE) {
        NowPlayingRoute()
    }
}