package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.RpsRunner1.numberOfRounds;

public class RockPaperScissors1 {
    private Scanner scanner;
    private Random random;
    static boolean END = false;
    static int roundCounter = 1;
    static int userWinsCounter = 0;
    static int computerWinsCounter = 0;

    public RockPaperScissors1() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void startTheGame() {
        System.out.println("Hello, welcome to \"Rock Paper Scissors\" game, what's your name?");
    }

    public void showInstruction() {
        System.out.println("1 - if you want to choose \"rock\",\n" +
                "2 - if you want to choose \"paper\",\n" +
                "3 - if you want to choose \"scissors\",\n" +
                "x - if you want to quit \n" +
                "n - if you want to start over");
    }

    public String userMove() {
        boolean askAgain = false;
        boolean wrongMove = false;
        char move = scanner.next().charAt(0);
        while (!wrongMove) {
            if (move == '1') {
                System.out.println("You've chosen rock");
                String userMove = "rock";
                wrongMove = false;
                return userMove;
            } else if (move == '2') {
                System.out.println("You've chosen paper");
                String userMove = "paper";
                wrongMove = false;
                return userMove;
            } else if (move == '3') {
                System.out.println("You've chosen scissors");
                String userMove = "scissors";
                wrongMove = false;
                return userMove;
            } else if (move == 'x') {
                wrongMove = true;
                askAgain = false;
                System.out.println("Are you sure you want to exit? Click yes(y) or no(n)");
                while (!askAgain) {
                    char nextMove = scanner.next().charAt(0);
                    if (nextMove == 'y') {
                        String userMove = "yes exit";
                        askAgain = true;
                        wrongMove = false;
                        return userMove;
                    } else if (nextMove == 'n') {
                        System.out.println("Let's continue");
                        String userMove = "no exit";
                        askAgain = true;
                        wrongMove = false;
                        return userMove;
                    } else {
                        askAgain = false;
                        wrongMove = true;
                        System.out.println("Invalid command, click yes(y) or no(n) ");
                    }
                }
            } else if (move == 'n') {
                wrongMove = true;
                askAgain = false;
                System.out.println("Are you sure you want to start all over? Click yes(y) or no(n)");
                while (!askAgain) {
                    char nextMove = scanner.next().charAt(0);
                    if (nextMove == 'y') {
                        String userMove = "start over";
                        System.out.println("Let's start one more time :)");
                        askAgain = true;
                        wrongMove = false;
                        return userMove;
                    } else if (nextMove == 'n') {
                        System.out.println("Let's continue");
                        String userMove = "continue";
                        askAgain = true;
                        wrongMove = false;
                        return userMove;
                    } else {
                        askAgain = false;
                        wrongMove = true;
                        System.out.println("Invalid command, click yes(y) or no(n)");
                    }
                }
            } else {
                wrongMove = false;
                System.out.println("You can only choose (1)rock, (2)paper, (3)scissors, (n)start over or (x)exit");
                move = scanner.next().charAt(0);
            }
        }
        return "";
    }

    public String computerMove() {
        int move = random.nextInt(2);
        if (move == 0) {
            String computerMove = "rock";
            System.out.println("Computer's move: rock");
            return computerMove;
        }
        if (move == 1) {
            String computerMove = "paper";
            System.out.println("Computer's move: paper");
            return computerMove;
        }
        if (move == 2) {
            String computerMove = "scissors";
            System.out.println("Computer's move: scissors");
            return computerMove;
        } else {
            return null;
        }
    }

    public String defineWinner(String user, String computer) {
        if (user == computer) {
            System.out.println("This is a tie");
            return "tie";

        } else if (user == "paper" && computer == "rock") {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return "win";

        } else if (user == "paper" && computer == "scissors") {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return "lose";

        } else if (user == "scissors" && computer == "paper") {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return "win";

        } else if (user == "rock" && computer == "paper") {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return "lose";

        } else if (user == "rock" && computer == "scissors") {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return "win";

        } else if (user == "scissors" && computer == "rock") {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return "lose";
        }
        return "";
    }

    public String finishTheGame() {
        System.out.println(this.showTheWinner(computerWinsCounter, userWinsCounter));
        if(userWinsCounter == computerWinsCounter) {
            System.out.println("Would you like to make a rematch? Click (n)yes or (x)exit");
        } else {
            System.out.println("End of the game, if you want to play one more time press 'n', to exit press 'x'");
        }
        boolean answer = false;
        while (!answer) {
            char decision = scanner.next().charAt(0);
            if (decision == 'x') {
                END = true;
                answer = true;
                return "exit";
            } else if (decision == 'n') {
                System.out.println("Let's play one more time :)");
                roundCounter = 1;
                userWinsCounter = 0;
                computerWinsCounter = 0;
                answer = true;
                return "play one more time";
            } else {
                System.out.println("Invalid move, please choose (n) or (x)");
                answer = false;
            }
        }
        return "";
    }

    public String showTheWinner(int computerWinsCounter, int userWinsCounter) {
        String winner = "";
        if (computerWinsCounter > userWinsCounter) {
            System.out.println("Computer's score: " + computerWinsCounter);
            System.out.println("Your score: " + userWinsCounter);
            winner = "The winner of this game is computer!";
        } else if (computerWinsCounter < userWinsCounter) {
            System.out.println("Computer's score: " + computerWinsCounter);
            System.out.println("Your score: " + userWinsCounter);
            winner = "Congratulations!! You are the winner of this game!!";
        } else if (userWinsCounter == computerWinsCounter) {
            System.out.println("Computer's score: " + computerWinsCounter);
            System.out.println("Your score: " + userWinsCounter);
            winner = "This game ends in a tie";
        }
        return winner;
    }

    public void exit() {
        System.out.println("Thank you for game, see you next time:)");
    }

    public void play() {
        while (END == false) {
            while (roundCounter <= numberOfRounds && END == false) {
                System.out.println("\nRound number " + roundCounter);
                System.out.println("Make your move: please choose (1)rock, (2)paper, (3)scissors, (n)start over or (x)exit");
                String user = this.userMove();
                if (user == "paper" || user == "rock" || user == "scissors") {
                    String computer = this.computerMove();
                    roundCounter++;
                    this.defineWinner(user, computer);
                } else if (user == "exit") {
                } else if (user == "yes exit") {
                    END = true;
                } else if (user == "start over") {
                    roundCounter = 1;
                    userWinsCounter = 0;
                    computerWinsCounter = 0;
                }
            }
            if (numberOfRounds == (roundCounter - 1)) {
                this.finishTheGame();
            }
        }
        this.exit();
    }
}