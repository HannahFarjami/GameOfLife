package model;

public class Game {
    private GameBoard currentGeneration;
    private GameBoard futureGeneration;

    public Game(int row, int column) {
        this.currentGeneration = new GameBoard(row, column);
        this.futureGeneration = new GameBoard(row, column);
    }

    public void startGame() {
        currentGeneration.fillBoard();
        playGame();
    }

    public void playGame() {
        for (int i = 0; i < currentGeneration.getRow(); i++) {
            for (int j = 0; j < currentGeneration.getColumn(); j++) {
                int nrOfAliveNeighbour = getAliveNeighbour(i, j);
                if (currentGeneration.getBoard()[i][j].isAlive()) {

                    // Any live cell with fewer than two live neighbours dies, as if by underpopulation.
                    if (nrOfAliveNeighbour < 2) futureGeneration.getBoard()[i][j].setAlive(false);

                        // Any live cell with two or three live neighbours lives on to the next generation.
                    else if (nrOfAliveNeighbour == 2 || nrOfAliveNeighbour == 3)
                        futureGeneration.getBoard()[i][j].setAlive(true);

                        // Any live cell with more than three live neighbours dies, as if by overpopulation.
                    else futureGeneration.getBoard()[i][j].setAlive(false);
                }
                // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
                else {
                    futureGeneration.getBoard()[i][j].setAlive(true);
                }
            }
        }
    }

    public int getAliveNeighbour(int i, int j) {
        int nrOfAliveNeighbour = 0;
        return nrOfAliveNeighbour;
    }
}
