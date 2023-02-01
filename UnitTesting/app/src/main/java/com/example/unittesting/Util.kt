package com.example.unittesting

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Util {
    suspend fun getUserName():String{
        delay(10000)
        return "Vinay"
    }

    suspend fun getuser():String{
        CoroutineScope(Dispatchers.Main).launch{
            delay(2000)
        }
        return "Vinay Lakshmi Mandira"
    }
}