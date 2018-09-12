package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.RpsRunner1.numberOfRounds;

public class RockPaperScissors1 {
    private Scanner scanner;
    private Random random;
    private boolean end = false;
    private int roundCounter;
    private int userWinsCounter;
    private int computerWinsCounter;

    public RockPaperScissors1() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.userWinsCounter = 0;
        this.computerWinsCounter = 0;
        this.roundCounter = 1;
    }

    public void startTheGame() {
        System.out.println("Hello, welcome to \"Rock Paper Scissors Lizard Spock\" game, what's your name?");
    }

    public void showInstruction() {
        System.out.println("1 - if you want to choose \"rock\",\n" +
                "2 - if you want to choose \"paper\",\n" +
                "3 - if you want to choose \"scissors\",\n" +
                "4 - if you want to choose \"lizard\",\n" +
                "5 - if you want to choose \"Spock\",\n" +
                "x - if you want to quit \n" +
                "n - if you want to start over");
    }

    public CommandEnum userMove() {
        boolean askAgain = false;
        boolean wrongMove = false;
        char move = scanner.next().charAt(0);
        while (!wrongMove) {
            if (move == '1') {
                System.out.println("You've chosen rock");
                wrongMove = false;
                return CommandEnum.ROCK;
            } else if (move == '2') {
                System.out.println("You've chosen paper");
                wrongMove = false;
                return CommandEnum.PAPER;
            } else if (move == '3') {
                System.out.println("You've chosen scissors");
                wrongMove = false;
                return CommandEnum.SCISSORS;
            } else if (move == '4') {
                System.out.println("You've chosen lizard");
                wrongMove = false;
                return CommandEnum.LIZARD;
            } else if (move == '5') {
                System.out.println("You've chosen Spock");
                wrongMove = false;
                return CommandEnum.SPOCK;
            } else if (move == 'x') {
                wrongMove = true;
                askAgain = false;
                System.out.println("Are you sure you want to exit? Click yes(y) or no(n)");
                while (!askAgain) {
                    char nextMove = scanner.next().charAt(0);
                    if (nextMove == 'y') {
                        askAgain = true;
                        wrongMove = false;
                        return CommandEnum.YES;
                    } else if (nextMove == 'n') {
                        System.out.println("Let's continue");
                        askAgain = true;
                        wrongMove = false;
                        return CommandEnum.NO;
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
                        System.out.println("Let's start one more time :)");
                        askAgain = true;
                        wrongMove = false;
                        return CommandEnum.START;
                    } else if (nextMove == 'n') {
                        System.out.println("Let's continue");
                        askAgain = true;
                        wrongMove = false;
                        return CommandEnum.CONTINUE;
                    } else {
                        askAgain = false;
                        wrongMove = true;
                        System.out.println("Invalid command, click yes(y) or no(n)");
                    }
                }
            } else {
                wrongMove = false;
                System.out.println("You can only choose (1)rock, (2)paper, (3)scissors, (4)lizard, (5)Spock, (n)start over or (x)exit");
                move = scanner.next().charAt(0);
            }
        }
        return CommandEnum.INVALID;
    }

    public MoveEnum computerMove() {
        int move = random.nextInt(4);
        if (move == 0) {
            System.out.println("Computer's move: rock");
            return MoveEnum.ROCK;
        } else if (move == 1) {
            System.out.println("Computer's move: paper");
            return MoveEnum.PAPER;
        } else if (move == 2) {
            System.out.println("Computer's move: scissors");
            return MoveEnum.SCISSORS;
        } else if (move == 3) {
            System.out.println("Computer's move: lizard");
            return MoveEnum.LIZARD;
        } else if (move == 4) {
            System.out.println("Computer's move: Spock");
            return MoveEnum.SPOCK;
        } else {
            return null;
        }
    }

    public ResultEnum defineWinner(MoveEnum user, MoveEnum computer) {

        if (user == computer) {
            System.out.println("This is a tie");
            return ResultEnum.TIE;

        } else if (user == MoveEnum.SCISSORS && computer == MoveEnum.PAPER) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.SCISSORS && computer == MoveEnum.ROCK) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.SCISSORS && computer == MoveEnum.SPOCK) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.SCISSORS && computer == MoveEnum.LIZARD) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.PAPER && computer == MoveEnum.ROCK) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.PAPER && computer == MoveEnum.SCISSORS) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.PAPER && computer == MoveEnum.SPOCK) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.PAPER && computer == MoveEnum.LIZARD) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.ROCK && computer == MoveEnum.SCISSORS) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.ROCK && computer == MoveEnum.PAPER) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.ROCK && computer == MoveEnum.LIZARD) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.ROCK && computer == MoveEnum.SPOCK) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.LIZARD && computer == MoveEnum.SPOCK) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.LIZARD && computer == MoveEnum.ROCK) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.LIZARD && computer == MoveEnum.PAPER) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.LIZARD && computer == MoveEnum.SCISSORS) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.SPOCK && computer == MoveEnum.ROCK) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.SPOCK && computer == MoveEnum.PAPER) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;

        } else if (user == MoveEnum.SPOCK && computer == MoveEnum.SCISSORS) {
            userWinsCounter++;
            System.out.println("Congratulations! You won this round!");
            return ResultEnum.WIN;

        } else if (user == MoveEnum.SPOCK && computer == MoveEnum.LIZARD) {
            computerWinsCounter++;
            System.out.println("Sorry you lost this round :(");
            return ResultEnum.LOSE;
        }
        return null;
    }

    public String finishTheGame() {
        System.out.println(this.showTheWinner(computerWinsCounter, userWinsCounter));
        if (userWinsCounter < computerWinsCounter) {
            System.out.println("Would you like to make a rematch? Click (n)yes or (x)exit");
        } else {
            System.out.println("End of the game, if you want to play one more time press 'n', to exit press 'x'");
        }
        boolean answer = false;
        while (!answer) {
            char decision = scanner.next().charAt(0);
            if (decision == 'x') {
                end = true;
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
        while (!end) {
            while (roundCounter <= numberOfRounds && !end) {
                System.out.println("\nRound number " + roundCounter);
                System.out.println("Make your move: please choose (1)rock, (2)paper, (3)scissors, (4)lizard, (5)Spock, (n)start over or (x)exit");
                CommandEnum user = this.userMove();
                if (user == CommandEnum.valueOf("PAPER") || user == CommandEnum.valueOf("ROCK") || user == CommandEnum.valueOf("SCISSORS") ||
                        user == CommandEnum.valueOf("LIZARD") || user == CommandEnum.valueOf("SPOCK")) {
                    MoveEnum computer = this.computerMove();
                    roundCounter++;
                    this.defineWinner(user.getGameMove(), computer);
                } else if (user == CommandEnum.YES) {
                    end = true;
                } else if (user == CommandEnum.START) {
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