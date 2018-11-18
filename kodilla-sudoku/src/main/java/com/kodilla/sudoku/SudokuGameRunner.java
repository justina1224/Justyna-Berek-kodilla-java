package com.kodilla.sudoku;

public class SudokuGameRunner {
    public static void main(String[] args) {
        SudokuGameController controller = new SudokuGameController();
        controller.startTheGame();
        controller.controlLoop();
    }
}
