package sudoku;

import javax.swing.JTextField;

public class VariableCell extends Cell {

    //Atributes
    private JTextField field;
    
    //Constructors
    public VariableCell() {
        super();
        this.field = new JTextField();
    }

    //Private Methods
    
    //Public Methods
    public JTextField getField() {
        return this.field;
    }
    
}
