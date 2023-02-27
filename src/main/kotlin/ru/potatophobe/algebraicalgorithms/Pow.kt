package ru.potatophobe.algebraicalgorithms

fun powIterative(origin: Double, pow: Int): Double {
    if (pow < 0) return 1 / powIterative(origin, -pow)
    if (pow == 0) return 1.0
    var result = origin
    for (i in 1 until pow) {
        result *= origin
    }
    return result
}
