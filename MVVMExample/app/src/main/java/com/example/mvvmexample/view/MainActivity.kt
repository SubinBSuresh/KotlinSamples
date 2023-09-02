package com.example.mvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.ActivityMainBinding
import com.example.mvvmexample.viewmodel.ContactViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private val contactViewModel: ContactViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.viewModel = contactViewModel
        binding.lifecycleOwner = this

    }
}