package com.salvatoreacademy.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val etEmailInput = findViewById<TextView>(R.id.etEmaiInput)
        val btSendEmail = findViewById<Button>(R.id.btSendEmail)



        btSendEmail.setOnClickListener{
            tvEmail.text = etEmailInput.text.toString()
    }


    }
}