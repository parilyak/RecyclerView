package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list: List<Thing>): RecyclerView.Adapter<ThingViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when(viewType) {
            333 -> BookViewHolder(inflater, parent)
            else -> MovieViewHolder(inflater, parent)
        }
    }

    override fun onBindViewHolder(holder: ThingViewHolder, position: Int) {
        val thing= list[position]
        holder.bind(thing as Thing)
    }

    override fun getItemViewType(position: Int): Int {
//        TODO: if item on a position is Book, return 333 else 404
//        TODO: Add game xml with an image, for a book change places title and name - 3 xmls views
        return if (position % 2 == 0) 333 else 404
    }
}