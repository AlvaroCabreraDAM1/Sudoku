package sudoku;

public class Game {

    //Atributes
        
    //Constructors
    
    //Private Methods
    
    //Public Methods
         
    //Main
    
    public static void main(String[] args) {
        
        Window window = new Window("Sudoku");
        
        
        int sudoku[][] = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        
        Panel panel = new Panel(sudoku);
        
        
        window.add(panel, Constraints.get());
        
        window.setVisible(true);
        
    }
    
}
