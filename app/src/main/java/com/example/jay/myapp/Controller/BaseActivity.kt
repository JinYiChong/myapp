package com.example.jay.myapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val Tag = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag, "{javaClass.simpleName} Oncreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(Tag, "{javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(Tag, "{javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(Tag, "{javaClass.simpleName} OnRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(Tag, "{javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Tag, "{javaClass.simpleName} OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Tag, "{javaClass.simpleName} OnDestroy")
        super.onDestroy()
    }

}
