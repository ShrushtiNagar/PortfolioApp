package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

        val btnWorkBack = findViewById<Button>(R.id.btnWorkBack)
        btnWorkBack.setOnClickListener {
            finish()
        }
    }
}