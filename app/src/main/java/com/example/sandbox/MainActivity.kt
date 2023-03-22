package com.example.sandbox

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.sandbox.databinding.ActivityMainBinding.inflate
import com.example.sandbox.intent.IntentSampleActivity
import com.example.sandbox.view_stub.ViewStubActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnToStub.setOnClickListener {
            startActivity(Intent(this, ViewStubActivity::class.java))
        }

        binding.btnToIntentSample.setOnClickListener {
            val intent = Intent(
                this,
                IntentSampleActivity::class.java
            ).apply {
                putExtra("foo", "Foo")
                putExtra("bar", "Bar")
            }

            startActivity(intent)
        }
    }
}
