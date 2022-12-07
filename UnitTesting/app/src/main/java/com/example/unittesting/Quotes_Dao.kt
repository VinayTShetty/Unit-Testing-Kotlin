package com.example.unittesting

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface Quotes_Dao {

    @Insert
    suspend fun insertQuote(quotes: Quotes)

    @Update
    suspend fun updateQuotes(quotes: Quotes)

    @Query("Delete from Quotes")
    suspend fun deletequotes()

    @Query("Select * from Quotes")
    suspend fun getQuotes():LiveData<List<Quotes>>

    @Query("Select * from Quotes where id=:quoteId")
    suspend fun getQuotesFromId(quoteId:Int):Quotes
}


/**
 *  Need to write the Test case for this class.As its functionality is defined by programmers.
 */