package com.example.motionlayoutapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

        return RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false))

    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemView.textView.text = "Demo $position"
    }

}