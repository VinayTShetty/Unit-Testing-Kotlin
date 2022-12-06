package com.example.unittesting.Utils.Helper

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class UtilsFunctionsTest {

    lateinit var utilsFunctions_inst: UtilsFunctions;

    @Before
    fun setup(){
        utilsFunctions_inst=UtilsFunctions();
        println("Before Test Case")
    }

    @After
    fun tearDown(){
        println("After Test")
    }

    @Test
    fun `is_Input_Data_palindrome`() {
        var result = utilsFunctions_inst.isPalinDrome("Hellow")
        assertEquals(false, result)
    }

    @Test
    fun `not_palindrome`() {
        //Act
        var result = utilsFunctions_inst.isPalinDrome("Level")
        assertEquals(true, result)
    }
}