package com.example.mvvmdatabindingnavigation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdatabindingnavigation.databinding.ConactListItemBinding
import com.example.mvvmdatabindingnavigation.model.Contact

class ContactListAdapter : RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {
    private var contactList: List<Contact> = emptyList()

    // Implement adapter methods here

    inner class ViewHolder(private val binding: ConactListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(contact: Contact) {
//            binding.contact = contact
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ConactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList.get(position)
        holder.bind(contact)
    }
}
