package com.example.firstmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val showing = findViewById<TextView>(R.id.textView)
        val sent = intent.getStringExtra("Information")
        showing.text = sent
    }
}