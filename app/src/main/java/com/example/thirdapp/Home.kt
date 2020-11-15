package com.example.thirdapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val helloworld = findViewById<TextView>(R.id.world)
        val animation = AnimationUtils.loadAnimation(this , R.anim.fade_in)
        helloworld.startAnimation(animation )

    }
}