package app.domain.model

interface Joke

data class JokeOneLiner(
    val joke: String
): Joke

data class JokeTwoLiner(
    val setup: String,
    val delivery: String
): Joke
