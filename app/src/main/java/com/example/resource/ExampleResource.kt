package com.example.resource

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton


class ExampleResource : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resource_example)
        val buttonFirst = findViewById<AppCompatButton>(R.id.button_signup) as AppCompatButton
        buttonFirst.setOnClickListener {
            startActivity(Intent(this@ExampleResource, TwoScreem::class.java))
        }
    }
}