package com.nepplus.pizzaorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

   override fun setupEvents() {

    }

    override fun setValues() {


    }

}