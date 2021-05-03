package com.yeh35.practice.android.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSomeThing: Button = findViewById(R.id.btn_something)
        btnSomeThing.setOnClickListener {

            val workManager = WorkManager.getInstance(this)
            workManager.enqueue(somethingWorkerRequest)
        }
    }
}