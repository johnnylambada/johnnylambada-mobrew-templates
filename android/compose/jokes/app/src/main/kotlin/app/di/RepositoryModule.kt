package app.di

import app.data.joke.JokeMemoryCache
import app.data.joke.JokeRepository
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