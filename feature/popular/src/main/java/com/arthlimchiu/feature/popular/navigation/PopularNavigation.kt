package com.arthlimchiu.feature.popular.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.arthlimchiu.feature.popular.PopularRoute

const val POPULAR_ROUTE = "popular_route"

fun NavController.navigateToPopular(navOptions: NavOptions) = navigate(POPULAR_ROUTE, navOptions)

fun NavGraphBuilder.popularScreen() {
    composable(route = POPULAR_ROUTE) {
        PopularRoute()
    }
}