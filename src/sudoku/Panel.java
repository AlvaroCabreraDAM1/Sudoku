package sudoku;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

    //Atributes
    private Cell cells[][] = new Cell[9][9];
    private int w = 1;
    private int a = 1;
    private int s = 1;
    private int d = 1;

    //Constructors
    public Panel(int cells[][]) {

        this.setLayout(new GridBagLayout());
        Constraints.fill(0);

        if (cells.length == 9 && cells[0].length == 9) {
            for (int row = 0; row < cells.length; row++) {
                for (int col = 0; col < cells[row].length; col++) {
                    if (cells[row][col] > 0 && cells[row][col] < 10) {
                        this.cells[row][col] = ((Cell) new FixedCell(cells[row][col]));
                        Constraints.edit(col, row, 1, 1, 1, 1);
                        setBorder(row, col);
                        ((FixedCell) this.cells[row][col]).setBorder(w, a, s, d, Color.black);
                        this.add(((FixedCell) this.cells[row][col]).getLabel(), Constraints.get());
                    } else {
                        this.cells[row][col] = ((Cell) new VariableCell());
                        Constraints.edit(col, row, 1, 1, 1, 1);
                        setBorder(row, col);
                        ((VariableCell) this.cells[row][col]).setBorder(w, a, s, d, Color.black);
                        this.add(((VariableCell) this.cells[row][col]).getField(), Constraints.get());
                    }
                }
            }
        }

    }

    //Private Methods
    private int validatePanel() {

        int result = 0;

        if (this.validateRows() == -1 || this.validateCols() == -1 || this.validateSquares() == -1) {
            result = -1;
        }
        if (this.validateRows() == 1 && this.validateCols() == 1 && this.validateSquares() == 1) {
            result = 1;
        }

        return result;

    }

    private int validateRows() {
        int result = 0;
        int count = 0;

        for (int row = 0; row < this.cells.length; row++) {
            int values[] = new int[9];
            for (int col = 0; col < this.cells[row].length; col++) {
                values[this.cells[row][col].getValue() - 1]++;
            }
            if (this.validateValues(values) == -1) {
                result = -1;
                if (this.validateValues(values) == 1) {
                    count++;
                }
            }
            if (count == 9) {
                result = 1;
            }
        }

        return result;
    }

    private int validateCols() {
        int result = 0;
        int count = 0;

        for (int col = 0; col < this.cells.length; col++) {
            int values[] = new int[9];
            for (int row = 0; row < this.cells.length; row++) {
                values[this.cells[row][col].getValue() - 1]++;
            }
            if (this.validateValues(values) == -1) {
                result = -1;
            }
            if (this.validateValues(values) == 1) {
                count++;
            }
        }
        if (count == 9) {
            result = 1;
        }

        return result;
    }

    private int validateSquares() {
        int result = 0;
        int count = 0;
        for (int x = 0; x < this.cells.length; x += 3) {
            for (int y = 0; y < this.cells[x].length; y += 3) {
                int values[] = new int[9];
                for (int row = 0; row < this.cells.length; row++) {
                    for (int col = 0; col < this.cells[row].length; col++) {
                        values[this.cells[row][col].getValue() - 1]++;
                    }
                }
                if (this.validateValues(values) == -1) {
                    result = -1;
                }
                if (this.validateValues(values) == 1) {
                    count++;
                }
            }
        }
        if (count == 9) {
            result = 1;
        }
        return result;
    }

    private int validateValues(int values[]) {
        int result = 0;
        int count = 0;
        for (int aux = 0; aux < values.length; aux++) {
            if (values[aux] > 1) {
                result = -1;
            }
            if (values[aux] == 1) {
                count++;
            }
        }
        if (count == 9) {
            result = 1;
        }

        return result;
    }

    private void setBorder(int row, int col) {
        this.w = 1;
        this.a = 1;
        this.s = 1;
        this.d = 1;
        if (row == 0) {
            this.w = 4;
        }
        if (row == 3 || row == 6) {
            this.w = 2;
        }
        if (col == 0) {
            this.a = 4;
        }
        if (col == 3 || col == 6) {
            this.a = 2;
        }
        if (row == 8) {
            this.s = 4;
        }
        if (row == 2 || row == 5) {
            this.s = 2;
        }
        if (col == 8) {
            this.d = 4;
        }
        if (col == 2 || col == 5) {
            this.d = 2;
        }
    }

    //Public Methods
    public int getCellValue(int row, int col) {
        return this.cells[row][col].getValue();
    }

    public void setCellValue(int row, int col, int value) {
        this.cells[row][col].setValue(value);
    }

}
