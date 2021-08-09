package util;

import controller.GridController;
import exception.InvalidSudokuException;
import model.Cell;

import javax.swing.*;
import java.util.ArrayList;

public class UtilSolver {

    public static void solve(Cell m[][], int i, int j, boolean fwd) throws InvalidSudokuException {
        if (i <= 8 && j <= 8) {
            if (!m[i][j].isStarter()) {
                if (m[i][j].getNumber() <= 9) {
                    m[i][j].inc();

                    while (m[i][j].getNumber() <= 9 && !Valid(m, i, j))
                        m[i][j].inc();
                    if (m[i][j].getNumber() > 9) {
                        m[i][j].setNumber(0);
                        if (j == 0)
                            solve(m, i - 1, 8, false);
                        else
                            solve(m, i, j - 1, false);
                    } else {
                        if (j == 8) {
                            solve(m, i + 1, 0, true);
                        } else
                            solve(m, i, j + 1, true);

                    }
                }
            } else {
                if (fwd) {
                    if (j == 8)
                        solve(m, i + 1, 0, true);
                    else
                        solve(m, i, j + 1, true);
                } else if (j == 0)
                    solve(m, i - 1, 8, false);
                else
                    solve(m, i, j - 1, false);
            }
        }
    }

    public static Boolean Valid(Cell[][] m, int i, int j) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        int startRow, startCol, endCol, endRow;

        for (int k = 0; k < 9; k++) {
            if (duplicates.contains(m[i][k].getNumber()) && m[i][k].getNumber() != 0)
                return false;
            else
                duplicates.add(m[i][k].getNumber());
        }
        duplicates = new ArrayList<Integer>();
        for (int k = 0; k < 9; k++) {
            if (duplicates.contains(m[k][j].getNumber()) && m[k][j].getNumber() != 0)
                return false;
            else
                duplicates.add(m[k][j].getNumber());
        }
        duplicates = new ArrayList<Integer>();

        startRow = i - i % 3;
        startCol = j - j % 3;
        endRow = startRow + 3;
        endCol = startCol + 3;


        for (int k = startRow; k < endRow; k++) {
            for (int p = startCol; p < endCol; p++) {
                if (duplicates.contains(m[k][p].getNumber()) && m[k][p].getNumber() != 0)
                    return false;
                else
                    duplicates.add(m[k][p].getNumber());
            }
        }
        return true;
    }
}
