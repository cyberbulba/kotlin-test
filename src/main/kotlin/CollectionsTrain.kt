package org.example

import java.lang.Math.pow
import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val a = readCoefficients()
    val coeffArr = emptyList<Int>().toMutableList()

    println(a)
    println(calcDerivative(a))
    println(polynomValue(a, 1))

    val len = args.get(0).toIntOrNull()
    if (len != null) {
        if (args.size == len + 2) {
            try {
                for (i in 1 until args.size) {
                    coeffArr.add(args.get(i).toInt())
                }
            } catch (e: NumberFormatException) {
                print("Invalid arguments of command line: ")
                exitProcess(1)
            }
        } else {
            exitProcess(1)
        }
    }

    val point = coeffArr.last()
    coeffArr.removeAt(coeffArr.lastIndex)

    println(polynomValue(coeffArr, point))
}

fun readInt(prompt: String): Int {
    print("$prompt ")
    while (true) {
        val num = readlnOrNull()

        if (num != null) {
            try {
                val number = num.toInt()
                return number

            } catch (e: NumberFormatException) {
                print("Invalid number. Please enter a valid number: ")
            }
        } else {
            println("Input non null number")
        }
    }
}

fun readCoefficients(): List<Int> {
    val coeffList = emptyList<Int>().toMutableList()
    val N = readInt("Input N:")

    for (i in 0 until N) {
        coeffList.add(readInt("Input int number:"))
    }

    return coeffList.reversed()
}

fun calcDerivative(coefs: List<Int>): List<Int> {
    val newCoeffs = coefs.reversed().mapIndexed { idx, value -> value * idx }
    return newCoeffs.drop(1).reversed()
}

fun polynomValue(coefs: List<Int>, point: Int): Int {
    return coefs.reversed().mapIndexed { idx, value -> value * pow(point.toDouble(), idx.toDouble()) }.sum().toInt()
}
