package com.example.recyclerview

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.game_list_item.*

class MainFragment: Fragment() {

    private val mMoviesBooksGames = listOf(
        Movie("Raising Arisona", 1987.toString()),
        Movie("Vampire's kiss", 1988.toString()),
        Movie("Con Air", 1997.toString()),
        Movie("Gone in 60 seconds", 1997.toString()),
        Movie("National Treasure", 2004.toString()),
        Movie("The Wicker Man", 2006.toString()),
        Movie("Ghost Rider", 2007.toString()),
        Movie("Knowing", 2009.toString()),
        Book("The Great Gatsby", "F. Scott Fitzgerald"),
        Book("War and Peace", "Leo Tolstoy"),
        Book("Lolita", "Vladimir Nabokov"),
        Book("Gone with the Wind", "Margaret Mitchell"),
        Book("Sherlock Holmes", "Arthur Conan Doyle"),
        Book("Martin Eden", "Jack London"),
        Game("Dixit", "Give the perfect clue so most (not all) players guess the right surreal image card.",
            R.drawable.dixit),
        Game("Alias", "a fun word explanation game that is played in teams of 2 or more people. The aim is to make your " +
                "teammates guess the word you are explaining by giving them hints and tips.",
            R.drawable.alias),
        Game("Catan", "You build roads and new settlements that eventually become cities. Will you succeed" +
                " in gaining supremacy on Catan?", R.drawable.catan),
        Game("Uno", "Get rid of your cards before the others, but beware of forgetting to say \"UNO!\"", R.drawable.uno)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_main, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        list_recycler_view.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapter(mMoviesBooksGames)
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}