package model;

import exception.InvalidSudokuException;
import util.UtilSolver;

public class SudokuMatrix {
    private Cell M[][];

    public SudokuMatrix(Cell[][] mat) {
        M = mat;
    }

    public void solve() throws InvalidSudokuException {
        UtilSolver.solve(M,0,0,true);
    }
}
