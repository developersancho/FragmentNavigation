package com.developersancho.fragmentnavigation.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.github.developersancho.R
import developersancho.fragnavigation.navigateFragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private var backPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigateFragment(HomeFragment.newInstance(), clearBackStack = true)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            super.onBackPressed()
        } else {
            if (backPressedOnce) {
                finish()
                return
            }
            backPressedOnce = true
            Toast.makeText(this, getString(R.string.app_exit_label), Toast.LENGTH_SHORT).show()
            lifecycleScope.launch {
                delay(2000)
                backPressedOnce = false
            }
        }
    }
}