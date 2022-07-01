package app.data.joke

import app.domain.model.Joke
import app.domain.model.JokeOneLiner
import app.domain.model.JokeTwoLiner

data class JokeListResponse(
    val amount: Int,
    val error: Boolean,
    val jokes: List<JokeResponse>
)

data class JokeResponse(
    val delivery: String?,
    val id: Int,
    val joke: String?,
    val setup: String?,
    val type: String
)

fun JokeListResponse.toEntity(): List<Joke> {
    return jokes.mapNotNull {
        when (it.type) {
            "single" -> JokeOneLiner(it.joke!!)
            "twopart" -> JokeTwoLiner(it.setup!!, it.delivery!!)
            else -> null
        }
    }
}