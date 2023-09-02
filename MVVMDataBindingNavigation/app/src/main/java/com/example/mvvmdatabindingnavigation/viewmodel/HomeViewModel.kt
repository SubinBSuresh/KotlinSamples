package com.example.mvvmdatabindingnavigation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmdatabindingnavigation.model.Contact
import com.example.mvvmdatabindingnavigation.model.ContactRepository

class HomeViewModel:ViewModel() {

    private val contactRepository = ContactRepository()

    private val contactList = MutableLiveData<Contact>()
    val contactData: LiveData<Contact> = contactList

    fun getContacts(){
         val contact = contactRepository.getContactList()
    }
}