package com.yeh35.practice.android.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvHello = findViewById<TextView>(R.id.tv_hello)
        tvHello.setOnClickListener {
            tvHello.text = "on! Click"
        }
    }

    fun getName(): String {
        return "MainActivity"
    }
}