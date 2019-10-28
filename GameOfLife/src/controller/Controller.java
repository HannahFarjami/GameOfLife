package controller;

import model.Game;

public class Controller {

    public void startGame(int row, int column){
        Game game = new Game(row, column);
        game.startGame();
    }
}
