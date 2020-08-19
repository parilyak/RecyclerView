package com.example.recyclerview

import android.graphics.drawable.Drawable
import android.widget.ImageView

abstract class Thing(open val title: String, open val body: String, open val pic: Int?)

data class Movie(override val title: String, override val body: String): Thing(title, body, pic = null)
data class Book(override val title: String, override val body: String): Thing(title, body, pic = null)
data class Game(override val title: String, override val body: String, override val pic: Int?): Thing(title, body, pic)
