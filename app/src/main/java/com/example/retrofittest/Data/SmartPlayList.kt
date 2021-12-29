package com.example.retrofittest.Data

import com.example.retrofittest.Data.PlTheme
import com.google.gson.annotations.SerializedName

data class SmartPlayList(
    @SerializedName("theme_id")
    var themeId: String,
    @SerializedName("theme_name")
    var themeName: String,
    @SerializedName("pl_theme")
    var plTheme: List<PlTheme>
)
