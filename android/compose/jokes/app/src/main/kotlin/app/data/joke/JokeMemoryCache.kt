package app.data.joke

import app.domain.model.Joke

class JokeMemoryCache {
    companion object {
        private val PREBUILT = listOf(
            Joke(
                "Who is Santa's favourite singer?",
                "Elf-is Presley!"
            ),
            Joke(
                "Who is Santa's favourite singer?",
                "Elf-is Presley!"
            ),
            Joke(
                "Who is Santa's favourite singer?",
                "Elf-is Presley!"
            ),
            Joke(
                "Who is Santa's favourite singer?",
                "Elf-is Presley!"
            ),
            Joke(
                "Who is Santa's favourite singer?",
                "Elf-is Presley!"
            ),
            Joke(
                "Who is Santa's favourite singer?",
                "Elf-is Presley!"
            ),
        )
    }

    private val cache: MutableList<Joke> = mutableListOf<Joke>().also { it += PREBUILT }

    val jokes get() = cache
}
