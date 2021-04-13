package com.yeh35.practice.android.testing.unit

import org.junit.Assert.assertEquals
import org.junit.Test

class SimpleFunctionTest {

    @Test
    fun test_echo() {
        val text = "hello"

        assertEquals(text, SimpleFunction().echo(text))
    }

}