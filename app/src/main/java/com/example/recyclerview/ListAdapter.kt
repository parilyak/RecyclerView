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
            444 -> GameViewHolder(inflater, parent)
            555 -> MovieViewHolder(inflater, parent)
            else -> MovieViewHolder(inflater, parent)
        }
    }

    override fun onBindViewHolder(holder: ThingViewHolder, position: Int) {
        val thing= list[position]
        holder.bind(thing)
    }

    override fun getItemViewType(position: Int): Int {
        if (list[position] is Book) return 333
        if (list[position] is Game) return 444
        return if (list[position] is Movie) 555
        else 404
    }
}