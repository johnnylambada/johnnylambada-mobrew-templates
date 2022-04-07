package app.data.sighting

import app.domain.model.SoupSighting
import app.domain.model.SoupType
import java.time.LocalDateTime
import kotlin.random.Random

class SightingMemoryCache {
    companion object {
        private val PREBUILT = listOf(
            SoupSighting(
                LocalDateTime.parse("2020-01-25T07:30"),
                SoupType.splitPea,
                14
            ),
            SoupSighting(
                LocalDateTime.parse("2020-01-20T09:11"),
                SoupType.tomato,
                3
            ),
            SoupSighting(
                LocalDateTime.parse("2020-01-20T07:30"),
                SoupType.tomato,
                3
            ),
            SoupSighting(
                LocalDateTime.parse("2020-01-25T07:30"),
                SoupType.splitPea,
                14
            ),
            SoupSighting(
                LocalDateTime.parse("2020-01-20T07:30"),
                SoupType.tomato,
                3
            ),
            SoupSighting(
                LocalDateTime.parse("2020-01-20T07:30"),
                SoupType.minestrone,
                0
            ),
            SoupSighting(
                LocalDateTime.parse("2020-01-20T09:11"),
                SoupType.minestrone,
                0
            )
        )
    }

    private val cache: MutableList<SoupSighting> = mutableListOf<SoupSighting>().also { it += PREBUILT }

    val sightings get() = cache

    fun add(soupSighting: SoupSighting) = cache.add(soupSighting)

    fun addRando() {
        val sighting = SoupSighting(
            LocalDateTime.now(),
            SoupType.values()[Random.Default.nextInt(SoupType.values().size)],
            Random.Default.nextInt(0,1000)
        )
        add(sighting)
    }
}