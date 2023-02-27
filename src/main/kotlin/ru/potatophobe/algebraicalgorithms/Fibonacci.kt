package ru.potatophobe.algebraicalgorithms

fun findFibonacciRecursive(number: ULong): ULong {
    return if (number == 0UL) 0UL
    else if (number < 3UL) 1UL
    else findFibonacciRecursive(number - 1UL) + findFibonacciRecursive(number - 2UL)
}

fun findFibonacciIterative(number: ULong): ULong {
    if (number == 0UL) return 0UL
    var previous = 0UL
    var current = 1UL
    for (i in 1UL until number) {
        val sum = previous + current
        previous = current
        current = sum
    }
    return current
}
