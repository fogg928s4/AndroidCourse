package me.dumbtest.kt_basics

fun main() {
    //First get the computer choice, then the users and compare
    //Both choices string
    var compChoice = ""
    var playerChoice : String?
    println("Rock, Paper or Scissors")
    print("Enter your choice: ")

    playerChoice = readln()
    while (!(playerChoice == "Rock" || playerChoice == "Paper" || playerChoice == "Scissors")) {
        print("\nNot a valid option!, Try again: ")
        playerChoice = readln()
    }

    //the computes choice
    val randomN = (1..3).random()
    when(randomN){
        1 -> compChoice = "Rock"
        2 -> compChoice = "Paper"
        3 -> compChoice = "Scissors"
    }

    //my choice

    println("The computer's choice is $compChoice")

    //lets decide who won
    //first check for draw
    if(compChoice == playerChoice)
        println("It's a Draw")
    else if (compChoice == "Rock"){
        when(playerChoice){
            "Paper" -> println("You win")
            "Scissors" -> println("You Lose!!")
        }
    }
    else if(compChoice== "Scissors") {
        when(playerChoice) {
            "Rock" -> println("You win")
            "Paper" -> println("You Lose!!")
        }
    }
    else if(compChoice== "Paper") {
        when(playerChoice) {
            "Scissors" -> println("You win")
            "Rock" -> println("You Lose!!")
        }
    }
    //another way of doing it
    val winner = when {
        playerChoice == compChoice -> "None"
        //winner cases player -> "Player"
        playerChoice == "Rock" && compChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && compChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && compChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    print("The winner is $winner")
    //random number for the
}