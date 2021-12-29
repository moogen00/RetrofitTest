package com.example.retrofittest
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class RestApiService {
    fun getData(onResult: (Result) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getTheme().enqueue(
            object : Callback<Result> {
                override fun onFailure(call: Call<Result>, t: Throwable) {
                    // onResult(null)
                    Log.d("RestAPiService", "=============== failure")
                    Log.d("RestAPiService", "Response = $t")
                }
                override fun onResponse(call: Call<Result>, response: Response<Result>) {
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
}