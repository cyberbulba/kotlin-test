package org.example

import kotlin.math.sqrt
import kotlin.math.max

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    // первая тема: база + задания с треугольниками
//    val name = "Kotlin"
//    val first = 1
//    var second = 2

//    second += 2
//
//    println(sum(first, second))
//    isBig(2, 3)
//
//    val max = if (first > second) first else second
//    println(max)

//    println(area(7.0, 4.0, 5.0))
//    println(isTriangle(1.0, 1.0, 3.0))
//
//    var a = readln()
//    println(a)
//    println(args)

    var numSet = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1)
    val numMap = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")

    var newMapSet = numSet.map {it * 10}
    var filteredSet = numSet.filter {it % 2 == 0}.toSet() // без .toSet() будет ArrayList
    println(filteredSet)
    println(filteredSet::class.simpleName)

    var filteredMap = numMap.filter { (key, value) -> key % 2 == 1 }
    println(filteredMap)

    for (i in newMapSet) {
        println(i)
    }

    println(numSet.first({ it > 4 }))

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let {
            val length = it.length
            println("$it: $length")
        } // выводит Kotlin:6 и игнорирует null
    }
}

fun sum(a: Int, b: Int): Int {
    println("sum of $a and $b is ${a + b}")
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun isBig(a: Int, b: Int): Unit {
    if (a < b) {
        println("$a меньше $b")
    } else if (a == b) {
        println("Онт равны")
    } else {
        println("$b меньше $a")
    }
}

fun semiPerimetr(a: Double, b: Double, c: Double): Double = (a + b + c) / 2

fun area(a: Double, b: Double, c: Double): Double = sqrt(
    semiPerimetr(a, b, c) * (semiPerimetr(a, b, c) - a) *
            (semiPerimetr(a, b, c) - b) * (semiPerimetr(a, b, c) - c)
)

fun isTriangle(a: Double, b: Double, c: Double): Boolean = a < b + c && b < a + c && c < a + b
