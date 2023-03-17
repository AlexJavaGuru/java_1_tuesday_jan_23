package student_anastasiia_bokareva.lesson6.level5;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        String nameOne = game.playerName();
        String nameTwo = game.playerName();
        game.startGame(nameOne,nameTwo);
    }
    public String playerName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Player please name yourself - ");
        String playerName = scan.nextLine();
        return playerName;
    }
    public void startGame(String playerNameOne,String playerNameTwo){
        int[][] gameField = new int[3][3];
        System.out.println("Welcome in to the game.");
        System.out.println("We will have two players");
        System.out.println("First player will be - "+playerNameOne);
        System.out.println("Second player will be - "+playerNameTwo);
    }

}
