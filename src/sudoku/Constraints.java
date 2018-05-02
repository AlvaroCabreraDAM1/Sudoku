package sudoku;

import java.awt.*;

public class Constraints {
    
    //Atributes
    private static GridBagConstraints constraints;
    
    //Public Methods
    public static GridBagConstraints get() {
        return constraints;
    }
    
    public static void edit(int x, int y, int w, int h, int wx, int wy) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        constraints.weightx = wx;
        constraints.weighty = wy;
    }
    
    public static void insets(int w, int a, int s, int d) {
        constraints.insets = new Insets(w, a, s, d);
    }
    
}
