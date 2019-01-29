package com.tanveershafeeprottoy.menusactionsdemo

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_context_menu.*

class ContextMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context_menu)
        registerForContextMenu(activityContextMenuTxtView)
    }

    override fun onCreateContextMenu(
        contextMenu: ContextMenu?, view: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(contextMenu, view, menuInfo)
        contextMenu?.setHeaderTitle("Choose option")
        menuInflater.inflate(R.menu.floating_menu, contextMenu)
    }

    override fun onContextItemSelected(menuItem: MenuItem?): Boolean {
        return when (menuItem?.itemId) {
            R.id.menu_0_float -> {
                Toast.makeText(this, "Option 0 clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.menu_1_float -> {
                Toast.makeText(this, "Option 0 clicked", Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                super.onContextItemSelected(menuItem)
            }
        }
    }
}
