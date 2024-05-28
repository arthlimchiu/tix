package com.arthlimchiu.core.work

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.arthlimchiu.core.common.di.Dispatcher
import com.arthlimchiu.core.common.di.TixDispatchers
import com.arthlimchiu.core.local.movies.dao.MovieDao
import com.arthlimchiu.core.local.movies.mapper.asEntity
import com.arthlimchiu.core.model.Movie
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json

@HiltWorker
class TixDatabaseSeedWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParams: WorkerParameters,
    private val movieDao: MovieDao,
    @Dispatcher(TixDispatchers.IO) private val ioDispatcher: CoroutineDispatcher
) : CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = withContext(ioDispatcher) {
        applicationContext.assets.open("movies.json").bufferedReader().use { reader ->
            val movies = Json { ignoreUnknownKeys = true }
                .decodeFromString<List<Movie>>(reader.readText())
                .map { it.asEntity() }

            movieDao.deleteAllAndInsertMovies(movies)

            Result.success()
        }
    }
}