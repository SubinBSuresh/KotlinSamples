package com.example.mvvmdatabindingnavigation.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import com.example.mvvmdatabindingnavigation.R
import com.example.mvvmdatabindingnavigation.model.Contact
import com.example.mvvmdatabindingnavigation.model.ContactRepository

class AddContactViewModel : ViewModel() {

    private val contactRepository = ContactRepository()

    val contactName = MutableLiveData<String>()
    val contactNumber = MutableLiveData<String>()


    fun addContact() {
        val contact = Contact(contactName.value, contactNumber.value)

        contactRepository.addContact(contact)

    }
}