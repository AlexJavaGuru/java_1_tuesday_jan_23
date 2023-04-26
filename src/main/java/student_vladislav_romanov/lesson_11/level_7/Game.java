package student_vladislav_romanov.lesson_11.level_7;

import java.util.List;
import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Board board;

    public Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    public void play() {
        List<Player> players = List.of(player1, player2);
        board.printBoard();

        boolean continueSession = true;
        while(continueSession) {
            for (Player player : players) {
                board.placeChip(player.getChip(), playerMove(board, player));
                if (checkEndGameConditions(player)) {
                    continueSession = false;
                    break;
                }
            }
        }
    }

    public Move playerMove(Board board, Player player) {
        Move playerMove;
        if (player.isAi()) {
            playerMove = getNextAIMove(board);
        } else {
            playerMove = getNextMove(board);
        }
        return playerMove;
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
        AI ai = new AI();
        int aiMoveColumn = ai.getAIMove(board);

        if (board.isMoveInRange(aiMoveColumn)) {
            int row = board.freeCellY(aiMoveColumn);
            if (row >= 0) {
                return new Move(aiMoveColumn, row);
            } else {
                System.out.println("Column is full. Try again!");
                return getNextAIMove(board);
            }
        } else {
            System.out.println("Column is out of range. Try again!");
            return getNextMove(board);
        }
    }

    private boolean checkEndGameConditions(Player player) {
        int chip = player.getChip();
        WinLogic logic = new WinLogic(board, chip);

        if (logic.hasWinningSequence()) {
            System.out.println(player.getName() + " WIN!");
            return true;
        } else if (logic.isDrawPosition()) {
            System.out.println("DRAW!");
            return true;
        }

        return false;
    }

}
