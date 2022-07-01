package app.di

import app.data.joke.JokeRepository
import app.data.joke.JokeRetrofit
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
    fun providesJokeRepository(
        jokeRetrofit: JokeRetrofit
    ) = JokeRepository(jokeRetrofit)
}