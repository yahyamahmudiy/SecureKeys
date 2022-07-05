package com.example.securekey

import android.app.Application
import android.os.Bundle
import android.util.Log

class ApplicationClass: Application() {

    init {
        //System.loadLibrary("keys")
        System.loadLibrary("native-lib")
    }

    external fun stringFromJNI(): String?
    //external fun getPublicKey(): String?
    //external fun getPrivateKey(): String?

    override fun onCreate() {
        super.onCreate()
        initViews()
    }


    private fun initViews() {

        //Log.d("MainActivity", getPublicKey().toString())
        //Log.d("MainActivity", getPrivateKey().toString())
        Log.d("MainActivity", stringFromJNI().toString())
    }
}