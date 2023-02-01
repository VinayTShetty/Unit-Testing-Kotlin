package com.example.unittesting

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
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
         * To avoid waiting time on the delay function in the coroutine.runTest can be used.
         * As its a part of the library
           testImplementation 'org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4'
         */
        val sut=Util()
        runTest {
            sut.getUserName()
        }
    }

    @Test
    fun getUser(){
        /**
         * Ater running the Test case.
         * Error :- Module with the Main dispatcher had failed to initialize. For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used
         */
        val sut=Util()
        runTest {
            sut.getuser()
        }
    }
}