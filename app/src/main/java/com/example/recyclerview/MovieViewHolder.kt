package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

abstract class ThingViewHolder(v: View): RecyclerView.ViewHolder(v) {
    abstract fun bind(movie: Thing)
}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    ThingViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null

    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mYearView = itemView.findViewById(R.id.list_description)
    }

    override fun bind(movie: Thing) {
        mTitleView?.text = movie.title
        mYearView?.text = movie.year.toString()
    }
}

class BookViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    ThingViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null

    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mYearView = itemView.findViewById(R.id.list_description)
    }

    override fun bind(movie: Thing) {
        mTitleView?.text = ">> Book ${movie.title}"// movie.title
        mYearView?.text = movie.year.toString()
    }
}

//TODO One more data object will contain books. List Adapter we check not by a position, we take position
//and check if the class is Book. If yes, we give the corresponding index of viewItem