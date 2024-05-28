package com.arthlimchiu.data

import com.arthlimchiu.core.common.di.Dispatcher
import com.arthlimchiu.core.common.di.TixDispatchers
import com.arthlimchiu.core.local.movies.MoviesLocalSource
import com.arthlimchiu.core.model.Movie
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val localSource: MoviesLocalSource,
    @Dispatcher(TixDispatchers.IO) private val ioDispatcher: CoroutineDispatcher
) : MoviesRepository {

    override suspend fun getMovies(): Flow<List<Movie>> = withContext(ioDispatcher) {
        localSource.getMovies()
    }
}