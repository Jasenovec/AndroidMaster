package com.jasenovec.androidmaster.sintaxis

fun main() {
    var name : String? = null

    println(name?.get(3)?: "Es nulo")
}