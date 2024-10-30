package me.dumbtest.kt_basics.day4.bank

import kotlin.system.exitProcess


fun main(){
    //create a new account
    var myAccount = bankAcc("Rene", 521.21)
    while(true) {
        printMenu(myAccount.holder)
        //gets the choice from the menu
        when(readln().toInt()){
            1 -> myAccount.showTransHistory()
            2 -> {
                print("How much you'd like to withdraw?: ")
                myAccount.withdraw(readln().toDouble())
            }
            3 ->  {
                print("How much you'd like to deposit?: ")
                myAccount.deposit(readln().toDouble())
            }
            4 -> {
                println("Your current balance is ${myAccount.balance}")
            }
            else -> {
                println("Goodbye!!")
                break
            }
        }
    }
    exitProcess(0)
}

fun printMenu(name: String){
    println("Welcome to your account ${name}\n" +
            "What would you like to do? ")
    println("1 - View acc history")
    println("2 - Withdraw money")
    println("3 - Deposit money")
    println("4 - View Balance")
    println("5 - Exit")
    print("Your choice: ")


}