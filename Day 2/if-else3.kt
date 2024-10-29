package me.dumbtest.kt_basics

fun main() {
    //variable declariont
    print("Enter your age: ")
    var age: Byte = readln().toByte()
    /*if (age < 18){
        println("You can't enter")
    }
    else if(age >= 50)
        print("Go home ol head")
    else
        print("Welcome in bud")*/

    //We can also use a range check
    //var in [min] .. [max]
    if (age <18)
        print("U too young")
    else if(age in 18 .. 39)
        print("Welcome in")
    else
        print("Go home oldhead")
}