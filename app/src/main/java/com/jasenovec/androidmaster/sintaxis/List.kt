package com.jasenovec.androidmaster.sintaxis

fun main() {
    mutableList()
}

fun mutableList() {
    val weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(0, "JaseDay")
    println(weekDays)

    //Filtrar
    if (weekDays.isEmpty()) {
        //
    } else {
        weekDays.forEach { print { it } }
    }

    if (weekDays.isNotEmpty()) {
        weekDays.forEach { print { it } }
    }

    weekDays.last()
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    val example = readOnly.filter { it.contains("o") }
    println(example)

    //Para imprimir de mejor manera las listas
    readOnly.forEach { weekDay -> println(weekDay) }
}