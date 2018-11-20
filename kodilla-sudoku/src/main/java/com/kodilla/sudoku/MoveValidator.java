package com.kodilla.sudoku;

import com.kodilla.sudoku.elements.SudokuBoard;

import static com.kodilla.sudoku.SudokuSolver.*;

public class MoveValidator {

    public MoveValidator() {
    }

    public boolean checkRow(SudokuBoard board, int row, int number) {
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++)
            if (board.getElementValue(row, i) == number)
                return true;
        return false;
    }

    public boolean checkColumn(SudokuBoard board, int column, int number) {
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++)
            if (board.getElementValue(i, column) == number)
                return true;
        return false;
    }

    public boolean checkBox(SudokuBoard board, int row, int column, int number) {
        int baseRow = row - row % BOX_SIZE;
        int baseCol = column - column % BOX_SIZE;
        for (int i = baseRow; i < baseRow + BOX_SIZE; i++)
            for (int j = baseCol; j < baseCol + BOX_SIZE; j++)
                if (board.getElementValue(i, j) == number)
                    return true;
        return false;
    }

    public boolean validateMove(SudokuBoard board, int row, int column, int number) {
        if (!checkRow(board, row, number) && !checkColumn(board, column, number) && !checkBox(board, row, column, number)
                && number >= MIN_VALUE && number <= MAX_VALUE
                && row >= MIN_INDEX && row <= MAX_INDEX
                && column >= MIN_INDEX && column <= MAX_INDEX) {
            return true;
        }
        return false;
    }
}
