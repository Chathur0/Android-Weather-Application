package com.example.weather

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun onCloceBtnonClick(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun currentBtnOnClick(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun forecastBtnOnClick(view: View){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
        finish()
    }

    fun historyBtnOnClick(view: View){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
        finish()
    }
    fun mapBtnOnClick(view: View){
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
        finish()
    }
}