package com.example.retrofittest.Data

import com.google.gson.annotations.SerializedName

data class ThemeResult(
    @SerializedName("result") var result: List<Theme>
)
