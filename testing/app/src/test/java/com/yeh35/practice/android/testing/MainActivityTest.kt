package com.yeh35.practice.android.testing

import android.os.Build
import androidx.test.core.app.ActivityScenario
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Config(sdk = [Build.VERSION_CODES.O, Build.VERSION_CODES.P])
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    @Test
    fun create_main_activity() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        scenario.onActivity { activity ->
            assertEquals("MainActivity", activity.getName())
        }
    }

}