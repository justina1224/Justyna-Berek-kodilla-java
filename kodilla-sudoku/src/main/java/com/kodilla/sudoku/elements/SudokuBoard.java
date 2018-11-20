package com.kodilla.sudoku.elements;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuSolver.MAX_INDEX;
import static com.kodilla.sudoku.SudokuSolver.MIN_INDEX;

public class SudokuBoard {
    private List<SudokuRow> sudokuBoard;

    public SudokuBoard() {
        sudokuBoard = new ArrayList<>();
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public List<SudokuRow> createNewBoard() {
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            sudokuBoard.add(i, new SudokuRow());
            for (int j = MIN_INDEX; j <= MAX_INDEX; j++) {
                getSudokuBoard().get(i).getRowElements().add(j, new SudokuElement());
            }
        }
        return sudokuBoard;
    }

    public void setElement(int row, int column, int value) {
        getSudokuBoard().get(row).getRowElements().get(column).setValue(value);
    }

    public int getElementValue(int row, int column) {
        return getSudokuBoard().get(row).getRowElements().get(column).getValue();
    }

    public String toString() {
        StringBuilder board = new StringBuilder();
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            board.append("|");
            for (int j = MIN_INDEX; j <= MAX_INDEX; j++) {
                board.append(" ");
                board.append(getSudokuBoard().get(i).getRowElements().get(j).toString());
                board.append(" ");
                board.append("|");
            }
            board.append("\n");
        }
        return board.toString();
    }
}
