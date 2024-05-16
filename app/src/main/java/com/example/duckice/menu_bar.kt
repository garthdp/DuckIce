package com.example.duckice

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
private val Frag1 = eat_fragment()
private val Frag2 = play_fragment()
private  val Frag3 = bath_fragment()

class menu_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        replaceFrag(Frag1)
        val bottomBar = findViewById<BottomNavigationView>(R.id.NavBar)
        val duckStats : TextView = findViewById(R.id.duckStats)
        duckStats.text = message
        bottomBar.setOnItemSelectedListener{
            when(it.itemId)
            {
                R.id.ic_food->replaceFrag(Frag1)
                R.id.ic_play->replaceFrag(Frag2)
                R.id.ic_bath->replaceFrag(Frag3)
            }
            true
        }
    }

    private fun replaceFrag(fragment: Fragment){
        if(fragment!=null)
        {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.commit()
        }
    }
}