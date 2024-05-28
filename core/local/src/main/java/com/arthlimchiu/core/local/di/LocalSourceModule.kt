package com.arthlimchiu.core.local.di

import com.arthlimchiu.core.local.movies.MoviesLocalSource
import com.arthlimchiu.core.local.movies.MoviesLocalSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class LocalSourceModule {

    @Binds
    abstract fun bindMoviesLocalSource(local: MoviesLocalSourceImpl): MoviesLocalSource
}