package me.dumbtest.kt_basics

//AGE CONTROL
fun main(){
    print("enter your age as a whole number: ")
    var age = readln().toInt()
    if(age >= 40)
        println("You cant enter the club old man")

    else if(age >= 18)
        println("You can enter the club")
    else
        println("You cant come in, you're too young")
}