package com.example.rockpaperscissors.ui.theme

fun main(){

    var computerChoice =""
    var playerChoice = ""

    while (true){
        val randomNumber = (1..3 ).random()

        computerChoice = when(randomNumber){
            1 -> "Rock"
            2 -> "Paper"
            else -> "Scissors"
        }
        println("Rock, Paper or Scissors? Enter your choice:")
        playerChoice = readln()

        println("Computer's choice is $computerChoice")

        if (playerChoice.lowercase()==computerChoice.lowercase()){
            println("This is a draw")
        }
        else if (playerChoice == "Scissors" || playerChoice == "scissors"){
            if(computerChoice == "Rock"){
                println("Computer won the game")

            }
            else {
                println("You won the game")

            }
        }
        else if (playerChoice == "Rock" || playerChoice == "rock"){
            if(computerChoice == "Paper"){
                println("Computer won the game")

            }
            else {
                println("You won the game")

            }
        }
        else {
            if(computerChoice == "Scissors"){
                println("Computer won the game")

            }
            else {
                println("You won the game")

            }
        }
    }




}
