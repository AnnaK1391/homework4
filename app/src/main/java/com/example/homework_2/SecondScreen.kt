package com.example.homework_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondScreen : Fragment(R.layout.fragment_second_screen4) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.tocatpage)
        button.setOnClickListener {
            (requireActivity() as MainActivity).tocatpage()

        }
    }


    companion object {
        @JvmStatic
        fun newInstance() =
            SecondScreen()
    }

}