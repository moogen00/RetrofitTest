package com.example.retrofittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiService = RestApiService()
        apiService.getData() {
//            if (it?.themeId != null) {
//                // it = newly added user parsed as response
//                // it?.id = newly added user ID
//            } else {
//                Log.d("MainActivity", "Error registering new user")
//            }
        }
    }




//    fun addDummyUser() {
//        val apiService = RestApiService()
//        apiService.getTheme() {
//            if (it?.themeId != null) {
//                // it = newly added user parsed as response
//                // it?.id = newly added user ID
//            } else {
//                Log.d("MainActivity","Error registering new user")
//            }
//        }
//    }
}