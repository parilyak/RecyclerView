package com.example.recyclerview

abstract class Thing(open val title: String, open val year: Int)

data class Movie(override val title: String, override val year: Int): Thing(title, year)
data class Book(override val title: String, override val year: Int): Thing(title, year)
