package student_vladislav_romanov.lesson_11.level_7;

import java.util.Scanner;

import static student_vladislav_romanov.lesson_11.level_7.ChipColor.*;

public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.init().play();
    }

    public Game init() {
        System.out.print("Please enter ");
        Board board = new Board(setFieldSizeX(), setFieldSizeY());
        //Player player1 = setPlayer(RED);
        //Player player2 = setPlayer(YELLOW);
        Player player1 = new Player("Mister 1", RED, true);
        Player player2 = new Player("Mister 2", YELLOW, true);
        return new Game(player1, player2, board);
    }

    public int setFieldSizeX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter size of field. Columns: ");
        return scanner.nextInt();
    }

    public int setFieldSizeY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter size of field. Rows: ");
        return scanner.nextInt();
    }

    public Player setPlayer(ChipColor color) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter player's name: ");
        String name = scanner.nextLine();
        return new Player(name, color, isPlayerAI());
    }

    public boolean isPlayerAI() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want AI for player one? (Y/N): ");
        return scanner.next().equals("Y");
    }

}
