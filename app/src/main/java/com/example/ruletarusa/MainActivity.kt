package com.example.ruletarusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uno = findViewById(R.id.button) as Button
        val dos = findViewById(R.id.button2) as Button
        val tres = findViewById(R.id.button3) as Button
        val cuatro = findViewById(R.id.button4) as Button
        val cinco = findViewById(R.id.button5) as Button
        val seis = findViewById(R.id.button6) as Button

        val reload = findViewById(R.id.button7) as Button

    }
/**/
}