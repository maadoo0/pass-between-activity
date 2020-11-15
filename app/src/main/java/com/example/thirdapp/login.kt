package com.example.thirdapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlin.Boolean as Boolean

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val rgstrbtn = findViewById<Button>(R.id.rgsterbtn1)
        val loginbtn = findViewById<Button>(R.id.loginbtn1)
        val usernum = findViewById<EditText>(R.id.phone)
        var username = usernum.text.toString()
        val userpswrd = findViewById<EditText>(R.id.pswrd)
        var password = userpswrd.text.toString()

        rgstrbtn.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            rgstrbtn.startAnimation(animation)
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

            loginbtn.setOnClickListener {
                loginbtn.setTextColor(getColor(R.color.green))
                val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                }



        }

    }
