package com.kodilla.sudoku.elements;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuSolver.SIZE;

public class SudokuBoard {
    private List<SudokuRow> sudokuBoard;

    public SudokuBoard() {
        sudokuBoard = new ArrayList<>();
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public List<SudokuRow> createNewBoard() {
        for (int i = 0; i < SIZE; i++) {
            sudokuBoard.add(i, new SudokuRow());
            for (int j = 0; j < SIZE; j++) {
                getSudokuBoard().get(i).getRowElements().add(j, new SudokuElement());
            }
        }
        return sudokuBoard;
    }

    public void setElement(int row, int column, int value) {
        getSudokuBoard().get(row).getRowElements().get(column).setValue(value);
    }

    public String toString() {
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            board.append("|");
            for (int j = 0; j < SIZE; j++) {
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
