package com.kodilla.sudoku;

import com.kodilla.sudoku.elements.SudokuBoard;

import java.util.*;

public class SudokuGameController {
    public final String ADD_NUMBER = "ADD";
    public final String SOLVE = "SOLVE";
    public final String NEW = "NEW";
    public final String EXIT = "X";

    private Scanner scanner;
    private SudokuBoard board;
    private SudokuSolver solver;
    private MoveValidator validator;

    public SudokuGameController() {
        scanner = new Scanner(System.in);
        this.board = new SudokuBoard();
        this.solver = new SudokuSolver(board);
        this.validator = new MoveValidator();
    }

    public void controlLoop() {
        String chosenOption = "";
        String numberInput = "";
        while (!chosenOption.equals(EXIT)) {
            chosenOption = scanner.nextLine();
            switch (chosenOption) {
                case ADD_NUMBER:
                    System.out.println("Please choose a number[1-9] and a position on the board {number, x, y} where x = row[0-8] and y = column[0-8]");
                    numberInput = scanner.nextLine();
                    if (numberInput.length() != 5) {
                        System.out.println("Incorrect format of input!" + "\n" +
                                "Please type \"ADD\" and choose a number with a position on board in a correct format: {number, x(row), y(column}");
                        break;
                    }
                    int value;
                    int row;
                    int column;
                    try {
                        value = Integer.parseInt(numberInput.substring(0, 1));
                        row = Integer.parseInt(numberInput.substring(2, 3));
                        column = Integer.parseInt(numberInput.substring(4, 5));
                        if (validator.validateMove(board, row, column, value)) {
                            board.setElement(row, column, value);
                        } else {
                            System.out.println("Number " + value + " can't be placed in here, please type \"ADD\" and choose another number");
                        }
                    } catch (NumberFormatException | IndexOutOfBoundsException ex) {
                        System.out.println("Incorrect format of input!" + "\n" +
                                "Please type \"ADD\" and choose a number with a position on board in a correct format: {number, x(row), y(column}");
                    }
                    System.out.println(board);
                    break;
                case SOLVE:
                    System.out.println("Solving sudoku...");
                    if (solver.solve()) {
                        System.out.println("Sudoku solved successfully:)");
                        System.out.println(board);
                    } else {
                        System.out.println("Unfortunately this sudoku can't be solved:( \n" +
                                "If you want to start one more time type \"NEW\" or press \"X\" to exit");
                        String answer = scanner.nextLine();
                        switch (answer) {
                            case NEW:
                                System.out.println("Let's start one more time :)");
                                printTheBoard();
                                controlLoop();
                                break;
                            case EXIT:
                                System.out.println("Thanks for the game! See you soon:)");
                                break;
                            default:
                                System.out.println("There is no such an option.\n" +
                                        "If you want to start one more time type \"NEW\" or press \"X\" to exit)");
                        }
                    }
                    break;
                case NEW:
                    System.out.println("Let's start one more time :)");
                    printTheBoard();
                    controlLoop();
                    break;
                case EXIT:
                    System.out.println("Thanks for the game! See you soon:)");
                    break;
                default:
                    System.out.println("There is no such an option.");
                    displayTheOptions();
            }
        }
        scanner.close();
    }

    public void startTheGame() {
        System.out.println("Welcome in the Sudoku Game, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " :) Let's start!");
        printTheBoard();
        displayTheOptions();
        System.out.println("You can start to fill in the board now");
    }

    public void printTheBoard() {
        System.out.println("Printing new board...");
        board.createNewBoard();
        System.out.println(board);
    }

    private void displayTheOptions() {
        System.out.println("Please look at your options: \n " +
                "- type \"ADD\" to choose a number \n " +
                "- type \"SUDOKU\" to solve the game \n " +
                "- type \"NEW\" to start a new game \n " +
                "- press \"X\" to exit the game.");
    }
}
