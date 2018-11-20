package com.kodilla.sudoku;

import com.kodilla.sudoku.elements.SudokuBoard;

public class SudokuSolver {
    public final static int EMPTY = 0;
    public final static int BOX_SIZE = 3;
    public final static int MIN_VALUE = 1;
    public final static int MAX_VALUE = 9;
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;

    private SudokuBoard board;
    private MoveValidator validator;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
        this.validator = new MoveValidator();
    }

    public boolean solve() {
        for (int row = MIN_INDEX; row <= MAX_INDEX; row++) {
            for (int column = MIN_INDEX; column <= MAX_INDEX; column++) {
                if (board.getElementValue(row, column) == EMPTY) {
                    for (int number = MIN_VALUE; number <= MAX_VALUE; number++) {
                        if (validator.validateMove(board, row, column, number)) {
                            board.setElement(row, column, number);
                            if (this.solve()) {
                                return true;
                            } else {
                                board.setElement(row, column, EMPTY);
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
