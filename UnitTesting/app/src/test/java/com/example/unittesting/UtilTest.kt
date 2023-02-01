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
import org.junit.Rule
import org.junit.Test

class UtilTest {

    @get:Rule
    val mainCoroutineRule=MainCoroutineRule()

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun getUserName() {
        val sut=Util(mainCoroutineRule.testDispatcher)
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
        val sut=Util(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getuser()
        }
    }

    @Test
    fun getAddress(){
        val sut=Util(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getAddress()
        }
    }
}


