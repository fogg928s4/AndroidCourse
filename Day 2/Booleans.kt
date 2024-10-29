package me.dumbtest.kt_basics

fun main(){
    val myTrue = true
    val myFalse : Boolean = false

    println(myFalse || myTrue)
    println(myFalse && myTrue)
    println(!myTrue)
    //>> true, false, false
}