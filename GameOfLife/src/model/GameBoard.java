package model;

//flera instanser av gameboard kolla static nonstatic då.
public class GameBoard {
    private Cell[][] board;
    private int row;
    private int column;

    public GameBoard(int row, int column){
        this.board = new Cell[row][column];
        this.row = row;
        this.column = column;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void fillBoard() {
        for(int i = 0; i < getRow(); i++){
            for(int j = 0; j < getColumn(); j++){
                this.board[i][j] = new Cell(Math.random() < 0.5);
            }
        }
    }
}
