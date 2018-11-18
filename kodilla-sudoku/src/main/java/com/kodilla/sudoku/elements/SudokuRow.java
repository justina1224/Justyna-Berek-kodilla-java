package com.kodilla.sudoku.elements;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private final List<SudokuElement> rowElements = new ArrayList<>();

    public SudokuRow() {
    }

    public List<SudokuElement> getRowElements() {
        return rowElements;
    }
}
