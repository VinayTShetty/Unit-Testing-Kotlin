package com.example.unittesting

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Quotes::class], version = 1)
abstract class QuotesDataBase : RoomDatabase() {
    abstract fun quoteDao():Quotes_Dao
}



/**
 *  No need to write Test case for this class as its just following the template
 */