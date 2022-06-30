package app.data.sighting

class JokeRepository(
    private val jokeMemoryCache: JokeMemoryCache
) {
    val jokes get() = jokeMemoryCache.jokes
}