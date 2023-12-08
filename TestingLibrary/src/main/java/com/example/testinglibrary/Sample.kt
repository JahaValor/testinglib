package com.example.testinglibrary

import android.content.Context
import android.widget.Toast


class Sample {
    fun callMsg(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}