package me.dumbtest.kt_basics.day3

fun main(){
    println(example())
    println(division(5,7))
}
fun example() :Int{
    return 146846
}
fun division(num1: Int, num2:Int):Double{
    return num1/num2.toDouble()
}