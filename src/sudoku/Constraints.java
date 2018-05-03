package sudoku;

import java.awt.*;

public class Constraints {
    
    //Atributes
    private static GridBagConstraints constraints = new GridBagConstraints();
    
    //Public Methods
    public static GridBagConstraints get() {
        return constraints;
    }
    
    public static void edit(int x, int y, int w, int h, double wx, double wy) {
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
    
    public static void fill(int type) {
        if (type == -1) {
            constraints.fill = GridBagConstraints.NONE;
        }
        if (type == 0) {
            constraints.fill = GridBagConstraints.BOTH;
        }
        if (type == 1) {
            constraints.fill = GridBagConstraints.HORIZONTAL;
        }
        if (type == 2) {
            constraints.fill = GridBagConstraints.VERTICAL;
        }
    }
    
}
