package com.jkj.comeback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkj.comeback.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHello.text = "3 edit"

    }
}