package com.example.recyclerview

import android.content.Context
import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

abstract class ThingViewHolder(v: View): RecyclerView.ViewHolder(v) {
    abstract fun bind(dataToBind: Thing)
}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    ThingViewHolder(inflater.inflate(R.layout.movie_list_item, parent, false)) {
    private var mMovieTitleView: TextView? = null
    private var mMovieYearView: TextView? = null

    init {
        mMovieTitleView = itemView.findViewById(R.id.movie_title)
        mMovieYearView = itemView.findViewById(R.id.movie_year)
    }

    override fun bind(dataToBind: Thing) {
        mMovieTitleView?.text = "> Movie ${dataToBind.title}"
        mMovieYearView?.text = dataToBind.body
    }
}

class BookViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    ThingViewHolder(inflater.inflate(R.layout.book_list_item, parent, false)) {
    private var mBookTitleView: TextView? = null
    private var mBookAuthorView: TextView? = null

    init {
        mBookTitleView = itemView.findViewById(R.id.book_title)
        mBookAuthorView = itemView.findViewById(R.id.book_author)
    }

    override fun bind(dataToBind: Thing) {
        mBookTitleView?.text = ">> Book ${dataToBind.title}"
        mBookAuthorView?.text = dataToBind.body
    }
}

class GameViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    ThingViewHolder(inflater.inflate(R.layout.game_list_item, parent, false)) {
    private var mGameTitleView: TextView? = null
    private var mGameDescriptionView: TextView? = null
    private var mGamePicImageView: ImageView?

    init {
        mGameTitleView = itemView.findViewById(R.id.game_title)
        mGameDescriptionView = itemView.findViewById(R.id.game_description)
        mGamePicImageView = itemView.findViewById(R.id.game_pic)
    }

    override fun bind(dataToBind: Thing) {
        mGameTitleView?.text = dataToBind.title
        mGameDescriptionView?.text = dataToBind.body
        dataToBind.pic?.let { mGamePicImageView?.setImageResource(it) }
    }
}