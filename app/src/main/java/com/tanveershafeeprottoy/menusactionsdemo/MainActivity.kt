package com.tanveershafeeprottoy.menusactionsdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityMainBtn0.setOnClickListener(this)
        activityMainBtn1.setOnClickListener(this)
        activityMainBtn2.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.activityMainBtn0 -> {
                startActivity(Intent(this, BasicMenusActivity::class.java))
            }
            R.id.activityMainBtn1 -> {
                startActivity(Intent(this, ContextMenuActivity::class.java))
            }
            R.id.activityMainBtn2 -> {
                startActivity(Intent(this, AppbarContextMenuActivity::class.java))
            }
        }
    }
}
