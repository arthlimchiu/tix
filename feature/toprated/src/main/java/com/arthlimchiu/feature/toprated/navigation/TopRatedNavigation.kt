package com.arthlimchiu.feature.toprated.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.arthlimchiu.feature.toprated.TopRatedRoute

const val TOP_RATED_ROUTE = "top_rated_route"

fun NavController.navigateToTopRated(navOptions: NavOptions) = navigate(TOP_RATED_ROUTE, navOptions)

fun NavGraphBuilder.topRatedScreen() {
    composable(route = TOP_RATED_ROUTE) {
        TopRatedRoute()
    }
}