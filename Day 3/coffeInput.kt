package me.dumbtest.kt_basics.day3

fun main() {
    println("Making coffee!!")
    print("Coffee for? ")
    val name = readln()
    print("How many spoonfuls of sugar? ")
    val sugar = readln().toInt()
    print("What size? ")
    val size = readln()

    makeCoffeeInput(sugar, size, name)

}

//function to Make Coffee with params
fun makeCoffeeInput(sugarAmnt: Int , size: String, name :String ){

    println("Coming in! an $size coffee with " + when{
        sugarAmnt <= 0 -> "no sugar"
        sugarAmnt == 1 -> "1 spoonful of sugar"
        else -> "$sugarAmnt spoonfuls of sugar"
    } + " for $name")

}