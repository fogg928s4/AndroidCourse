package me.dumbtest.kt_basics.day4

fun main(){
    var fruits = mutableListOf<String>(
        "Apples",
        "Bananas",
        "Mango",
        "Lichas",
        "Zapote",
        "Papaya"
    )
    for(i in 0 until fruits.size)
        print("${fruits[i]}, ")

    //now a numbers list
    var numbs = mutableListOf<Int>(1,2,3,4,5,6,7)
    println("\noriginal list: $numbs")
    for(j in 0 until numbs.size){
        //double val of each element and update the list
        numbs[j] *= 2
    }
    println("New list $numbs")
}