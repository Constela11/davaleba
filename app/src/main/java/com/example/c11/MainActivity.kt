package com.example.c11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val displayName = findViewById<TextView>(R.id.displayName)
        val okayButton = findViewById<Button>(R.id.okayButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        displayName.text = "Hello, Name"

        okayButton.setOnClickListener {
            val name = nameInput.text.toString()
            displayName.text = "Hello, $name"
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
