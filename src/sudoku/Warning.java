package sudoku;

import java.awt.*;
import javax.swing.*;

public class Warning extends JPanel {

    //Atributes
    private JPanel red = new JPanel();
    private JPanel orange = new JPanel();
    private JPanel green = new JPanel();

    //Constructors
    public Warning() {
        this.setLayout(new GridLayout(3, 1));
        this.add(red);
        this.add(orange);
        this.add(green);
        this.red.setBackground(Color.DARK_GRAY);
        this.orange.setBackground(Color.ORANGE);
        this.green.setBackground(Color.DARK_GRAY);
        this.red.setBorder(BorderFactory.createMatteBorder(10, 10, 5, 10, Color.BLACK));
        this.orange.setBorder(BorderFactory.createMatteBorder(5, 10, 5, 10, Color.BLACK));
        this.green.setBorder(BorderFactory.createMatteBorder(5, 10, 10, 10, Color.BLACK));
    }

    //Private Methods
    
    //Public Methods
    public void actualize(int result) {
        if (result == -1) {
            this.red.setBackground(Color.RED);
            this.orange.setBackground(Color.DARK_GRAY);
            this.green.setBackground(Color.DARK_GRAY);
        }
        if (result == 0) {
            this.red.setBackground(Color.DARK_GRAY);
            this.orange.setBackground(Color.ORANGE);
            this.green.setBackground(Color.DARK_GRAY);
        }
        if (result == 1) {
            this.red.setBackground(Color.DARK_GRAY);
            this.orange.setBackground(Color.DARK_GRAY);
            this.green.setBackground(Color.GREEN);
        }
    }

}