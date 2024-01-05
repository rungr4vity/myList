package com.example.mylist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class theAdapter(private val data:List<String>): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return MyViewHolder(layoutInflater.inflate(R.layout.list_item,parent,false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val item :String = data[position]
        holder.bindData(item)
    }



}
