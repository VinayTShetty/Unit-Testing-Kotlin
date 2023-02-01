package com.example.unittesting

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class UtilTest {

    private val dispatcher= StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(dispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun getUserName() {
        /**
         * To avoid waiting time on the delay function in the coroutine.runTest can be used.
         * As its a part of the library
           testImplementation 'org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4'
         */
        val sut=Util(dispatcher)
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
        val sut=Util(dispatcher)
        runTest {
            sut.getuser()
        }
    }

    @Test
    fun getAddress(){
        /**
         * Ater running the Test case.
         * Error :- Module with the Main dispatcher had failed to initialize. For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used
         */
        val sut=Util(dispatcher)
        runTest {
            sut.getAddress()
        }
    }
}


/**
 * https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-standard-test-dispatcher.html
 * Notes:- In the application if there is a main dispacther used anywhere ,Don t change it.
 * when ever there is a request for the Dispatcher use this Dispatcher.
 */