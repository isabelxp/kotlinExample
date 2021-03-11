package com.capps.kotlinpractica


import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capps.kotlinpractica.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Logger{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        logD("I`m here")

        showToast("hello")

        binding.recycler.adapter = MediaAdapter(getItems()) { showToast(it.title) }

    }



}