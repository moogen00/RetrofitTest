package com.example.retrofittest

import com.example.retrofittest.Data.MoodCategory
import com.example.retrofittest.Data.ThemeResult
import com.example.retrofittest.Data.SmartPlayList
import com.example.retrofittest.Data.SmartPlayListParam
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface RestApi {
    @GET("/api/v1/dev/themes")
    fun getTheme(): Call<ThemeResult>

    @POST("/api/v1/dev/themes/smartPlayList")
    fun getSmartPlayList(@Body param: SmartPlayListParam): Call<SmartPlayList>

    // @POST("api/v1/dev/descriptors?desc_type=moodsn")
    @POST("/api/v1/dev/descriptors")
    fun getMoodCategoryList(@Query("desc_type") mood: String): Call<MoodCategory>

}