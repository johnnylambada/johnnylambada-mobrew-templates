package app

import android.app.Application
import app.data.sighting.JokeMemoryCache
import app.data.sighting.JokeRepository

class App: Application() {

    companion object {
        lateinit var app: App
    }

    val jokeRepository = JokeRepository(JokeMemoryCache())

    override fun onCreate() {
        super.onCreate()
        app = this
    }
}