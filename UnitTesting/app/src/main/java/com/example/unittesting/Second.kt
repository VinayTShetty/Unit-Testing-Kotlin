package com.example.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val receiveData = findViewById<TextView>(R.id.data_details)
        val data=intent.getStringExtra("DATA")
        val description=intent.getStringExtra("DESCRIPTION")
        receiveData.text=data+""+description
    }
}

