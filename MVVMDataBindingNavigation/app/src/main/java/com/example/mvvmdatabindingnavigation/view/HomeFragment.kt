package com.example.mvvmdatabindingnavigation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdatabindingnavigation.R
import com.example.mvvmdatabindingnavigation.databinding.FragmentHomeBinding
import com.example.mvvmdatabindingnavigation.viewmodel.HomeViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var recyclerView: RecyclerView
    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
//        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        recyclerView = binding.recyclerView
//        recyclerView.layoutManager = LinearLayoutManager(this)

        binding.viewModel = homeViewModel

        val fab: FloatingActionButton = binding.floatingActionButton
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addContactFragment)
        }

        return binding.root
    }

}