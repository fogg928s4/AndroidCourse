package me.dumbtest.kt_basics.day3

fun main() {
    println("Making coffee!!")
    makeCoffee(1,"XL", "Diego")
    makeCoffee(30,"XL", "Michelle")
    makeCoffee(-1,"XL", "Vale")
    makeCoffee(0,"XL", "Rodri")
}

//function to Make Coffee with params
fun makeCoffee(sugarAmnt: Int , size: String, name :String ){

    println("Coming an $size coffee with " + when{
        sugarAmnt <= 0 -> "no sugar"
        sugarAmnt == 1 -> "1 spoonful of sugar"
        else -> "$sugarAmnt spoonfuls of sugar"
    } + " for $name")

}