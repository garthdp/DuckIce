package com.example.duckice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [play_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class play_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_play_fragment,container,false)
        val layout1 = inflater.inflate(R.layout.activity_menu_bar,container,false)
        val duckStats = layout1.findViewById<TextView>(R.id.duckStats)
        val btnPlay : Button = layout.findViewById(R.id.btnPlay)
        btnPlay.setOnClickListener{
            duck.Fun += 10
            duckStats.text = ""
        }
        return layout
    }
}