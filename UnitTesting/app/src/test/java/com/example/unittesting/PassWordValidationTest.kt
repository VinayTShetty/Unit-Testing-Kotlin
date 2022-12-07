package com.example.unittesting

import org.junit.Assert.*

import org.junit.Test

class PassWordValidationTest {

    @Test
    fun validPassword() {
        val sut=PassWordValidation()
       val result= sut.validPassword("Pass123")
        assertEquals("Valid Input",result)
    }

    @Test
    fun validPasswordTest(){
        val sut=PassWordValidation()
        val result=sut.reverseInputString("Vinay")
        assertEquals("yaniV",result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun validPasswordTest_ExceptionCheck(){
        val sut=PassWordValidation()
        val result=sut.reverseInputString( null)
    }
}