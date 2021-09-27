package com.example.firstmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar.make
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userName = findViewById<EditText>(R.id.Name)
        val userLocation = findViewById<EditText>(R.id.Location)
        val userMobile = findViewById<EditText>(R.id.Mobile)
        val Final = findViewById<TextView>(R.id.Info)
        val ShToast = findViewById<Button>(R.id.button)
        ShToast.setOnClickListener{
            val Information = "${userName.text.toString()}" +" "+ "${userLocation.text.toString()}" +" "+ "${userMobile.text.toString()}"
            Toast.makeText(applicationContext, Information,Toast.LENGTH_SHORT).show()
        }
        val TextView =  findViewById<Button>(R.id.button2)
        TextView.setOnClickListener{
            val Information = "${userName.text.toString()}" +" "+ "${userLocation.text.toString()}" +" "+ "${userMobile.text.toString()}"
            Final.text= Information
        }
        val newact = findViewById<Button>(R.id.button3)
        newact.setOnClickListener{
            val Information = "${userName.text.toString()}" +" "+ "${userLocation.text.toString()}" +" "+ "${userMobile.text.toString()}"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Information", Information)
            startActivity(intent)
        }

    }
}
