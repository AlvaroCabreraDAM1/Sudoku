package sudoku;

import java.util.ArrayList;

public class Panel {

    //Atributes
    private Cell cells[][] = new Cell[9][9];

    //Constructors
    public Panel(int cells[][]) {

        if (cells.length == 9 && cells[0].length == 9) {
            for (int row = 0; row < cells.length; row++) {
                for (int col = 0; col < cells[row].length; col++) {
                    if (cells[row][col] > 0 && cells[row][col] < 10) {
                        this.cells[row][col] = ((Cell) new FixedCell(cells[row][col]));
                    }
                    else {
                        this.cells[row][col] = ((Cell) new VariableCell());
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

    //Public Methods
    public int getCellValue(int row, int col) {
        return this.cells[row][col].getValue();
    }
    
    public void setCellValue(int row, int col, int value) {
        this.cells[row][col].setValue(value);
    }
    
}
