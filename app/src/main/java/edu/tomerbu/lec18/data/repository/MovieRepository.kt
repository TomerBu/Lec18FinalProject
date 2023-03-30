package edu.tomerbu.lec18.data.repository

import edu.tomerbu.lec18.data.dao.MovieDao
import edu.tomerbu.lec18.service.TMDBService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieRepository(private val movieDao: MovieDao) {
    suspend fun refreshMovies(){
        withContext(Dispatchers.IO){
            val service = TMDBService.create()

            //fetch movies from API
            val movieRes = service.popularMovies()
            val genreResponse = service.genres()

            //save to local database
            movieDao.addMovies(movieRes.movies)
            movieDao.addGenres(genreResponse.genres)
        }
    }
}

