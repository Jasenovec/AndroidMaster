package com.jasenovec.androidmaster.sintaxis

fun main() {
    ifBasico("Iris")
    ifAnidado("dog")
    ifBoolean(false)
    ifInt(17)
    ifMultiple(20, true, true)
    ifMultipleOr("cat", true)

}

fun ifMultipleOr(pet: String, isHappy :Boolean) {
    if (pet == "dog" || (pet == "cat" && isHappy)) {
        println("Es un gato o un perro")
    }

}

fun ifMultiple(age: Int, parentPermission: Boolean, inHappy: Boolean) {
    if (age >= 18 && parentPermission && inHappy) {
        println("Puedo beber cerveza")
    }
}

fun ifInt(age: Int) {
    if (age >= 18) {
        println("Beber cerveza")
    } else {
        println("Beber jugo")
    }
}

fun ifBoolean(soyFeliz: Boolean) {

    //sin nada == true
    //con ! al principiop == false
    if (soyFeliz == true) {
        println("Soy feliz")
    } else {
        println("Soy infeliz")
    }
}

fun ifAnidado(animal: String) {
    when (animal) {
        "dog" -> {
            println("Es un perrito.")
        }

        "cat" -> {
            println("No es un gato.")
        }

        "bird" -> {
            println("No es un pajaro.")
        }

        else -> {
            println("No es ninguno de los animales esperados")
        }
    }
}

fun ifBasico(name: String) {

    if (name == "Iris") {
        println("La variable name es Jasnovac")
    } else {
        println("Este no es Jasenovac")
    }
}