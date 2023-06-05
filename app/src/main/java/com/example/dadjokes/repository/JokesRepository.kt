package com.example.dadjokes.repository

import com.example.dadjokes.network.JokeModel
import com.example.dadjokes.network.JokesApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JokesRepository @Inject constructor(private val jokesApi: JokesApi) {

    suspend fun getRandomJoke() : JokeModel {
        return jokesApi.getRandomJoke()
    }
}