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

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val firstTriangle = Triangle(3.0, 4.0, 5.0)

    println(firstTriangle.area())
    println(firstTriangle.perimeter())
}
