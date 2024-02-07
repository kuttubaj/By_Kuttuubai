package com.example.kotlin52.data.repositories

import com.example.kotlin52.R
import com.example.kotlin52.data.models.Box

class BoxRepositories {
    val heroes = mutableListOf<Box>(
        Box(R.color.orange, "Orange")
    )
    fun getBox() = heroes
}