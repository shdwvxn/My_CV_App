package com.example.mycv

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lol = findViewById<ImageButton>(R.id.my_image)
        lol.setOnClickListener {
            Log.d("MainActivity", "onCreate: button pressed")
            try {
                val intent = Intent(this, AboutBooks::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting AboutBooks activity", e)
            }

        }
        val lmao =findViewById<ImageButton>(R.id.my_png)
        lmao.setOnClickListener{
            val intent = Intent (this, AboutAnime::class.java)
            startActivity(intent)
        }
        val contact = findViewById<TextView>(R.id.Myinsta)
        contact.setOnClickListener{
            val url = "https://www.youtube.com/watch?v=BPEdXRyz9xQ"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}


