package com.example.ch4.ui.keranjang

import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.ch4.R

class AdapterKeranjang(private val data: List<String>): RecyclerView.Adapter<AdapterKeranjang.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterKeranjang.ViewHolder {
        val view = from(parent.context).inflate(
            R.layout.fragment_keranjang, parent, false
            return ViewHolder(view)
        )
    }

    override fun onBindViewHolder(holder: AdapterKeranjang.ViewHolder, position: Int) {
        val item = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(itemView: RecyclerView.ViewHolder(itemView))
    private val RecyclerViewMenuKeranjang = itemView.findViewById(R.layout.fragment_keranjang)
}