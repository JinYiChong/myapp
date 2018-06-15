package com.example.jay.myapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.jay.myapp.R
import com.example.jay.myapp.Utility.EXTRA_LEAGUE
import com.example.jay.myapp.Utility.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchleaguetext.text = "Looking for $league $skill league near you..."
    }



}
