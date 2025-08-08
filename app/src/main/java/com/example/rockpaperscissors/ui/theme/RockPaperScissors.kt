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

        val winner = when{
        playerChoice.lowercase() == computerChoice.lowercase() -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" || playerChoice == "rock" && computerChoice == "Scissors" -> "you"
        playerChoice == "Paper" && computerChoice ==  "Rock" || playerChoice == "paper" && computerChoice == "Rock" -> "you"
        playerChoice == "Scissors" && computerChoice == "Paper" || playerChoice == "scissors" && computerChoice == "Paper" -> "your"
        else -> "computer"
        }

        when(winner){
            "Tie" -> println("Tts a tie")
            "you" -> println("Your are the winner")
            "computer" -> println("Computer is the winner")
        }
    }

//        if (playerChoice.lowercase()==computerChoice.lowercase()){
//            println("This is a draw")
//        }
//        else if (playerChoice == "Scissors" || playerChoice == "scissors"){
//            if(computerChoice == "Rock"){
//                println("Computer won the game")
//
//            }
//            else {
//                println("You won the game")
//
//            }
//        }
//        else if (playerChoice == "Rock" || playerChoice == "rock"){
//            if(computerChoice == "Paper"){
//                println("Computer won the game")
//
//            }
//            else {
//                println("You won the game")
//
//            }
//        }
//        else {
//            if(computerChoice == "Scissors"){
//                println("Computer won the game")
//
//            }
//            else {
//                println("You won the game")
//
//            }
//        }
//    }




}
