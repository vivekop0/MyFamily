package com.example.vivek

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val bottombar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
bottombar.setOnItemReselectedListener {

if (it.itemId==R.id.guard) {
    inflateFragment()
}
else if (it.itemId==R.id.nav_home){
    inflateHomeFragment()
}else if (it.itemId==R.id.profile){
    inflateProfile()
}else if (it.itemId==R.id.nav_dashboard){
    inflatedashBoard()
}

    true
}
    }

    private fun inflatedashBoard() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, DashBoard.newInstance())
        transaction.commit()
    }

    private fun inflateProfile() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, Profile.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, Fragment.newInstance())
        transaction.commit()
    }

    private fun inflateFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, guardFragment.newInstance())
        transaction.commit()
    }


}