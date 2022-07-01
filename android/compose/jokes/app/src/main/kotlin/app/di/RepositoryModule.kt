package app.di

import app.data.sighting.JokeMemoryCache
import app.data.sighting.JokeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun providesJokeMemoryCache() = JokeMemoryCache()

    @Singleton
    @Provides
    fun providesJokeRepository(
        jokeMemoryCache: JokeMemoryCache
    ) = JokeRepository(jokeMemoryCache)
}