package com.arthlimchiu.core.local.movies.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class MovieEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "poster_url") val posterUrl: String
)