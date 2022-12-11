package com.example.homework_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var firstScreen: FirstScreen
    lateinit var secondScreen: SecondScreen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstScreen = FirstScreen.newInstance()
        secondScreen = SecondScreen.newInstance()
    }

    fun tocatpage() {
        supportFragmentManager
            .beginTransaction()
            .replace(com.google.android.material.R.id.container, firstScreen)
            .commit()
    }

    fun todogpage() {
        supportFragmentManager
            .beginTransaction()
            .replace(com.google.android.material.R.id.container, secondScreen)
            .commit()
        }
    }
