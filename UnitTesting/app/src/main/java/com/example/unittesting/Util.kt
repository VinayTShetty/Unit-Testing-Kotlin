package com.example.unittesting

import kotlinx.coroutines.delay

class Util {
    suspend fun getUserName():String{
        delay(10000)
        return "Vinay"
    }
}