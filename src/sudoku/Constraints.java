package sudoku;

import java.awt.*;

public class Constraints {
    
    //Atributes
    private static GridBagConstraints constraints = new GridBagConstraints();
    
    //Public Methods
    public static GridBagConstraints get() {
        return constraints;
    }
    
    public static void edit(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty) {
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
    }
    
    public static void fill(int fillType) {
        if (fillType == -1) {
            constraints.fill = GridBagConstraints.NONE;
        }
        if (fillType == 0) {
            constraints.fill = GridBagConstraints.BOTH;
        }
        if (fillType == 1) {
            constraints.fill = GridBagConstraints.HORIZONTAL;
        }
        if (fillType == 2) {
            constraints.fill = GridBagConstraints.VERTICAL;
        }
    }
    
    public static void insets(int topInset, int leftInset, int bottombInset, int rigthInset) {
        constraints.insets = new Insets(topInset, leftInset, bottombInset, rigthInset);
    }
    
}