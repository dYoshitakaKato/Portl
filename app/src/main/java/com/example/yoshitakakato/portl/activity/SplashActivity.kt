package com.example.yoshitakakato.portl.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateMainPage()
    }

    private fun navigateMainPage() {
        val intent = Intent(this, NavigationActivity::class.java)
        startActivity(intent)
        finish()
    }
}