package sudoku;

import java.util.ArrayList;

public class SudokuDatabase {

    //Atributes
    private int lastReturnedSudoku = -1;
    private ArrayList<int[][]> sudokus = new ArrayList<int[][]>();

    //Constructor
    public SudokuDatabase() {
        generateSudokus();
    }

    //Private Methods
    private void generateSudokus() {
        /** TEST 
        int sudoku0[][] = { 
            {0, 2, 7, 6, 9, 8, 1, 4, 5}, 
            {6, 5, 9, 7, 1, 4, 8, 2, 3}, 
            {4, 1, 8, 5, 3, 2, 7, 9, 6}, 
            {1, 6, 2, 4, 7, 3, 5, 8, 9}, 
            {8, 3, 5, 9, 6, 1, 4, 7, 2}, 
            {7, 9, 4, 8, 2, 5, 3, 6, 1}, 
            {9, 7, 1, 3, 8, 6, 2, 5, 4}, 
            {2, 4, 6, 1, 5, 7, 9, 3, 8}, 
            {5, 8, 3, 2, 4, 9, 6, 1, 7}, 
        }; 
        this.sudokus.add(sudoku0);
        */

        int sudoku1[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        this.sudokus.add(sudoku1);

        int sudoku2[][] = {
            {0, 0, 0, 0, 9, 8, 1, 0, 0},
            {0, 0, 9, 0, 0, 0, 8, 2, 3},
            {4, 1, 8, 0, 0, 2, 0, 0, 6},
            {0, 6, 2, 4, 0, 0, 5, 0, 9},
            {8, 0, 5, 9, 6, 0, 4, 0, 2},
            {0, 0, 0, 0, 0, 0, 3, 0, 0},
            {0, 7, 0, 0, 0, 0, 0, 5, 0},
            {0, 4, 0, 0, 5, 0, 9, 0, 8},
            {5, 0, 3, 0, 0, 0, 6, 0, 7},};
        this.sudokus.add(sudoku2);

        int sudoku3[][] = {
            {4, 3, 1, 0, 0, 0, 0, 0, 5},
            {9, 5, 0, 0, 0, 0, 0, 8, 0},
            {0, 7, 8, 0, 9, 0, 0, 0, 0},
            {0, 0, 6, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 0, 6, 1, 0, 0, 9},
            {0, 0, 0, 0, 0, 4, 2, 0, 3},
            {1, 8, 0, 6, 4, 7, 0, 0, 0},
            {0, 0, 0, 3, 8, 9, 5, 7, 1},
            {7, 0, 3, 0, 0, 0, 0, 4, 6},};
        this.sudokus.add(sudoku3);

        int sudoku4[][] = {
            {7, 0, 5, 0, 3, 0, 0, 8, 0},
            {4, 0, 0, 9, 2, 5, 0, 7, 0},
            {9, 3, 0, 0, 6, 8, 4, 0, 0},
            {6, 1, 0, 2, 8, 4, 5, 0, 0},
            {8, 0, 3, 6, 0, 0, 0, 2, 0},
            {0, 0, 4, 0, 1, 7, 8, 0, 0},
            {0, 0, 8, 1, 7, 6, 0, 0, 5},
            {0, 0, 0, 0, 0, 3, 2, 0, 9},
            {3, 0, 0, 5, 0, 0, 7, 1, 0},};
        this.sudokus.add(sudoku4);
        

        int sudoku5[][] = {
            {8, 0, 6, 0, 0, 3, 7, 1, 0},
            {5, 7, 0, 4, 2, 0, 0, 8, 9},
            {0, 2, 0, 0, 0, 0, 6, 4, 0},
            {0, 0, 0, 0, 6, 0, 5, 0, 3},
            {0, 0, 5, 0, 8, 4, 0, 2, 6},
            {6, 1, 0, 0, 0, 0, 5, 0, 8},
            {0, 0, 0, 8, 0, 7, 0, 5, 0},
            {0, 0, 0, 0, 0, 0, 8, 0, 0},
            {4, 0, 8, 0, 0, 2, 0, 6, 0},};
        this.sudokus.add(sudoku5);
    }

    //Public Methods
    public int[][] getSudoku() {
        int sudoku = this.lastReturnedSudoku;
        while (sudoku == this.lastReturnedSudoku) {
            sudoku = (int) (Math.random() * this.sudokus.size());
        }
        this.lastReturnedSudoku = sudoku;
        return this.sudokus.get(sudoku);
    }

}
