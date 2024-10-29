package me.dumbtest.kt_basics

fun main() {
    var myAge : Byte = 16

    //println auto puts a \n at the end
    print("What's your age? ")
    myAge = readln().toByte()
    if (myAge >= 40) {
        println("Have a suero")
    }
    else if (myAge >= 18){
        println("Have a drink")
    }
    else {
        println("Have a pepsi")
    }

    //we could also use a range check
    if(myAge in 18..65){
        println("helllooo")
    }
}