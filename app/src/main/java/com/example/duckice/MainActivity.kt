package com.example.duckice

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

val duck : Duck = Duck(0, 0, 0)
var message = "Hunger = ${duck.Hunger}%\nFun = ${duck.Fun}%\nClean = ${duck.Clean}%"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, menu_bar::class.java)
        startActivity(intent)
    }
}

data class Duck(
    var Hunger : Int,
    var Fun : Int,
    var Clean : Int
)