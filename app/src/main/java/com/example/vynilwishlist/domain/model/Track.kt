package com.example.vynilwishlist.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Track (
    val title: String,
    val duration: String
)