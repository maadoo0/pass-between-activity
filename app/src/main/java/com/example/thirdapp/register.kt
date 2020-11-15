package com.example.thirdapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val usrname = findViewById<EditText>(R.id.u1)
        val  usrnamee= usrname.text.toString()
        val number = findViewById<EditText>(R.id.n1)
        val numberr = number.text.toString()
        val password = findViewById<EditText>(R.id.p1)
        val passwordd = password.text.toString()
        val passwordconf = findViewById<EditText>(R.id.p2)
        val passworddconf = passwordconf.text.toString()
        val rgsterbtn2 = findViewById<Button>(R.id.rgsterbtn2)
        rgsterbtn2.setOnClickListener {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
                finish()



        }
    }
}