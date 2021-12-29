package com.example.retrofittest

import com.google.gson.annotations.SerializedName

data class Theme (
    @SerializedName("theme_id") val themeId: String?,
    @SerializedName("theme_name") val themeName: String?,
    @SerializedName("theme_name_eng") val themeNameEng: String?,
)
// {
//    "theme_id": "1",
//    "theme_name": "Fresh start ",
//    "theme_name_eng": "Fresh start "
// }


//data class UserInfo (
//    @SerializedName("user_id") val userId: Int?,
//    @SerializedName("user_name") val userName: String?,
//    @SerializedName("user_email") val userEmail: String?,
//    @SerializedName("user_age") val userAge: String?,
//    @SerializedName("user_uid") val userUid: String?
//)