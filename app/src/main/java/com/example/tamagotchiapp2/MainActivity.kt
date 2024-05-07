package com.example.tamagotchiapp2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {

    //declare variables
    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialise variables
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)


        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}