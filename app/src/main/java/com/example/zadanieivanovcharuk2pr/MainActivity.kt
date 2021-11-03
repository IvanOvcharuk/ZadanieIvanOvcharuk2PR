package com.example.zadanieivanovcharuk2pr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba1 = 0;
        var liczba2 = 0;
        var odpowiedz = 0;
        findViewById<Button>(R.id.zast).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextInputEditText>(R.id.wprowadzenie).text
        }
        findViewById<Button>(R.id.dod).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() + findViewById<TextInputEditText>(R.id.wprowadzenie).text.toString()
        }
        findViewById<Button>(R.id.dodawanie).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() + findViewById<TextInputEditText>(R.id.wprowadzenie).text
            liczba1 = findViewById<EditText>(R.id.Pierwszaliczba).text.toString().toInt()
            liczba2 = findViewById<EditText>(R.id.Drugaliczba).text.toString().toInt()
            odpowiedz = liczba1 + liczba2
            findViewById<TextView>(R.id.textView).text = odpowiedz.toString()

        }
    }


    }
