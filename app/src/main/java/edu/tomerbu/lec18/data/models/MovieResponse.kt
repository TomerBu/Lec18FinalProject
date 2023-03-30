package edu.tomerbu.lec18.data.models


import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Int,
    @SerializedName("results")
    val movies: List<Movie>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int,

    //exception handling:
    @SerializedName("status_code")
    val statusCode: Int?, //if error: 401/404
    @SerializedName("status_message")
    val statusMessage: String?
)