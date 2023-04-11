package student_vladislav_romanov.lesson_11.level_7;

import java.util.List;
import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    public Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.currentPlayer = player1;
    }

    public void play() {
        List<Player> players = List.of(player1, player2);
        board.printBoard();

        boolean continueSession = true;
        while(continueSession) {
            for (Player player : players) {
                board.placeChip(new Chip(player.getChipColor()), getNextMove(board));
                if (checkEndGameConditions(player)) {
                    continueSession = false;
                    break;
                }
            }
        }
    }

    public Move getNextMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter column (from 1 to " + (board.getWidth()) + "): ");
        int column = scanner.nextInt() - 1;

        if (board.isMoveInRange(column)) {
            int row = board.freeCellY(column);
            if (row >= 0) {
                return new Move(column, row);
            } else {
                System.out.println("Column is full. Try again!");
                return getNextMove(board);
            }
        } else {
            System.out.println("Column is out of range. Try again!");
            return getNextMove(board);
        }
    }

    public Move getNextAIMove(Board board) {
//        Move move;
//        AI ai = new AI();
//        move = ai.getAIMove(board);
//
//        if (board.canPlaceChip(x, y)) {
//            return move;
//        } else {
//            return getNextAIMove(board);
//        }
        return new Move();
    }

    private boolean checkEndGameConditions(Player player) {
        Chip chip = new Chip(player.getChipColor());

        if (board.hasWinningSequence(chip)) {
            System.out.println(player.getName() + " WIN!");
            return true;
        } else if (board.isDrawPosition()) {
            System.out.println("DRAW!");
            return true;
        }

        return false;
    }

}
