package com.yeh35.practice.android.testing.unit

import android.content.Context
import android.widget.TextView
import androidx.test.core.app.ApplicationProvider
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class SimpleViewTest {

    private val context = ApplicationProvider.getApplicationContext<Context>()

    @Test
    fun test_text() {
        val view = TextView(context)
        val text = "Hello"

        view.text = text
        assertEquals(text, view.text.toString())
    }
}