package com.example.unittesting

import kotlinx.coroutines.*

class Util(val dispatcher: CoroutineDispatcher) {
    suspend fun getUserName(): String {
        delay(10000)
        return "Vinay"
    }

    suspend fun getuser(): String {
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
        }
        return "Vinay Lakshmi Mandira"
    }

    suspend fun getAddress():String{
        withContext(dispatcher) {
            delay(2000)
        }
        return "Vinay Lakshmi Mandira \n UK London"
    }

    var globalarg=false
    suspend fun coroutineExecuteCheck(){
        CoroutineScope(dispatcher).launch{
            delay(1000)
            globalarg=true
        }
    }
}