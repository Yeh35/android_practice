package com.yeh35.practice.android.customeview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.text)

        text.setOnTouchListener { _, event ->
            val offset  = text.getOffsetForPosition(event.x, event.y)
            Log.d(TAG, "offset $offset")
            false
        }

    }

    companion object {
        private const val TAG = "touch get Text"
    }
}