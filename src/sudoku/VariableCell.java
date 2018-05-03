package sudoku;

import java.awt.Color;
import javax.swing.*;

public class VariableCell extends Cell {

    //Atributes
    private JTextField field;
    
    //Constructors
    public VariableCell() {
        super();
        this.field = new JTextField();
        this.field.setHorizontalAlignment(SwingConstants.CENTER);
    }

    //Private Methods
    
    //Public Methods
    public JTextField getField() {
        return this.field;
    }
    
    public void setBorder(int w, int a, int s, int d, Color color) {
        this.field.setBorder(BorderFactory.createMatteBorder(w, a, s, d, color));
    }
    
}
