fun main() {

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println("Print only decorations that start with P")

    // eager, creates a new list
    val eager = decorations.filter {it[0] == 'p'}
    println("eager list: $eager")

    // lazy, will wait until asked to be evaluated
    // i.e. filteredLazy does not contain a List, it contains
    // a Sequence and knowledge of the filter to apply.
    // When we access the elements of filteredLazy, the filter is applied
    // and the results returned
    val filteredLazy = decorations.asSequence().filter {it[0] == 'p'}
    println("filtered lazy: $filteredLazy")

    // force evaluation of lazy list as list
    val newList = filteredLazy.toList()
    println("new list: $newList")

    println("-------")

    val lazyMap = decorations.asSequence().map {
        println("   now accessing: $it")
    }

    println("lazy map: $lazyMap")
    println("first element: ${lazyMap.first()}")
    println("all elements: ${lazyMap.toList()}")
}