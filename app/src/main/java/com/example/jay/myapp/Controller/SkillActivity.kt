package com.example.jay.myapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.jay.myapp.Utility.EXTRA_LEAGUE
import com.example.jay.myapp.R
import com.example.jay.myapp.Utility.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var selectedskill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onbeginnerclick(view: View) {
        ballerskillbtn.isChecked = false

        selectedskill = "beginner"
    }

    fun onballerclick(view: View) {
        beginnerskillbtn.isChecked = false

        selectedskill = "baller"
    }

    fun onskillfinishclicked(view: View) {
        if (selectedskill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedskill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }


    }


}


