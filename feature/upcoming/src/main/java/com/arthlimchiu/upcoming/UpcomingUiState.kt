package com.arthlimchiu.upcoming

import com.arthlimchiu.core.model.Movie

data class UpcomingUiState(
    val movies: List<Movie> = listOf()
)