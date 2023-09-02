package com.example.mvvmdatabindingnavigation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvmdatabindingnavigation.R
import com.example.mvvmdatabindingnavigation.databinding.FragmentAddContactBinding
import com.example.mvvmdatabindingnavigation.viewmodel.AddContactViewModel


class AddContactFragment : Fragment() {


    private lateinit var binding: FragmentAddContactBinding
    private val addContactViewModel: AddContactViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_add_contact,container,false)

        binding.viewModel = addContactViewModel

        binding.button.setOnClickListener {
            addContactViewModel.addContact()
            findNavController().navigate(R.id.action_addContactFragment_to_homeFragment)
        }
        return binding.root
    }
}