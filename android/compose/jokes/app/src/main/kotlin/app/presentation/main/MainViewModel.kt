package app.presentation.main

import androidx.lifecycle.ViewModel
import app.App
import app.data.sighting.JokeRepository
import app.domain.model.Joke
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class JokeListViewState(
    val jokeList: List<Joke>
)

class MainViewModel: ViewModel() {

    val jokeRepository: JokeRepository by lazy { return@lazy App.app.jokeRepository }
    private val _state = MutableStateFlow(JokeListViewState(emptyList()))
    val state = _state.asStateFlow()

    fun update() {
        val sightings = jokeRepository.jokes
        _state.value = JokeListViewState(sightings.toList())
    }

}
