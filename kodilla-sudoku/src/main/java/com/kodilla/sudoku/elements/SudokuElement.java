package com.kodilla.sudoku.elements;

import static com.kodilla.sudoku.SudokuSolver.EMPTY;

public class SudokuElement {
    private int value = EMPTY;

    public SudokuElement() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
