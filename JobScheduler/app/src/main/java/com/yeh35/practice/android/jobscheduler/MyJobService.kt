package com.yeh35.practice.android.jobscheduler

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class MyJobService : JobService() {

    override fun onStartJob(params: JobParameters): Boolean {
        Log.d(this.javaClass.name, "onStatJob: ${params.jobId}")
        return false
    }

    override fun onStopJob(params: JobParameters): Boolean {
        Log.d(this.javaClass.name, "onStopJob: ${params.jobId}")
        return false
    }
}