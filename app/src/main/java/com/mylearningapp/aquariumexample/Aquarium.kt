// A package is a  a way to group related code to keep it organized, or to make a library of code.
// Once a package is created, you can import the package's contents into another file
// and reuse the code and classes in it.

package com.mylearningapp.aquariumexample

import java.lang.Math.PI

/*
////////////////////////////////////////
// Aquarium class without constructor //
////////////////////////////////////////

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println(
            "Width: $width cm, Height: $height cm, Length: $length cm"
        )
    }
}
*/

/*
///////////////////////////////////////////////////////////////////////
// Aquarium class with constructor setting properties in declaration //
///////////////////////////////////////////////////////////////////////

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    // init blocks run initialization code
    // when an instance of this class
    // is initialized
    init {
        println("aquarium initializing")
    }

    // Secondary constructor to allow overloading
    // Generally discouraged
    constructor(numberOfFish: Int) : this() {
        // Assuming each fish needs 2000 cm^3 + a little extra
        val tank = numberOfFish * 2000 * 1.1

        // New height for new volume
        height = (tank / (length * width)).toInt()
    }

    // Property getter and setter
    var volume: Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }


    fun printSize() {
        println(
            "Width: $width cm, Height: $height cm, Length: $length cm, " +
            "Volume: $volume l"
        )
    }
}
 */

/////////////////////////////////
// Subclassing and Inheritance //
/////////////////////////////////

open class Aquarium(val name: String, open var width: Int = 20, open var height: Int = 40, open var length: Int = 100) {
    // init blocks run initialization code
    // when an instance of this class
    // is initialized
    init {
        println("aquarium $name initializing")
    }

    // Secondary constructor to allow overloading
    // Generally discouraged
    constructor(name: String, numberOfFish: Int) : this(name = name) {
        // Assuming each fish needs 2000 cm^3 + a little extra
        val tank = numberOfFish * 2000 * 1.1

        // New height for new volume
        height = (tank / (length * width)).toInt()
    }

    // Property getter and setter
    open var volume: Int
        get() = width * length * height / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    // The volume of water is 90% of the volume of the tank
    open var water: Double = 0.0
        get() = volume * 0.9

    open val shape = "rectangle"

    fun printSize() {
        println("Name: $name")
        println("Shape: $shape")
        println(
            "Width: $width cm, Height: $height cm, Length: $length cm, " +
                    "Volume: $volume l"
        )
        println("Volume: $volume l, Water: $water l (${water/volume*100.0}% full)\n")
    }
}

class TowerTank(name: String, override var height: Int, var diameter: Int) : Aquarium(name = name, height = height, width = diameter, length = diameter) {

    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}

