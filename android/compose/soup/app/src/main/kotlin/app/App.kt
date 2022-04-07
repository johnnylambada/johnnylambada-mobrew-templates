package app

import android.app.Application
import app.data.sighting.SightingMemoryCache
import app.data.sighting.SightingRepository

class App: Application() {

    companion object {
        lateinit var app: App
    }

    val sightingRepository = SightingRepository(SightingMemoryCache())

    override fun onCreate() {
        super.onCreate()
        app = this
    }
}