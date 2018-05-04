package sudoku;

public class Cell {

    //Atributes
    private int value = 0;

    //Constructors
    public Cell() {

    }

    public Cell(int value) {
        this.value = value;
    }

    //Private Methods
    
    //Public Methods
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}