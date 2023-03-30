package edu.tomerbu.lec18.ui.home

import android.app.Application
import androidx.lifecycle.*
import edu.tomerbu.lec18.TMDBApp
import edu.tomerbu.lec18.data.AppDatabase
import edu.tomerbu.lec18.data.models.Movie
import edu.tomerbu.lec18.data.repository.MovieRepository
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    val movies: LiveData<List<Movie>> = TMDBApp.db.movieDao().getMovies()

    init {
        viewModelScope.launch {
            TMDBApp.movieRepository.refreshMovies()
        }
    }
}