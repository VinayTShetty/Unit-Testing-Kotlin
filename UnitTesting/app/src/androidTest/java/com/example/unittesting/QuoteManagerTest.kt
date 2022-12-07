package com.example.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssests() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssests(context, "")
    }

    @Test(expected = JsonSyntaxException::class)
    fun invalid_JSON() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssests(context, "malformed.json")
    }

    @Test
    fun testPopularQuotesfromAssests_valid_JSON_COUNT() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssests(context, "quotes.json")
        assertEquals(193, quoteManager.quotelist.size)
    }

    @Test
    fun testPreviousQuotes_expected() {
        //Arrange
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(
            (arrayOf(
                Quote("This is Frsit Quote", "1"),
                Quote("This is Second Quote", "2"),
                Quote("This is Third Quote", "3"),
            ))
        )
        //Act
        val quote = quoteManager.getPreviousQuote()
        //Assert
        assertEquals("1", quote.author)
    }

    @Test
    fun testNextQuotes_expected() {
        //Arrange
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(
            (arrayOf(
                Quote("This is Frsit Quote", "1"),
                Quote("This is Second Quote", "2"),
                Quote("This is Third Quote", "3"),
            ))
        )
        //Act
        val quote = quoteManager.getNextQuote()
        //Assert
        assertEquals("2", quote.author)
    }
}