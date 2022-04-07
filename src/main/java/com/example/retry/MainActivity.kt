package com.example.retry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.number1)
        val num2 = findViewById<EditText>(R.id.number2)
        val bu1 = findViewById<Button>(R.id.bu1)
        val bu2 = findViewById<Button>(R.id.bu2)
        val bu3 = findViewById<Button>(R.id.bu3)
        val bu4 = findViewById<Button>(R.id.bu4)
        val values = findViewById<TextView>(R.id.values)

        bu1.setOnClickListener {
            values.text = (Integer.parseInt(num1.text.toString()) + Integer.parseInt(num2.text.toString())).toString()
        }

        bu2.setOnClickListener {
            values.text = (Integer.parseInt(num1.text.toString()) - Integer.parseInt(num2.text.toString())).toString()
        }

        bu3.setOnClickListener {
            values.text = (Integer.parseInt(num1.text.toString()) * Integer.parseInt(num2.text.toString())).toString()
        }

        bu4.setOnClickListener {
            values.text = (Integer.parseInt(num1.text.toString()) / Integer.parseInt(num2.text.toString())).toString()
        }
    }
}


