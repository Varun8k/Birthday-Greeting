package com.example.birthdaygreeting

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthdaycard : AppCompatActivity() {
    companion object {
        const val name = ""
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaycard)
        val name = intent.getStringExtra(name)?.capitalize()
        findViewById<TextView>(R.id.textView).text = "Happy\n Birthday\n$name"
    }
}