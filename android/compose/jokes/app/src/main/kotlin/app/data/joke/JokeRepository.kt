package app.data.joke

class JokeRepository(
    private val jokeMemoryCache: JokeMemoryCache
) {
    val jokes get() = jokeMemoryCache.jokes
}