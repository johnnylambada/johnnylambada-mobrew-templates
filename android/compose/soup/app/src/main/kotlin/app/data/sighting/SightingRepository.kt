package app.data.sighting

class SightingRepository(
    private val sightingMemoryCache: SightingMemoryCache
) {

    val sightings get() = sightingMemoryCache.sightings

    fun addRando() = sightingMemoryCache.addRando()

}