package com.arthlimchiu.feature.popular

import com.arthlimchiu.core.model.Movie

data class PopularUiState(
    val movies: List<Movie> = listOf()
)