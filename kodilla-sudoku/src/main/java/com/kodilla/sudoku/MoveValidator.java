package com.kodilla.sudoku;

import com.kodilla.sudoku.elements.SudokuBoard;

import static com.kodilla.sudoku.SudokuSolver.BOX_SIZE;
import static com.kodilla.sudoku.SudokuSolver.SIZE;

public class MoveValidator {

    public MoveValidator() {
    }

    public boolean checkRow(SudokuBoard board, int row, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board.getSudokuBoard().get(row).getRowElements().get(i).getValue() == number)
                return true;
        return false;
    }

    public boolean checkColumn(SudokuBoard board, int column, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board.getSudokuBoard().get(i).getRowElements().get(column).getValue() == number)
                return true;
        return false;
    }

    public boolean checkBox(SudokuBoard board, int row, int column, int number) {
        int baseRow = row - row % BOX_SIZE;
        int baseCol = column - column % BOX_SIZE;
        for (int i = baseRow; i < baseRow + 3; i++)
            for (int j = baseCol; j < baseCol + 3; j++)
                if (board.getSudokuBoard().get(i).getRowElements().get(j).getValue() == number)
                    return true;
        return false;
    }

    public boolean validateMove(SudokuBoard board, int row, int column, int number) {
        if (!checkRow(board, row, number) && !checkColumn(board, column, number) && !checkBox(board, row, column, number)
                && number >= 1 && number <= 9
                && row >= 0 && row <= 8
                && column >= 0 && column <= 8) {
            return true;
        }
        return false;
    }
}
