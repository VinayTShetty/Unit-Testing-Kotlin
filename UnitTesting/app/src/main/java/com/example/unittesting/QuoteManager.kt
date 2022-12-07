package com.example.unittesting

import android.content.Context
import com.google.gson.Gson
import java.nio.charset.Charset


class QuoteManager {
    var quotelist = emptyArray<Quote>()
    var currentQuoteIndex = 0

    fun populateQuoteFromAssests(context: Context, fileName: String) {
        val inputStream = context.assets.open(fileName)
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quotelist = gson.fromJson(json, Array<Quote>::class.java)
    }

    fun populateQuotes(quotes: Array<Quote>) {
        quotelist = quotes
    }

    fun getCurrentQuote(): Quote {
        return quotelist[currentQuoteIndex]
    }

    fun getNextQuote(): Quote {
    if(currentQuoteIndex==quotelist.size-1)return  quotelist[currentQuoteIndex]
        return quotelist[++currentQuoteIndex]
    }

    fun getPreviousQuote(): Quote {
        if(currentQuoteIndex==0)return  quotelist[currentQuoteIndex]
        return quotelist[--currentQuoteIndex]
    }
}