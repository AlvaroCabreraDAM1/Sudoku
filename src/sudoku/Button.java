package sudoku;

import java.awt.event.*;
import javax.swing.*;

public class Button extends JButton implements ActionListener {

    //Atributes
    private Game game;

    //Constructor
    public Button(Game game, String name) {
        super(name);
        this.game = game;
        this.addActionListener(this);
    }

    //Private Methods
    
    //Public Methods
    @Override
    public void actionPerformed(ActionEvent e) {
        this.game.newSudoku();
    }
    
}