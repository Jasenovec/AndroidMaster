package com.jasenovec.androidmaster.sintaxis

fun main() {
    getMonth(8)
    getTrimester(3)
    getSemester(5)
    result(true)
}

fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if (value) println("Holi")
    }
}

fun getSemester(month: Int) = when (month) {
    in 1..6 -> "Primer semestre"
    in 7..12 -> "Segundo semestre"
    !in 1..12 -> "Semestre no valido"
    else -> "no hay"
}


fun getTrimester(month: Int): String {
    return when (month) {
        1, 2, 3 -> "Primer trimestre"
        4, 5, 6 -> "Segundo trimestre"
        7, 8, 9 -> "Tercer trimestre"
        10, 11, 12 -> "Cuarto trimestre"
        else -> "Trimestre no valido"
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Ese mes no existe")
    }
}