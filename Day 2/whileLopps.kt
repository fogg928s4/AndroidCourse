package me.dumbtest.kt_basics

fun main(){
    //practicing while loops

    var count = 0
    while(count <= 100) {
        when{
            count % 3 == 0 -> println("fizz")
            count % 5 == 0 -> println("buzz")
            else -> println(count)
        }
        count++
    }
}