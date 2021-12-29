package com.example.retrofittest

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("result") var result: List<Theme>
)
