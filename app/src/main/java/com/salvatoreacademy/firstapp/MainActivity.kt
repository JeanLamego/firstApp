package com.salvatoreacademy.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btSend = findViewById<Button>(R.id.btSend)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etName = findViewById<TextView>(R.id.etName)
        val btNextPage = findViewById<Button>(R.id.btNextPage)

        btNextPage.setOnClickListener{
            openNextActivity()

        }
        btSend.setOnClickListener {
            tvResult.text = etName.text.toString();
        }

    }
    private fun openNextActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}