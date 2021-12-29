package com.example.retrofittest
import android.util.Log
import com.example.retrofittest.Data.MoodCategory
import com.example.retrofittest.Data.ThemeResult
import com.example.retrofittest.Data.SmartPlayList
import com.example.retrofittest.Data.SmartPlayListParam
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {
    fun getData(onResult: (ThemeResult) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getTheme().enqueue(
            object : Callback<ThemeResult> {
                override fun onFailure(call: Call<ThemeResult>, t: Throwable) {
                    // onResult(null)
                    Log.d("RestAPiService", "=============== failure")
                    Log.d("RestAPiService", "Response = $t")
                }
                override fun onResponse(call: Call<ThemeResult>, response: Response<ThemeResult>) {
                    Log.d("RestAPiService", "=============== response")
                    val res = response.body()?.result
                    if (res != null) {
                        for (theme in res) {
                            Log.d("RestAPiService", "theme.themeId = ${theme.themeId}")
                        }
                    }
                }
            }
        )
    }



    fun getAA(){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getTheme().enqueue(
            object : Callback<ThemeResult> {
                override fun onFailure(call: Call<ThemeResult>, t: Throwable) {
                    // onResult(null)
                    Log.d("RestAPiService", "=============== failure")
                    Log.d("RestAPiService", "Response = $t")
                }
                override fun onResponse(call: Call<ThemeResult>, response: Response<ThemeResult>) {
                    Log.d("RestAPiService", "=============== response")
                    val res = response.body()?.result
                    if (res != null) {
                        for (theme in res) {
                            Log.d("RestAPiService", "theme.themeId = ${theme.themeId}")
                        }
                    }
                }
            }
        )
    }

    fun getSmartPlayList(param: SmartPlayListParam){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getSmartPlayList(param).enqueue(
            object : Callback<SmartPlayList> {
                override fun onFailure(call: Call<SmartPlayList>, t: Throwable) {
                    // onResult(null)
                    Log.d("RestAPiService", "=============== getSmartPlayList failure")
                    Log.d("RestAPiService", "Response = $t")
                }
                override fun onResponse(call: Call<SmartPlayList>, response: Response<SmartPlayList>) {
                    Log.d("RestAPiService", "=============== getSmartPlayList response")
                    val theme_id = response.body()?.themeId
                    val theme_name = response.body()?.themeName
                    Log.d("RestAPiService", "theme_id = ${theme_id}")
                    Log.d("RestAPiService", "theme_name = ${theme_name}")

                    val pl_theme = response.body()?.plTheme
                    if (pl_theme != null) {
                        for (theme in pl_theme) {
                            Log.d("RestAPiService", "theme.themeId = ${theme.themeId}")
                            Log.d("RestAPiService", "theme.plThemeId = ${theme.plThemeId}")
                            Log.d("RestAPiService", "theme.plThemeName = ${theme.plThemeName}")

                            for(item in theme.descriptor) {
                                Log.d("RestAPiService", "item = ${item}")
                            }
                            for(item in theme.playList1) {
                                Log.d("RestAPiService", "itemPlayList1 = ${item}")
                            }
                            for(item in theme.playList2) {
                                Log.d("RestAPiService", "itemPlayList2 = ${item}")
                            }

                        }
                    }
                }
            }
        )
    }

    fun getMoodCategoryList(mood: String){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getMoodCategoryList(mood).enqueue(
            object : Callback<MoodCategory> {
                override fun onFailure(call: Call<MoodCategory>, t: Throwable) {
                    // onResult(null)
                    Log.d("RestAPiService", "=============== getMoodCategoryList failure")
                    Log.d("RestAPiService", "Response = $t")
                }
                override fun onResponse(call: Call<MoodCategory>, response: Response<MoodCategory>) {
                    Log.d("RestAPiService", "=============== getMoodCategoryList response")
                    val mood_list = response.body()?.moodList

                    if (mood_list != null) {
                        for (item in mood_list) {
                            Log.d("RestAPiService", "item.name = ${item.name}")
                            Log.d("RestAPiService", "item.id = ${item.id}")
                        }
                    }
                }
            }
        )
    }



}