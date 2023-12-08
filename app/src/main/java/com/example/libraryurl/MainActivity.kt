package com.example.libraryurl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testinglibrary.Sample

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var s : Sample = Sample()
        s.callMsg(this,"test")
    }
}