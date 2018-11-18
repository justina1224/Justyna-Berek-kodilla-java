package com.kodilla.sudoku;

import com.kodilla.sudoku.elements.SudokuBoard;

public class SudokuSolver {
    public final static int EMPTY = 0;
    public final static int SIZE = 9;
    public final static int BOX_SIZE = 3;
    public final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 9;
    private SudokuBoard board;
    private MoveValidator validator;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
        this.validator = new MoveValidator();
    }

    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (board.getSudokuBoard().get(row).getRowElements().get(column).getValue() == EMPTY) {
                    for (int number = MIN_VALUE; number <= MAX_VALUE; number++) {
                        if (validator.validateMove(board, row, column, number)) {
                            board.getSudokuBoard().get(row).getRowElements().get(column).setValue(number);
                            if (solve()) {
                                return true;
                            } else {
                                board.getSudokuBoard().get(row).getRowElements().get(column).setValue(EMPTY);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
