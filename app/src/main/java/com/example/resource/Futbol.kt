package com.example.resource

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class Futbol : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.futbol)
        val retornar =findViewById<AppCompatButton>(R.id.futbol_return) as AppCompatButton
        retornar.setOnClickListener {
            startActivity(Intent(this@Futbol, TwoScreem::class.java))
        }
    }
}