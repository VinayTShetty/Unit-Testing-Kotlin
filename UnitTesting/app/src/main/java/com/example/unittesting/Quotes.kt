package com.example.unittesting

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Quotes(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val text: String,
    val author: String
)


/**
 *  No need to write Test case for this class as its just following the template
 */

