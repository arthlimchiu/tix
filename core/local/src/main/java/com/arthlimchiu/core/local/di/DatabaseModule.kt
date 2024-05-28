package com.arthlimchiu.core.local.di

import android.content.Context
import com.arthlimchiu.core.local.movies.dao.MovieDao
import com.arthlimchiu.core.local.TixDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun providesTixDatabase(@ApplicationContext context: Context): TixDatabase {
        return TixDatabase.getInstance(context)
    }

    @Provides
    fun providesMovieDao(database: TixDatabase): MovieDao = database.movieDao()
}