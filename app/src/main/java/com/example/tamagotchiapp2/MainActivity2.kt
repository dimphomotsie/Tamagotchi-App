package com.example.tamagotchiapp2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    //declare variables
    private  lateinit var imageView2: ImageView
    private lateinit var buttonFeed: Button
    private lateinit var buttonClean: Button
    private lateinit var buttonPlay: Button
    private lateinit var updateStatus: TextView

    private var hunger = 10
    private var cleanliness = 10
    private var happiness = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //initialise variables
        imageView2 = findViewById(R.id.imageView2)
        buttonFeed = findViewById(R.id.buttonFeed)
        buttonClean = findViewById(R.id.buttonClean)
        buttonPlay = findViewById(R.id.buttonPlay)
        updateStatus = findViewById(R.id.updateStatus)

        //set onClickListeners for Buttons
        buttonFeed.setOnClickListener { onButtonFeedClicked() }
        buttonClean.setOnClickListener { onButtonCleanClicked() }
        buttonPlay.setOnClickListener { onButtonPlayClicked() }

        updateStatusValues()
    }

    private fun onButtonFeedClicked() {
        imageView2.setImageResource(R.drawable.feed)

        hunger += 10
        cleanliness -= 4
        happiness -= 7
        if (happiness > 10) happiness = 10

        updateStatusValues()
    }

    private fun onButtonCleanClicked() {
        imageView2.setImageResource(R.drawable.clean)

        hunger += 10
        cleanliness += 10
        happiness -= 7

        updateStatusValues()
    }

    private fun onButtonPlayClicked() {
        imageView2.setImageResource(R.drawable.play)

        hunger += 10
        cleanliness += 10
        happiness += 10

        updateStatusValues()
    }

    private fun updateStatusValues() {

        val statusText = "Hunger: $hunger\nCleanliness: $cleanliness\nHappiness: $happiness"
        updateStatus.text =statusText


    }
}