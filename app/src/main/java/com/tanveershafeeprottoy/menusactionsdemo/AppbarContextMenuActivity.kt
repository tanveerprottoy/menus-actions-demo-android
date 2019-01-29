package com.tanveershafeeprottoy.menusactionsdemo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_appbar_context_menu.*

class AppbarContextMenuActivity : AppCompatActivity(), View.OnLongClickListener, ActionMode.Callback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appbar_context_menu)
        setSupportActionBar(activityAppbarContextMenuToolbar as Toolbar)
        activityAppbarContextMenuTxtView.setOnLongClickListener(this)
    }

    override fun onLongClick(v: View?): Boolean {
        startSupportActionMode(this)
        return true
    }

    override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appbar_context_menu, menu)
        return true
    }

    override fun onActionItemClicked(actionMode: ActionMode?, menuItem: MenuItem?): Boolean {
        when (menuItem?.itemId) {
            R.id.menu_edit_appbar_context -> {
                Toast.makeText(this, "Edit clicked", Toast.LENGTH_LONG).show()
            }
            R.id.menu_delete_appbar_context -> {
                Toast.makeText(this, "Delete clicked", Toast.LENGTH_LONG).show()
            }
        }
        return true
    }

    override fun onPrepareActionMode(actionMode: ActionMode?, menu: Menu?): Boolean {
        return false
    }

    override fun onDestroyActionMode(actionMode: ActionMode?) {
    }
}
