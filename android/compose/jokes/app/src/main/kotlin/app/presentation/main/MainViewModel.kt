package app.presentation.main

import androidx.lifecycle.ViewModel
import app.data.sighting.JokeRepository
import app.domain.model.Joke
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class JokeListViewState(
    val jokeList: List<Joke>
)

@HiltViewModel
class MainViewModel @Inject constructor(
    private val jokeRepository: JokeRepository
): ViewModel() {

    private val _state = MutableStateFlow(JokeListViewState(emptyList()))
    val state = _state.asStateFlow()

    fun update() {
        val sightings = jokeRepository.jokes
        _state.value = JokeListViewState(sightings.toList())
    }

}
