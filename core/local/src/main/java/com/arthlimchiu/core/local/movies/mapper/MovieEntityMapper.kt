package com.arthlimchiu.core.local.movies.mapper

import com.arthlimchiu.core.local.movies.entity.MovieEntity
import com.arthlimchiu.core.model.Movie

fun MovieEntity.asExternalModel() = Movie(
    id = id,
    posterUrl = posterUrl
)

fun Movie.asEntity() = MovieEntity(
    id = id,
    posterUrl = posterUrl
)