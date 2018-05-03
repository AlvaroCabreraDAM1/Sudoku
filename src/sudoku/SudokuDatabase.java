package sudoku;

import java.util.ArrayList;

public class SudokuDatabase {

    //Atributes
    private ArrayList<int[][]> sudokus;

    //Constructor
    public SudokuDatabase() {
        generateSudokus();
    }

    //Private Methods
    private void generateSudokus() {
        int sudoku[][] = {
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
        this.sudokus.add(sudoku);
    }

    //Public Methods
    public int[][] getSudoku() {
        return this.sudokus.get(0);
    }

}
