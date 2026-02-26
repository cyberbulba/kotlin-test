package org.example

import kotlin.math.max
import kotlin.math.sqrt

class Triangle(private var sideA: Double, private var sideB: Double, private var sideC: Double) {
    fun maxSides(): Double = max(max(sideB, sideC), sideA)

    fun perimeter(): Double = sideA + sideB + sideC

    private fun semiPerimetr(): Double = (sideA + sideB + sideC) / 2

    fun area(): Double = sqrt(
        semiPerimetr() * (semiPerimetr() - sideA) *
                (semiPerimetr() - sideB) * (semiPerimetr() - sideC)
    )

    fun textTriangle(): Unit {
        println(listOf(sideA, sideB, sideC).sortedDescending())
    }
}