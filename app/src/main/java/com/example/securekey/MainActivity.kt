package com.example.securekey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var serverKey = BuildConfig.SERVER_KEY
    var secondKey = BuildConfig.SECOND_KEY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        Log.d("@@@", "initViews: $serverKey")
        Log.d("@@@", "initViews: $secondKey")

    }
}