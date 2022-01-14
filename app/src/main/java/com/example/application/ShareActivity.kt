package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
        handleIntent()
    }

    private fun handleIntent() {
        if (intent?.type == "text/plain") {
            findViewById<TextView>(R.id.textView).text = intent.extras?.getString(Intent.EXTRA_TEXT)
        }
    }
}