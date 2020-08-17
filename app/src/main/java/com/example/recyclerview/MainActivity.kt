package com.example.recyclerview

class MainActivity : SingleFragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
}