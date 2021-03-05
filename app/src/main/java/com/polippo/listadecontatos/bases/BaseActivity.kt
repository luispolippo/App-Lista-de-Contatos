package com.polippo.listadecontatos.bases

import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.DecorToolbar
import com.polippo.listadecontatos.R
import kotlinx.android.synthetic.main.activity_main.*

open class BaseActivity: AppCompatActivity() {

    protected fun setupToolBar(toolbar: androidx.appcompat.widget.Toolbar, title:String, navigationBack: Boolean){
        toolbar.title = title
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(navigationBack)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.home -> {
                this.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}