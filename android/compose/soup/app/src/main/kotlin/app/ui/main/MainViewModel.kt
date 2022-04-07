package app.ui.main

import androidx.lifecycle.ViewModel
import app.App
import app.data.sighting.SightingRepository
import app.domain.model.SoupSighting
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class SoupListViewState(
    val soupSightings: List<SoupSighting>
)

class MainViewModel: ViewModel() {

    val sightingRepository: SightingRepository by lazy { return@lazy App.app.sightingRepository }
    private val _state = MutableStateFlow(SoupListViewState(emptyList()))
    val state = _state.asStateFlow()

    fun addRando() {
        sightingRepository.addRando()
        update()
    }

    fun update() {
        val sightings = sightingRepository.sightings
        _state.value = SoupListViewState(sightings.toList())
    }

}