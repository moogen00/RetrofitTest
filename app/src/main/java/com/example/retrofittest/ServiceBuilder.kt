package com.example.retrofittest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object ServiceBuilder {
    // private val client = OkHttpClient.Builder().build()

    // http://221.148.44.58:8088/api/v1/dev/themes
    // http://10.28.3.78:8088/api/v1/dev/themes
    // http://10.28.3.78:8088/api/v1/dev/descriptors?desc_type=moods
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.28.3.78:8088") // change this IP for testing by your actual machine IP
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }
}