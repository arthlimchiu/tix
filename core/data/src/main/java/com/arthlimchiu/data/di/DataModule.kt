package com.arthlimchiu.data.di

import com.arthlimchiu.data.MoviesRepository
import com.arthlimchiu.data.MoviesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class DataModule {

    @Binds
    abstract fun bindsMoviesRepository(repository: MoviesRepositoryImpl): MoviesRepository
}