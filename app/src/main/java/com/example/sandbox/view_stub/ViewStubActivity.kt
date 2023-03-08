package com.example.sandbox.view_stub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.sandbox.databinding.ActivityViewStubBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ViewStubActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityViewStubBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnLazyLoad.setOnClickListener {
            lifecycleScope.launch {
                delay(3000)
                if (binding.stub.parent != null)
                    binding.stub.inflate()
            }
        }
    }
}
