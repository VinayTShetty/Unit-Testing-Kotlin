package com.example.unittesting


import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import kotlinx.coroutines.runBlocking
import org.junit.*

class Quotes_Dao_Test {

    //https://developer.android.com/reference/androidx/arch/core/executor/testing/InstantTaskExecutorRule
    /**
     * Its used to Run the synchronously the Test cases.
     */
    @get:Rule
    val instantExecutorRule=InstantTaskExecutorRule()

    lateinit var quotesDataBase: QuotesDataBase
    lateinit var quotesDao: Quotes_Dao

    @Before
    fun setup(){
        /**
         * This will create a DataBase untill the application Run and later Delete It.
         */
//        val context = ApplicationProvider.getApplicationContext<Context>()
//        quotesDataBase = Room.inMemoryDatabaseBuilder(context, QuotesDataBase::class.java).allowMainThreadQueries().build()
//        quotesDao = quotesDataBase.quoteDao()

        quotesDataBase= Room.inMemoryDatabaseBuilder(ApplicationProvider.getApplicationContext(),QuotesDataBase::class.java).allowMainThreadQueries().build()
        quotesDao=quotesDataBase.quoteDao();
    }


    @Test
    fun insertQuotes()= runBlocking{
        /**
         * Main Thread will be blocked untill the below code is completed.
         */
        val quotes=Quotes(1,"All is Well","3 Idiots")
     //   quotesDao.insertQuote(Quotes(1,"All is Well","3 Idiots"))
        quotesDao.insertQuote(quotes)
        /**
         * Here getQuotes() will return the Live Data.
         * We need to Observe the Live Data.But we are not applying any Logic to Observe here.
         *
         * we will apply the getOrAwaitValue() value so that the Data is Obtained ,Automatically from the class Provided from Google.
         */
        println("Demo Test")
       var result= quotesDao.getQuotes().getOrAwaitValue()
        Assert.assertEquals(1,result.size)
        Assert.assertEquals("All is Well",result[0].text)
        println("Demo Work")
    }

    @After
    fun teardown(){
        quotesDataBase.close()
    }

}