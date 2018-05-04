package sudoku;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

    //Atributes
    private Cell cells[][] = new Cell[9][9];
    private int topBorder = 1;
    private int leftBorder = 1;
    private int bottomBorder = 1;
    private int rightBorder = 1;
    private Warning warning;

    //Constructors
    public Panel(int cells[][], Warning warning) {
        this.setLayout(new GridBagLayout());
        this.warning = warning;
        Constraints.fill(0);
        if (cells.length == 9 && cells[0].length == 9) {
            for (int row = 0; row < cells.length; row++) {
                for (int col = 0; col < cells[row].length; col++) {
                    if (cells[row][col] > 0 && cells[row][col] < 10) {
                        this.cells[row][col] = ((Cell) new FixedCell(cells[row][col]));
                        Constraints.edit(col, row, 1, 1, 1, 1);
                        setBorder(row, col);
                        ((FixedCell) this.cells[row][col]).setBorder(topBorder, leftBorder, bottomBorder, rightBorder, Color.black);
                        this.add(((FixedCell) this.cells[row][col]).getPanel(), Constraints.get());
                    } else {
                        this.cells[row][col] = ((Cell) new VariableCell(this));
                        Constraints.edit(col, row, 1, 1, 1, 1);
                        setBorder(row, col);
                        ((VariableCell) this.cells[row][col]).setBorder(topBorder, leftBorder, bottomBorder, rightBorder, Color.black);
                        this.add(((VariableCell) this.cells[row][col]).getField(), Constraints.get());
                    }
                }
            }
        }
    }

    //Private Methods
    private void setBorder(int row, int col) {
        this.topBorder = 1;
        this.leftBorder = 1;
        this.bottomBorder = 1;
        this.rightBorder = 1;
        if (row == 0) {
            this.topBorder = 4;
        }
        if (row == 3 || row == 6) {
            this.topBorder = 2;
        }
        if (col == 0) {
            this.leftBorder = 4;
        }
        if (col == 3 || col == 6) {
            this.leftBorder = 2;
        }
        if (row == 8) {
            this.bottomBorder = 4;
        }
        if (row == 2 || row == 5) {
            this.bottomBorder = 2;
        }
        if (col == 8) {
            this.rightBorder = 4;
        }
        if (col == 2 || col == 5) {
            this.rightBorder = 2;
        }
    }
    
    private int validateCols() {
        int result = 0;
        int count = 0;
        for (int col = 0; col < this.cells.length; col++) {
            int values[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int row = 0; row < this.cells.length; row++) {
                if (this.cells[row][col].getValue() > 0 && this.cells[row][col].getValue() < 10) {
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
        if (count == 9) {
            result = 1;
        }
        return result;
    }
    
    public void validatePanel() {
        int result = 0;
        if (this.validateRows() == -1 || this.validateCols() == -1 || this.validateSquares() == -1) {
            result = -1;
        }
        if (this.validateRows() == 1 && this.validateCols() == 1 && this.validateSquares() == 1) {
            result = 1;
        }
        this.warning.actualize(result);
    }

    private int validateRows() {
        int result = 0;
        int count = 0;
        for (int row = 0; row < this.cells.length; row++) {
            int values[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int col = 0; col < this.cells[row].length; col++) {
                if (this.cells[row][col].getValue() > 0 && this.cells[row][col].getValue() < 10) {
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
                int values[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
                for (int row = 0; row < this.cells.length; row++) {
                    for (int aux = 0; aux < values.length; aux++) {
                        values[aux] = 0;
                    }
                    for (int col = 0; col < this.cells[row].length; col++) {
                        if (this.cells[row][col].getValue() > 0 && this.cells[row][col].getValue() < 10) {
                            values[this.cells[row][col].getValue() - 1]++;
                        }
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

    //Public Methods
    
}