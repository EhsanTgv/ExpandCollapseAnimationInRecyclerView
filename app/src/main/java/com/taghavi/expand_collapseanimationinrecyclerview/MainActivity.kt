package com.taghavi.expand_collapseanimationinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taghavi.expand_collapseanimationinrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = SampleAdapter()
    }
}