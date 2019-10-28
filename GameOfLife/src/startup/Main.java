package startup;

import controller.Controller;
import model.GameBoard;



public class Main {
    public static void main(String[] args) {
        System.out.println("Kevin är en bajskorv!!!");

        Controller controller = new Controller();
        controller.startGame(2,2);
        //GameBoard gameBoard = new GameBoard(2, 2);
    }
}