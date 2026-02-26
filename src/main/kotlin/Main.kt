package org.example

import org.example.internal.actionOne
import org.example.internal.actionTwo
import org.example.internal.hiddenInfo
import org.example.internal.some
import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.log
import kotlin.math.sqrt
import kotlin.system.exitProcess

val greetings: String = "Hello World"
var counter: Int = 0

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val numbers = listOf(1, 55, 25, 32, 2, 67, 31, 33, 11, 25, 66, 81, 97, 43, 46, 81)
    filteringNumbers(numbers)

    val widths = listOf(
        12,
        4,
        5,
        7,
        45,
        10,
        3,
    )
    val heights = listOf(
        1,
        6,
        15,
        32,
        32,
        12,
        9,
        10,
    )

    calcRectangles(widths, heights)

    val strings = listOf(
        "Apple",
        "Orange",
        "Peach",
        "Banana",
        "Tangerine",
        "Grapefruit",
        "Kiwi",
    )

    checkList(strings)

    val arr = listOf(1, -2, 3, -4, 5, 6, -7, 8, 9, -10)

    println(perimeter(1.5, 2.0))
    println(perimeter(60.0, 5.0, 0.1))
    println(perimeter(7.0, 15.0, 0.025))

    actionWork()
    actionOne()
    actionTwo()
    println(hiddenInfo)
    some = 20.0
    println(some)
}

fun filteringNumbers(numbers: List<Int>): Unit {
    for (number in numbers) {
        if (number % 2 == 1) {
            println("nechetniy: $number")
        }
    }

    println(numbers.filter { it % 2 == 1 })
    val filteredNumbers = emptyList<Int>().toMutableList()

    numbers.forEach { it ->
        if (it % 2 == 1) {
            filteredNumbers.add(it)
        }
    }
    println(filteredNumbers)

    val tripleDivs = numbers.filter { it % 3 == 0 }
    println(tripleDivs)

    val indexDivs = numbers.filterIndexed { index, i -> index != 0 && i % index + 1 == 0 }
    println(indexDivs)
}

fun calcRectangles(widths: List<Int>, heights: List<Int>): Unit {
    val zippedData = widths.zip(heights)
    val perimeter = emptyList<Int>().toMutableList()

    for (i in zippedData) {
        perimeter.add(2 * (i.first + i.second))
    }

    println(zippedData)
    println(perimeter)

    val area = widths.mapIndexed { index, i -> heights[index] * i }
    println(area)

    val widthIter = widths.iterator()
    val heightIter = heights.iterator()
    val semiPerimeter = emptyList<Int>().toMutableList()

    while (widthIter.hasNext() && heightIter.hasNext()) {
        semiPerimeter.add(widthIter.next() + heightIter.next())
    }
    println(semiPerimeter)

    val diagonalsList = emptyList<Int>().toMutableList()
    widths.forEachIndexed { index, i ->
        diagonalsList.add(
            sqrt(
                (pow(heights[index].toDouble(), 2.0) + pow(
                    i.toDouble(),
                    2.0
                ))
            ).toInt()
        )
    }
    println(diagonalsList)
}

fun checkList(list: List<String>): Unit {
    println(list.all { it[0].isUpperCase() })
    println(list.any { it.length == 5 })

    val vovelsLetters = listOf("q", "e", "y", "u", "i", "o", "a", "j")
    var flag = false
    for (i in list) {
        for (j in vovelsLetters) {
            if (j in i) {
                flag = true
            }
        }
    }
    println(flag)
}

fun perimeter(a: Double = 1.0, b: Double = 1.0, k: Double = 1.0): Double {
    return 2 * (a * k + b * k)
}


