package sudoku;

import java.awt.Color;
import javax.swing.*;

public class FixedCell extends Cell {

    //Atributes
    private JLabel label;

    //Constructors
    public FixedCell(int value) {
        super(value);
        this.label = new JLabel(Integer.toString(value));
        this.label.setHorizontalAlignment(SwingConstants.CENTER);
    }

    //Private Methods
    
    //Public Methods
    public JLabel getLabel() {
        return this.label;
    }

    public void setBorder(int w, int a, int s, int d, Color color) {
        this.label.setBorder(BorderFactory.createMatteBorder(w, a, s, d, color));
    }

}
