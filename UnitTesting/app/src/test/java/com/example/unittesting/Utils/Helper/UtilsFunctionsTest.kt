package com.example.unittesting.Utils.Helper

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class UtilsFunctionsTest {

    @Test
    fun `is_Input_Data_palindrome`() {
        /**
         * 1)Arrrange
         * 2)Act
         * 3)Assert
         */
        //Arrange
        var utilClass = UtilsFunctions()
        //Act
        var result = utilClass.isPalinDrome("Hellow")
        assertEquals(false, result)
    }

    @Test
    fun `not_palindrome`() {
        /**
         * 1)Arrrange
         * 2)Act
         * 3)Assert
         */
        //Arrange
        var utilClass = UtilsFunctions()
        //Act
        var result = utilClass.isPalinDrome("Level")
        assertEquals(true, result)
    }
}