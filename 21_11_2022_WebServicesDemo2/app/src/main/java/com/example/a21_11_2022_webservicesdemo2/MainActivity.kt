package com.example.a21_11_2022_webservicesdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a21_11_2022_webservicesdemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetUsers.setOnClickListener {
            WebThread().execute(null)
        }
    }
}