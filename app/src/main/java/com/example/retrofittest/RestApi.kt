package com.example.retrofittest

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {
    @GET("/api/v1/dev/themes")
    fun getTheme(): Call<Result>
}