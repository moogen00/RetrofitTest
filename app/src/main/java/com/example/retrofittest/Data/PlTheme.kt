package com.example.retrofittest.Data

import com.google.gson.annotations.SerializedName

data class PlTheme(
    @SerializedName("theme_id") var themeId: String,
    @SerializedName("pl_theme_id") var plThemeId: String,
    @SerializedName("pl_theme_name") var plThemeName: String,
    // @SerializedName("descriptor") var descriptor: List<Desc>,
    // @SerializedName("playList1") var playList1: List<PlayList>,
    // @SerializedName("playList2") var playList2: List<PlayList>
     @SerializedName("descriptor") var descriptor: List<String>,
     @SerializedName("playList1") var playList1: List<String>,
     @SerializedName("playList2") var playList2: List<String>
)