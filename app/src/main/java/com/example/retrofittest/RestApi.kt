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

    // response String Type
    // @POST("api/v1/dev/descriptors?desc_type=moodsn")
    // http://221.148.44.58:8088/api/v1/dev/descriptors/smartPlayList?desc_type=moods&id=34154
    // http://10.28.3.78:8088/api/v1/dev/descriptors/smartPlayList?desc_type=moods&id=34154&limit=10&offset=1
    @POST("/api/v1/dev/descriptors/smartPlayList")
    fun getSmartPlayListForMood(
        @Query("desc_type") desc_type: String,
        @Query("id") id: String,
        @Query("limit") limit: String,
        @Query("offset") offset: String
    ): Call<String>
}