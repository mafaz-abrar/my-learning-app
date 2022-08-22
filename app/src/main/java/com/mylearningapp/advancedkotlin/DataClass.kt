package com.mylearningapp.advancedkotlin

data class Decoration(val rocks: String) { }

data class Decoration2(val rocks: String, val wood: String, val driver: String) { }

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println("------")

    // == and equals() mean the same
    // === allows us to check if we are referring to the exact same
    // instance

    // Assigning a data class object to another variable copies the reference to that ,
    // object, not the contents. To copy the contents to a new object
    // use the copy() method.

    // copy() and equals() only use properties defined in the primary constructor

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}

fun makeDecorations2() {

    val decoration = Decoration2("crystal", "wood", "diver")

    // Destructuring ********************
    val (rocks, wood, diver) = decoration
    val (rocks2, _, diver2) = decoration
}

fun main() {
    makeDecorations()
}
