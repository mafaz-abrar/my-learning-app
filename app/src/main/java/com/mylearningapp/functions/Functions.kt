import java.util.*

fun main() {

    val printLnOutput = println("Hello World!")
    println("The return type of println is $printLnOutput")

    println("\nSimple string interpolation with if statement inside string: ")

    val temp = 10
    val message = "The water temperature is ${ if (temp > 50) "too warm" else "OK" }"
    println(message)

    println("\nFunctions:")

    feedTheFish()
}

fun isHot(temp: Int) = temp > 50

fun feedTheFish() {

    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {

    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    // The Random() function picks a random number, while nextInt() restricts the numbers to
    // the size of the week array
    return week[Random().nextInt(week.size)]
}



