package com.example.homework_01

fun getRunTime(action: () -> Unit): Long {
    val start = System.currentTimeMillis()
    action()
    return System.currentTimeMillis() - start
}

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

    println(getRunTime{list.DescSortAge()})
    println()
    println(getRunTime{list.SortNameSurname()})

}
