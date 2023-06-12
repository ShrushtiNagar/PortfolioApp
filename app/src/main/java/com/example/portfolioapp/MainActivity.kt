package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSkills = findViewById<Button>(R.id.btnSkills)
        val btnEducation = findViewById<Button>(R.id.btnEducation)
        val btnWork = findViewById<Button>(R.id.btnWork)
        val btnAchievements = findViewById<Button>(R.id.btnAchievements)

        btnSkills.setOnClickListener {
            val intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        btnEducation.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }
        btnWork.setOnClickListener {
            intent = Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }
        btnAchievements.setOnClickListener {
            intent = Intent(this,AchievementsActivity::class.java)
            startActivity(intent)
        }
    }
}