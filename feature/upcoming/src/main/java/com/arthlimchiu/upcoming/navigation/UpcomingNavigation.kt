package com.arthlimchiu.upcoming.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.arthlimchiu.upcoming.UpcomingRoute

const val UPCOMING_ROUTE = "upcoming_route"

fun NavController.navigateToUpcoming(navOptions: NavOptions) = navigate(UPCOMING_ROUTE, navOptions)

fun NavGraphBuilder.upcomingScreen() {
    composable(route = UPCOMING_ROUTE) {
        UpcomingRoute()
    }
}