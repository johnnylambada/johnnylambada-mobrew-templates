package app.data.joke

import app.domain.model.Joke

class JokeRepository(
    private val jokeRetrofit: JokeRetrofit
) {
    suspend fun getJokes(): List<Joke> {
        return jokeRetrofit.jokes().toEntity()
    }
}