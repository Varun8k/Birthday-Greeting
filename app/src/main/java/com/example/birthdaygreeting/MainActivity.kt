package com.example.birthdaygreeting

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val name = findViewById<TextView>(R.id.name).text.toString()
            val intent = Intent(this, Birthdaycard::class.java).putExtra(Birthdaycard.name, name)
            startActivity(intent)
        }
    }

}