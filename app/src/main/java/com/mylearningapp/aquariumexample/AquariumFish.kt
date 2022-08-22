package com.mylearningapp.aquariumexample

/*
//////////////////////
// Abstract classes //
//////////////////////

abstract class AquariumFish {
    abstract val color: String
}
 */

// "object" is Singleton Implementation +
// Creating Helper/Utility Classes for Interface Delegation
object GoldColor : FishColor {
    override val color = "gold"
}

object GrayColor: FishColor {
    override val color = "gray"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println("eat $food")
    }
}

/////////////////////////////////////////////////
// Basic Subclass and Interface implementation //
/////////////////////////////////////////////////

class Shark : FishColor, FishAction {
    override val color = "gray"

    override fun eat() {
        println("eat prey. ")
    }
}


/*
// Don't implement FishColor yourself, use the FishColor implementation
// provided by GoldColor
class Plecostomus: FishColor by GoldColor, FishAction {

    override fun eat() {
        println("eat algae. ")
    }
}
*/

// Don't implement FishColor yourself, use the FishColor implementation
// provided by the whichever helper object is passed in as parameter
// This is called Interface Delegation
class Plecostomus(fishColor: FishColor = GoldColor): FishColor by fishColor, FishAction by PrintingFishAction("algae") {

}