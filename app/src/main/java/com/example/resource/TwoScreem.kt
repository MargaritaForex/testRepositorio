package com.example.resource

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import kotlinx.android.synthetic.main.resource_example.*
import kotlinx.android.synthetic.main.screem_two.view.*


class TwoScreem : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screem_two)
        val retornar = findViewById<AppCompatButton>(R.id.retornar) as AppCompatButton
        retornar.setOnClickListener {
            startActivity(Intent(this@TwoScreem, ExampleResource::class.java))
        }


    }
}

