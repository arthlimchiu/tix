package com.arthlimchiu.tix.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material.icons.outlined.Today
import androidx.compose.material.icons.outlined.Verified
import androidx.compose.ui.graphics.vector.ImageVector
import com.arthlimchiu.feature.nowplaying.navigation.NOW_PLAYING_ROUTE
import com.arthlimchiu.feature.popular.navigation.POPULAR_ROUTE
import com.arthlimchiu.feature.toprated.navigation.TOP_RATED_ROUTE
import com.arthlimchiu.tix.R
import com.arthlimchiu.upcoming.navigation.UPCOMING_ROUTE

enum class TopLevelScreen(
    val route: String,
    val icon: ImageVector,
    val textId: Int
) {
    NOW_PLAYING(
        route = NOW_PLAYING_ROUTE,
        icon = Icons.Outlined.Today,
        textId = R.string.now_playing
    ),
    POPULAR(
        route = POPULAR_ROUTE,
        icon = Icons.Outlined.BarChart,
        textId = R.string.popular
    ),
    TOP_RATED(
        route = TOP_RATED_ROUTE,
        icon = Icons.Outlined.Verified,
        textId = R.string.top_rated
    ),
    UPCOMING(
        route = UPCOMING_ROUTE,
        icon = Icons.Outlined.Schedule,
        textId = R.string.upcoming
    )
}