package com.arthlimchiu.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val id: Long,
    @SerialName("poster_path") val posterUrl: String
)