package com.example.vynilwishlist.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wishlist")
data class WishlistEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String,
    val coverUrl: String,
    val artists: List<String>,
    val releaseId: String,
    val date: String,
    val label: String,
    val format: String,
    val genre: String,
    val addedAt: Long = System.currentTimeMillis(),
    val tracks: List<String>
)