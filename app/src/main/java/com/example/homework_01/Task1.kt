package com.example.homework_01

fun main() {
    val list = (0..99).toList()
        .filter{it % 2 == 0}
        .slice(10..20)
        .sumOf { it+1 }
    println(list)
}
