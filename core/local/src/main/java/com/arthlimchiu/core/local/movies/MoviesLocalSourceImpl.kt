package com.arthlimchiu.core.local.movies

import com.arthlimchiu.core.local.movies.dao.MovieDao
import com.arthlimchiu.core.local.movies.mapper.asExternalModel
import com.arthlimchiu.core.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MoviesLocalSourceImpl @Inject constructor(
    private val movieDao: MovieDao
) : MoviesLocalSource {

    override fun getMovies(): Flow<List<Movie>> = movieDao
        .getAll()
        .map { movies ->
            movies.map { it.asExternalModel() }
        }
}