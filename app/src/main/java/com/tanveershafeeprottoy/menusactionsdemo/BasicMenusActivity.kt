package com.tanveershafeeprottoy.menusactionsdemo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BasicMenusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_menus)
        setSupportActionBar(findViewById(R.id.activityBasicMenusToolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(menuItem: MenuItem?): Boolean {
        return when(menuItem?.itemId) {
            R.id.menu_search_main -> {
                Toast.makeText(this, "Search clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu_notification_main -> {
                Toast.makeText(this, "Notification clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu_about_main -> {
                Toast.makeText(this, "About clicked", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                super.onOptionsItemSelected(menuItem)
            }
        }
    }
}
