package com.example.homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstScreen : Fragment(R.layout.fragment_first_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.to_dog_page)
        button.setOnClickListener {
            (requireActivity() as MainActivity).todogpage()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            FirstScreen()
            }
    }
