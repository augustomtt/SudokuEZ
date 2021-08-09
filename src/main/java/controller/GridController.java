package controller;

import exception.InvalidSudokuException;
import model.Cell;
import model.SudokuMatrix;
import util.UtilSolver;
import view.GridSudokuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridController implements ActionListener {
    private static GridSudokuView view;
    private Cell[][] mat;
    private SudokuMatrix sudokuMatrix;

    public GridController() {
        view = new GridSudokuView();
        view.setVisible(true);
        view.setActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("readySudoku")) {
            mat = view.getMatrix();
            sudokuMatrix = new SudokuMatrix(mat);

            try {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (!UtilSolver.Valid(mat, i, j))
                            throw new InvalidSudokuException();
                    }
                }
                sudokuMatrix.solve();
                GridController.updateGrid(mat);
            } catch (InvalidSudokuException ex) {
                view.cleanGrid();
                JOptionPane.showMessageDialog(null, "Sudoku invalido, verifique que no haya repetidos en alguna fila,columna o cuadrado 3x3");
            }

        }
    }

    public static void updateGrid(Cell[][] mat) {
        view.updateGrid(mat);
    }
}
