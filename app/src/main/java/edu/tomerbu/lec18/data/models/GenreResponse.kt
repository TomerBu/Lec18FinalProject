package edu.tomerbu.lec18.data.models


import com.google.gson.annotations.SerializedName

data class GenreResponse(
    val genres: List<Genre>,

    //exception handling:
    @SerializedName("status_code")
    val statusCode: Int?, //if error: 401/404
    @SerializedName("status_message")
    val statusMessage: String?
)