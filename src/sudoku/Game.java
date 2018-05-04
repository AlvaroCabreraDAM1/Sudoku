package sudoku;

public class Game {

    //Atributes
    private Button button;
    private Panel panel;
    private SudokuDatabase sudokuDatabase;
    private Warning warning;
    private Window window;

    //Constructors
    public Game() {
        this.sudokuDatabase = new SudokuDatabase();
        this.window = new Window("Sudoku");
        this.warning = new Warning();
        this.panel = new Panel(sudokuDatabase.getSudoku(), warning);
        this.button = new Button(this, "<html> Nuevo <br> Sudoku </html>");
        this.addComponents();
        window.setVisible(true); 
    }

    //Private Methods
    private void addComponents() {
        Constraints.edit(0, 0, 9, 9, 0.9, 1);
        Constraints.fill(0);
        this.window.add(this.panel, Constraints.get());
        Constraints.edit(10, 0, 1, 1, 0.1, 0.5);
        Constraints.fill(0);
        this.window.add(this.warning, Constraints.get());
        Constraints.edit(10, 6, 1, 1, 0.1, 0.5);
        Constraints.fill(0);
        this.window.add(this.button, Constraints.get());
    }
    
    void newSudoku() {
        window.remove(this.panel);
        this.panel = new Panel(sudokuDatabase.getSudoku(), warning);
        Constraints.edit(0, 0, 9, 9, 0.9, 1);
        Constraints.fill(0);
        this.window.add(this.panel, Constraints.get());
        this.warning.actualize(0);
        window.setVisible(true);
    }
    
    //Public Methods
    
    //Main
    public static void main(String[] args) {
        Game game = new Game();
    }

}
