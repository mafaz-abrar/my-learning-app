package com.mylearningapp.cardexample

fun main() {

    val card1 = Card(rank = "ACE", suit = "HEARTS")
    val card2 = Card(rank = "KING", suit = "SPADES")

    card1.flipCard()

    card1.printDetails()
    card2.printDetails()
}