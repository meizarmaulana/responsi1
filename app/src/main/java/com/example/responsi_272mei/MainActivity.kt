package com.example.responsi_272mei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbtn.setOnClickListener {
            val email = user.text.toString()
            val password = pass.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "fuadazhari@gmail.com" || password == "5170411293") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }


        btnregistrasi.setOnClickListener{
            val intent = Intent (this, ActivityRegistrasi::class.java)
            startActivity(intent)
        }
    }
}

