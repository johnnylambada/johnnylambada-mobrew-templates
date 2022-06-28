package app.data.sighting

import app.domain.model.ϾSoupϿSighting
import app.domain.model.ϾSoupϿType
import java.time.LocalDateTime
import kotlin.random.Random

class SightingMemoryCache {
    companion object {
        private val PREBUILT = listOf(
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-25T07:30"),
                ϾSoupϿType.splitPea,
                14
            ),
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-20T09:11"),
                ϾSoupϿType.tomato,
                3
            ),
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-20T07:30"),
                ϾSoupϿType.tomato,
                3
            ),
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-25T07:30"),
                ϾSoupϿType.splitPea,
                14
            ),
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-20T07:30"),
                ϾSoupϿType.tomato,
                3
            ),
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-20T07:30"),
                ϾSoupϿType.minestrone,
                0
            ),
            ϾSoupϿSighting(
                LocalDateTime.parse("2020-01-20T09:11"),
                ϾSoupϿType.minestrone,
                0
            )
        )
    }

    private val cache: MutableList<ϾSoupϿSighting> = mutableListOf<ϾSoupϿSighting>().also { it += PREBUILT }

    val sightings get() = cache

    fun add(ϾsoupϿSighting: ϾSoupϿSighting) = cache.add(ϾsoupϿSighting)

    fun addRando() {
        val sighting = ϾSoupϿSighting(
            LocalDateTime.now(),
            ϾSoupϿType.values()[Random.Default.nextInt(ϾSoupϿType.values().size)],
            Random.Default.nextInt(0,1000)
        )
        add(sighting)
    }
}
