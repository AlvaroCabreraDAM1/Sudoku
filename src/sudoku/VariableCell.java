package sudoku;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VariableCell extends Cell implements FocusListener, ActionListener {

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

    @Override
    public void focusGained(FocusEvent fe) {
        this.field.setBackground(Color.DARK_GRAY);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        this.field.setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
