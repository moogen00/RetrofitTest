package com.example.retrofittest

import android.content.Context
import android.widget.Toast

// 이제 인자로 context도 받아야 함에 유의해주세요.
// 이 완전히 독립적인 함수에서 this는 아무런 의미가 없답니다 그렇죠?
fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}