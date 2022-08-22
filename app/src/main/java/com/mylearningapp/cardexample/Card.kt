package com.mylearningapp.cardexample

class Card(private val suit: String, private val rank: String, private var flip: Boolean = true) {

    fun flipCard() {
        flip = !flip
    }

    fun printDetails() {
        if (flip) {
            println("Rank: $rank, Suit: $suit")

        } else {
            println("-----")
        }
    }
}