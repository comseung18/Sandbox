package com.example.sandbox.intent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sandbox.databinding.ActivityMainBinding

class IntentSampleActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
