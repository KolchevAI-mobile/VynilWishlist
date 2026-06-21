package com.example.vynilwishlist.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.vynilwishlist.data.local.entity.WishlistEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WishlistDao {
    @Insert(onConflict = REPLACE)
    fun insertWishlistItem(wishlist: WishlistEntity)

    @Delete
    fun deleteWishlistItem(wishlist: WishlistEntity)

    @Query("SELECT * FROM wishlist ORDER BY addedAt DESC")
    fun getAllItemsWishlist(): Flow<List<WishlistEntity>>

    @Query("SELECT * FROM wishlist WHERE id = releaseId")
    fun getItemWishlist(id: Long): WishlistEntity
}