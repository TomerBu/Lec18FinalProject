package edu.tomerbu.lec18

import android.app.Application
import edu.tomerbu.lec18.data.AppDatabase
import edu.tomerbu.lec18.data.repository.MovieRepository

class TMDBApp : Application() {
    override fun onCreate() {
        super.onCreate()
        app = this
        db = AppDatabase.create(this)
        movieRepository = MovieRepository(db.movieDao())
    }

    companion object {
        lateinit var app: TMDBApp
        lateinit var db: AppDatabase
        lateinit var movieRepository: MovieRepository
    }
}
//Application->Activity->Fragments