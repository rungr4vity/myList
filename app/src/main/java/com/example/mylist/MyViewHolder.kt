package com.example.mylist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val textViewItem: TextView = view.findViewById<TextView>(R.id.txtItem)

    fun bindData(data: String) {
        textViewItem.text = data
    }

    }
