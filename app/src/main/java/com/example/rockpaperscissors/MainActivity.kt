package com.example.rockpaperscissors

fun main(){

    var computerChoice =""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice:")
    playerChoice = readln()

    val randomNumber = (1..3 ).random()

    computerChoice = when(randomNumber){
        1 -> "Rock"
        2 -> "Paper"
        else -> "Scissors"
    }

    if (playerChoice==computerChoice){
        println("This is a draw")
    }
    else if (playerChoice == "Scissors"){
        if(computerChoice == "Rock"){
            println("Computer won the game")
            readln()
        }
        else {
            println("You won the game")
            readln()
        }
    }
    else if (playerChoice == "Rock"){
        if(computerChoice == "Paper"){
            println("Computer won the game")
            readln()
        }
        else {
            println("You won the game")
            readln()
        }
    }
    else {
        if(computerChoice == "Scissors"){
            println("Computer won the game")
            readln()
        }
        else {
            println("You won the game")
            readln()
        }
    }



}
