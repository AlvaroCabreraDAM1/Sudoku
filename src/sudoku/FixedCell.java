package sudoku;

import java.awt.*;
import javax.swing.*;

public class FixedCell extends Cell {

    //Atributes
    private JLabel label;
    private JPanel panel;

    //Constructors
    public FixedCell(int value) {
        super(value);
        this.label = new JLabel(Integer.toString(value));
        this.panel = new JPanel();
        this.panel.setLayout(new GridBagLayout());
        this.panel.setBackground(Color.LIGHT_GRAY);
        this.label.setHorizontalAlignment(SwingConstants.CENTER);
        this.panel.add(label);
    }

    //Private Methods
    
    //Public Methods
    public JPanel getPanel() {
        return this.panel;
    }

    public void setBorder(int topBorder, int leftBorder, int bottombBorder, int rightBorder, Color color) {
        this.panel.setBorder(BorderFactory.createMatteBorder(topBorder, leftBorder, bottombBorder, rightBorder, color));
    }

}