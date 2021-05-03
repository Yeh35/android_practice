package com.yeh35.practice.android.workmanager

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.util.Log
import androidx.work.*
import java.time.Duration
import java.time.LocalDateTime
import java.time.Period

class SomethingWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {

        Log.d("SomethingWorker", "doWork")

        return Result.success()
    }
}

private val constraints = Constraints.Builder()
    .setRequiredNetworkType(NetworkType.CONNECTED)
    .setRequiresCharging(true)
    .build()

@SuppressLint("NewApi")
fun convertDuration(dateTime: LocalDateTime): Duration {
    val now = LocalDateTime.now()
    return Duration.between(now, dateTime)
}

var somethingWorkerRequest = OneTimeWorkRequestBuilder<SomethingWorker>()
    .setConstraints(constraints)

    .build()