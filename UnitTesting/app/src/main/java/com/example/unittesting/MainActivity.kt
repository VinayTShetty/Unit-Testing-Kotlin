package com.example.unittesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sendData = findViewById<Button>(R.id.submit_data)
        val data = findViewById<EditText>(R.id.data_txtvw)
        val desc = findViewById<EditText>(R.id.description_txtvw)
        sendData.setOnClickListener {
            val intent = Intent(this, Second::class.java)
            intent.putExtra("DATA",data.text.toString())
            intent.putExtra("DESCRIPTION",desc.text.toString())
            startActivity(intent)
        }
    }
}