package com.example.retrofittest

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    // private val client = OkHttpClient.Builder().build()

    // http://221.148.44.58:8088/api/v1/dev/themes
    // http://10.28.3.78:8088/api/v1/dev/themes
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.28.3.78:8088") // change this IP for testing by your actual machine IP
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }
}