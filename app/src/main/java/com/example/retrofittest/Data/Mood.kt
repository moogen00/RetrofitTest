package com.example.retrofittest.Data

import com.google.gson.annotations.SerializedName

data class Mood(
    @SerializedName("name") var name: String,
    @SerializedName("id") var id: String
)
