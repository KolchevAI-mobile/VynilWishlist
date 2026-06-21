package com.example.vynilwishlist.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.vynilwishlist.data.local.converter.Converter
import com.example.vynilwishlist.data.local.dao.WishlistDao
import com.example.vynilwishlist.data.local.entity.WishlistEntity

@Database(
    entities = [WishlistEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wishlistDao(): WishlistDao
}