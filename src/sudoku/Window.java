package sudoku;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    //Atributes
    private Container container = this.getContentPane();

    //TEST
    private JPanel testSudoku = new JPanel();

    //Constructors
    public Window(String name) {
        super(name);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        container.setLayout(new GridBagLayout());

        //TEST
        GridLayout testSudokuL = new GridLayout(3, 3);
        testSudokuL.setHgap(20);
        testSudokuL.setVgap(10);
        testSudoku.setLayout(testSudokuL);
        for (int x = 1; x < 10; x++) {
            this.testAddCasilla();
        }
        container.add(testSudoku);

    }

    //Public Methods
    //TEST
    public void testAddCasilla() {
        JPanel testCasilla = new JPanel();
        GridLayout testCasillaL = new GridLayout(3, 3);
        testCasillaL.setHgap(20);
        testCasillaL.setVgap(10);
        testCasilla.setLayout(testCasillaL);

        for (int x = 1; x < 10; x++) {
            
            JLabel testFicha = new JLabel(Integer.toString(x));

            testCasilla.add(testFicha);
        }
        this.testSudoku.add(testCasilla);
    }

    //Private Methods
}
