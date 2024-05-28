package com.arthlimchiu.feature.toprated

import com.arthlimchiu.core.model.Movie

data class TopRatedUiState(
    val movies: List<Movie> = listOf()
)