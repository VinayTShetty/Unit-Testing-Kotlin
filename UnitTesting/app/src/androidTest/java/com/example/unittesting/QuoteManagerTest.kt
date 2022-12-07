package com.example.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class QuoteManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun populateQuoteFromAssests() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssests(context, "")
    }

    /**
    We will get a Exception in the output and hence its correct.

    java.io.FileNotFoundException:
    at android.content.res.AssetManager.nativeOpenAsset(Native Method)
    at android.content.res.AssetManager.open(AssetManager.java:824)
    at android.content.res.AssetManager.open(AssetManager.java:801)
    at com.example.unittesting.QuoteManager.populateQuoteFromAssests(QuoteManager.kt:13)
    at com.example.unittesting.QuoteManagerTest.populateQuoteFromAssests(QuoteManagerTest.kt:25)
     */
}