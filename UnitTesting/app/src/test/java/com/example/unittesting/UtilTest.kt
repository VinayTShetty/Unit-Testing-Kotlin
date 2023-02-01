package com.example.unittesting

import kotlinx.coroutines.runBlocking
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class UtilTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun getUserName() {
        /**
         * Drawback on this is,It will take the delay of around 10 seconds from the method which is needed to be tested.
         */
        val sut=Util()
        runBlocking {
            sut.getUserName()
        }
    }
}