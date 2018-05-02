package sudoku;

import javax.swing.*;

public class FixedCell extends Cell {

    //Atributes
    private JLabel label;

    //Constructors
    public FixedCell(int value) {
        super(value);
        this.label = new JLabel(Integer.toString(value));
    }

    //Private Methods
    
    //Public Methods
    public JLabel getLabel() {
        return this.label;
    }
    
}