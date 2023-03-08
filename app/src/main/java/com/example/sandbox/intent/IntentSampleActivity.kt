package com.example.sandbox.intent

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sandbox.databinding.ActivityIntentSampleBinding

class IntentSampleActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityIntentSampleBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val f = intent.extras?.getString("foo") ?: "null?"
        Toast.makeText(this, f, Toast.LENGTH_SHORT).show()
    }
}
