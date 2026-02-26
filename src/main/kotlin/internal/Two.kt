package org.example.internal

private var log: String = ""
private val FINGERS_NUMBER = 20

fun clear() {
    log = ""
    println("Yes")
}

fun actionTwo() {
    clear()
    println(log + FINGERS_NUMBER)
}