package com.example.homework_01

data class Person(val name: String, val surname: String, val age: Int)

fun List<Person>.DescSortAge() = sortedByDescending { it.age }

fun List<Person>.SortNameSurname() = sortedBy { it.surname}.sortedBy { it.name }

fun main() {
    val list = listOf(
        Person("Olga", "Sormakova", 43),
        Person("Elena", "Kalceva", 45),
        Person("Evgeny", "Miheev", 27),
        Person("Valentin", "Chigov", 38),
        Person("Ekaterina", "Blinova", 22),
        Person("Elena", "Abramova", 59),
        Person("Artur", "Golovin", 31),
        Person("Olga", "Dormakova", 15),
        Person("Olga", "Normakova", 68)
    )

    list.DescSortAge().forEach{println(it)}
    println()
    list.SortNameSurname().forEach{println(it)}

}
