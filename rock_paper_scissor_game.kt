
    var user_input = 0
    var computer_input = 0
    while(true){
        println("""Enter the Choice:
            1.Rock
            2.Paper
            3.Scissor
            4.Exit
        """)
        user_input = readln().toInt()
        if(0>user_input || user_input >4){
            println("Enter the valid input")
            user_input = readln().toInt()
        }

        computer_input = (1..3).random()
        var winner = when {
            user_input == computer_input -> "Tie"
            user_input == 1 && computer_input == 2 -> "user is winner"
            user_input == 1 && computer_input == 3 -> "user is winner"
            user_input == 3 && computer_input == 2 -> "user is winner"
            user_input == 2 && computer_input == 1 -> "user is winner"
            user_input == 4 -> return
            else -> "computer is winner"
        }
        println(winner)


    }
