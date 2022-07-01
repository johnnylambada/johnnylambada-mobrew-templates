package app.data.joke

import retrofit2.http.GET

interface JokeRetrofit {

    @GET("joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&amount=10")
    suspend fun jokes(): JokeListResponse
}