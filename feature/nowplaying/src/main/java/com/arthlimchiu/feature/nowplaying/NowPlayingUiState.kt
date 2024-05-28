package com.arthlimchiu.feature.nowplaying

import com.arthlimchiu.core.model.Movie

data class NowPlayingUiState(
    val movies: List<Movie> = listOf()
)