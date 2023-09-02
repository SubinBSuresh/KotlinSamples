package com.example.mvvmexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.model.Contact
import com.example.mvvmexample.model.ContactRepository

class ContactViewModel:ViewModel() {

    private val contactRepository = ContactRepository()

    private val _contactData = MutableLiveData<Contact>()
    val contactData:LiveData<Contact> = _contactData

    fun showContact(){
        val contact = contactRepository.getContactInfo()
        _contactData.value = contact

    }
}