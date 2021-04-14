package com.yeh35.practice.android.testing

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityAndroidTest {

    @get:Rule
    var mActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun create_activity() {
        val text = "Hello World!"
        val clickedText = "on! Click"

        onView(withId(R.id.tv_hello)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(text)))

            perform(click())
            check(matches(withText(clickedText)))
        }
    }
}