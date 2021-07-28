package com.example.pointofsale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice() {
        val randomInt = (1..9).random()

        val resultText: TextView = findViewById(R.id.rolling_text)
        resultText.text = randomInt.toString()
    }
}