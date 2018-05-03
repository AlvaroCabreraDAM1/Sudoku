package sudoku;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VariableCell extends Cell implements FocusListener, ActionListener {

    //Atributes
    private JTextField field;
    private Panel panel;

    //Constructors
    public VariableCell(Panel panel) {
        super();
        this.panel = panel;
        this.field = new JTextField();
        this.field.addActionListener(this);
        this.field.addFocusListener(this);
        this.field.setHorizontalAlignment(SwingConstants.CENTER);
    }

    //Private Methods
    private boolean validate() throws HeadlessException {
        String txt = this.field.getText();
        if (!txt.equals("")) {
            try {
                int value = Integer.parseInt(txt);
                if (value > 0 && value < 10) {
                    this.setValue(value);
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                this.field.setText("");
                JOptionPane.showMessageDialog(null, "Introduce un número del 1 al 9");
                return false;
            }
        }
        return false;
    }

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
        this.field.setForeground(Color.WHITE);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        this.field.setBackground(Color.WHITE);
        this.field.setForeground(Color.BLACK);
        if (validate() == true) {
            this.panel.validatePanel();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (validate() == true) {
            this.panel.validatePanel();
        }
    }

}
