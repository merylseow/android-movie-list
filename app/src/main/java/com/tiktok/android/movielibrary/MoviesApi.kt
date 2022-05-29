package com.tiktok.android.movielibrary

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://api.themoviedb.org/3/"
const val API_KEY = "318e036e79ea50e3724a3b064797bdd4"

interface MoviesApi {
    @GET("discover/movie?sort_by=popularity.desc&api_key="+API_KEY)
    fun getMovies(): Call<List<Movie>>

    companion object {
        operator fun invoke(): MoviesApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MoviesApi::class.java)
        }
    }
}