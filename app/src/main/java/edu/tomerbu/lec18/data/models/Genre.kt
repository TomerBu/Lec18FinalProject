package edu.tomerbu.lec18.data.models


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

//All Types are DB Compatible
@Entity
data class Genre(
    @PrimaryKey
    @SerializedName("id")
    val genreId: Int,
    val name: String
)