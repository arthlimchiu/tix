package com.arthlimchiu.core.local.movies.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.arthlimchiu.core.local.movies.entity.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    fun getAll(): Flow<List<MovieEntity>>

    @Insert
    fun insertMovies(movies: List<MovieEntity>)

    @Query("DELETE from movie")
    fun deleteAll()

    @Transaction
    fun deleteAllAndInsertMovies(movies: List<MovieEntity>) {
        deleteAll()
        insertMovies(movies)
    }
}