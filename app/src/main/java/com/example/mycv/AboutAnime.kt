package com.example.mycv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutAnime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_anime)
        val nazad = findViewById<Button>(R.id.nazad_button)

        nazad.setOnClickListener{
            val  intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}