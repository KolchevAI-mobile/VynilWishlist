package com.example.vynilwishlist.data.local.converter

import androidx.room.TypeConverter
import com.example.vynilwishlist.domain.model.Track
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.Json

class Converter {
    private val stringListSerializer = ListSerializer(String.serializer())
    private val trackListSerializer = ListSerializer(Track.serializer())

    @TypeConverter
    fun listToString(list: List<String>): String =
        Json.encodeToString(stringListSerializer, list)

    @TypeConverter
    fun toStringList(str: String): List<String> =
        Json.decodeFromString(stringListSerializer, str)

    @TypeConverter
    fun trackListToString(list: List<Track>): String =
        Json.encodeToString(trackListSerializer, list)

    @TypeConverter
    fun stringListToTrack(str: String): List<Track> =
        Json.decodeFromString(trackListSerializer, str)
}