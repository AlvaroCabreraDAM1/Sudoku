package sudoku;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    //Atributes
    private Container container = this.getContentPane();

    //Constructors
    public Window(String name) {
        super(name);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        container.setLayout(new GridBagLayout());
    }

    //Private Methods
    
    //Public Methods

}
