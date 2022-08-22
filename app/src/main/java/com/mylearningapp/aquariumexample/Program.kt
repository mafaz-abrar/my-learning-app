// A package is a  a way to group related code to keep it organized, or to make a library of code.
// Once a package is created, you can import the package's contents into another file
// and reuse the code and classes in it.

package com.mylearningapp.aquariumexample

fun buildAquarium() {
    val myAquarium1 = Aquarium(name = "Aquarium 1")
    myAquarium1.printSize()

    // Creating a customized instance with primary constructor
    val myAquarium2 = Aquarium(name = "Aquarium 2", height = 20)
    myAquarium2.printSize()

    // Secondary constructor
    val myAquarium3 = Aquarium(name = "Aquarium 3", numberOfFish = 6)
    myAquarium3.printSize()

    myAquarium3.volume = 70
    myAquarium3.printSize()

    val myAquarium4 = Aquarium(name = "Aquarium 4", length = 25, width = 25, height = 40)
    myAquarium4.printSize()

    val myTowerTank1 = TowerTank(name = "Tower Tank 1", height = 45, diameter = 25)
    myTowerTank1.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Pleco: ${pleco.color}")
    pleco.eat()
}

fun main() {
    makeFish()
}