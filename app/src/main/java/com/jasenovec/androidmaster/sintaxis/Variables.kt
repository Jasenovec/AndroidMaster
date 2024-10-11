package com.jasenovec.androidmaster.sintaxis

/**
 * Variables
 */

fun main() {
    showMyName()
    showMyAge(22)
    add(39, 28)

    val mySubstract = substract(32, 12)
    println(mySubstract)

    println(substractCool(20, 8))
}

fun showMyName() {
    println("Me llamo Jasenovac.")
}

fun showMyAge(currentAge: Int = 20) {
    println("Tengo $currentAge años.")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun substractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

fun variablesAlfanumericas() {

    /**
     * Variables Alfanumericas
     */

    val charExample1: Char = 'A'
    val charExample2: Char = '1'
    val charExample3: Char = '@'

    val stringExample: String = "Hola"
    val stringExample2: String = "4"
    val stringExample3: String = "23"
    val stringExample4: String = "1"
    val stringExample5: String = "Jasenovac"

    var stringConcatena: String = "Hola"
    stringConcatena = "Hola me llamo $stringExample5"
    print(stringConcatena)

    //print(stringExample2.toInt() + stringExample3.toInt())

}

fun variablesBoolean() {

    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
}

fun variablesNumericas() {

    /**
     * Variables Numericas
     */

    //Si modifico: VAR, si no modifico: VAL

    val age: Int = 30
    var age2: Int = 30
    age2 = 32
    val age3: Double = 30.0

    val example: Long = 30
    val floatExample: Float = 30.5f
    val doubleExample: Double = 30.7

    //Procurar estar atento a los cambios entre float y double, principalmente

    var exampleSuma: Int = age + doubleExample.toInt()
    var exampleSuma2: Float = age2 + doubleExample.toFloat()
    val exampleSuma3: Float = age3.toFloat() + doubleExample.toFloat()
    var exampleSuma4: Int = age + floatExample.toInt()

    print(exampleSuma3)

}