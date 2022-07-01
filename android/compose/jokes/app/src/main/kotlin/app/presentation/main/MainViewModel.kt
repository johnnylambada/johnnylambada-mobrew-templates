package app.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.data.joke.JokeRepository
import app.domain.model.Joke
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class JokeListViewState(
    val isLoading: Boolean = false,
    val jokeList: List<Joke> = emptyList()
)

@HiltViewModel
class MainViewModel @Inject constructor(
    private val jokeRepository: JokeRepository
): ViewModel() {

    private val _state = MutableStateFlow(JokeListViewState())
    val state = _state.asStateFlow()

    fun update() {
        _state.value = _state.value.copy(isLoading = true)
        viewModelScope.launch {
            val jokes = jokeRepository.getJokes()
            _state.value = _state.value.copy(
                isLoading = false,
                jokeList = jokes
            )
        }
    }

}
