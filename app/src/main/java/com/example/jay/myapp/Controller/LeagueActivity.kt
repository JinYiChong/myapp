package com.example.jay.myapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.jay.myapp.Utility.EXTRA_LEAGUE
import com.example.jay.myapp.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    fun onmensclicked(view: View) {
        womensleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onwomensclicked(view: View) {
        mensleaguebtn.isChecked = false
        coedleaguebtn.isChecked = false
        selectedLeague = "womens"
    }

    fun oncoedclicked(view: View) {
        womensleaguebtn.isChecked = false
        mensleaguebtn.isChecked = false

        selectedLeague = "co-ed"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leaguenextclicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        startActivity(skillActivity)
    } else {
        Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
    } }

}
