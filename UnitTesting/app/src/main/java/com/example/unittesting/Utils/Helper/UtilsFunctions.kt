package com.example.unittesting.Utils.Helper

class UtilsFunctions {
    fun isPalinDrome(inputData:String):Boolean{
        val sb = StringBuilder(inputData)
        //reverse the string
        val reverseStr = sb.reverse().toString()
        //compare reversed string with input string
        return inputData.equals(reverseStr, ignoreCase = true)
    }
}