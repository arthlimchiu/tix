package com.arthlimchiu.core.local.movies

import com.arthlimchiu.core.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviesLocalSource {

    fun getMovies(): Flow<List<Movie>>
}