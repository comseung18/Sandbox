package com.example.sandbox

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.sandbox.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}
