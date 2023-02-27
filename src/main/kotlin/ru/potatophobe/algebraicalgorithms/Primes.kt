package ru.potatophobe.algebraicalgorithms

fun countPrimesIterative(upperBound: ULong): ULong {
    if (upperBound < 2UL) return 0UL
    if (upperBound == 2UL) return 1UL
    var count = 1UL
    for (n in 3UL..upperBound step 2) {
        var isPrime = true
        for (divisor in 3UL until n step 2) {
            if (n % divisor == 0UL) {
                isPrime = false
                break
            }
        }
        if (isPrime) count++
    }
    return count
}
