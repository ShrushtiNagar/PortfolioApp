package com.example.portfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val btnEduBack= findViewById<Button>(R.id.btnEduBack)
        btnEduBack.setOnClickListener {
            finish()
        }
    }
}