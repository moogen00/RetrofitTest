package com.example.retrofittest.Data

import com.google.gson.annotations.SerializedName

data class MoodCategory(
    @SerializedName("result") var moodList: List<Mood>
)
