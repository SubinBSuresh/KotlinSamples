package com.example.mvvmdatabindingnavigation.model

import android.util.Log
import com.example.mvvmdatabindingnavigation.view.MainActivity

class ContactRepository {

    fun getContactList(): ArrayList<Contact>{
        return MainActivity.contactList
    }

    fun addContact(contact: Contact){
        MainActivity.contactList.add(contact)
        Log.e("subin","inside contact repository"+contact.name)

    }
}