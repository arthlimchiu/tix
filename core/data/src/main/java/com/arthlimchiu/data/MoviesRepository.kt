package com.arthlimchiu.data

import com.arthlimchiu.core.model.Movie
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    suspend fun getMovies(): Flow<List<Movie>>
}