package com.example.c11

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val counterDisplay = findViewById<TextView>(R.id.counterDisplay)
        val clickButton = findViewById<Button>(R.id.clickButton)

        var count = 0

        clickButton.setOnClickListener {
            count++
            counterDisplay.text = count.toString()
        }
    }
}
