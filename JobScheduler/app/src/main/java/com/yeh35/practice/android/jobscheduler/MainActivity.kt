package com.yeh35.practice.android.jobscheduler

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "MainActivity"
        const val JOB_ID_1 = 145
        const val JOB_ID_2 = 245
        const val JOB_ID_3 = 345
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnJob1: Button = findViewById(R.id.btnJob1)
        val btnJob2: Button = findViewById(R.id.btnJob2)
        val btnJob3: Button = findViewById(R.id.btnJob3)

        // 1회성
        btnJob1.setOnClickListener {
            val js = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
            val serviceComponent = ComponentName(this, MyJobService::class.java)
            val jobInfo = JobInfo.Builder(JOB_ID_1, serviceComponent)
                .setMinimumLatency(TimeUnit.MINUTES.toMillis(1))
                .setOverrideDeadline(TimeUnit.MINUTES.toMillis(3))
                .build()
            js.schedule(jobInfo)
        }

        // 주기
        btnJob2.setOnClickListener {
            val js = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
            val serviceComponent = ComponentName(this, MyJobService::class.java)
            val jobInfo = JobInfo.Builder(JOB_ID_2, serviceComponent)
                .setPeriodic(TimeUnit.MINUTES.toMillis(15))
                .build()
            js.schedule(jobInfo)
        }

        //제약조건 설정
        btnJob3.setOnClickListener {
            val js = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler
            val serviceComponent = ComponentName(this, MyJobService::class.java)
            val jobInfo = JobInfo.Builder(JOB_ID_3, serviceComponent)
                .setRequiresDeviceIdle(true)
                .setRequiresCharging(true)
                .setPeriodic(TimeUnit.MINUTES.toMillis(15))
                .build()
            js.schedule(jobInfo)
        }

    }


}