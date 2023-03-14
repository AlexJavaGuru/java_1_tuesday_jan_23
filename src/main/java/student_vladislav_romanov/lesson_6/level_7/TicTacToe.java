package student_vladislav_romanov.lesson_6.level_7;

import java.util.Scanner;

class TicTacToe {

    private static final char X = '\u2612';
    private static final char O = '\u2b24';
    private static final char CELL = '\u25a2';
    private static final int cell = 0;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontal(int[][] field, int playerToCheck, int x) {
        for (int y = 0; y < field[x].length; y++) {
            if (field[x][y] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (isWinPositionForHorizontal(field, playerToCheck, x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVertical(int[][] field, int playerToCheck, int x) {
        for (int y = 0; y < field[x].length; y++) {
            if (field[y][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (isWinPositionForVertical(field, playerToCheck, x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForMainDiagonal(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForSideDiagonal(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][field.length - x - 1] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForMainDiagonal(field, playerToCheck) || isWinPositionForSideDiagonal(field, playerToCheck) ;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == cell) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField(int size) {
        int[][] field = new int[size][size];

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                field[x][y] = cell;
            }
        }

        return field;
    }

    public Move getNextMove(int[][] field) {
        Move move;
        System.out.print("Enter coordinate x (from 1 to " + (field.length) + "): ");
        int x = scanner.nextInt() - 1;
        System.out.print("Enter coordinate y (from 1 to " + (field.length) + "): ");
        int y = scanner.nextInt() - 1;

        move = new Move(x, y);

        if (isMoveInRange(field, move)) {
            if (isCellFree(field, move)) {
                return move;
            } else {
                System.out.println("Cell isn't empty. Try again!");
                return getNextMove(field);
            }
        } else {
            System.out.println("Cell is out of range. Try again!");
            return getNextMove(field);
        }
    }

    public Move getNextAIMove(int[][] field) {
        Move move;
        AI ai = new AI();
        move = ai.getAIMove(field);

        if (isCellFree(field, move)) {
            return move;
        } else {
            return getNextAIMove(field);
        }
    }

    public boolean isMoveInRange(int[][] field, Move move) {
        return move.getX() < field.length && move.getY() < field.length;
    }

    public boolean isCellFree(int[][] field, Move move) {
        return field[move.getX()][move.getY()] == cell;
    }

    public void printFieldToConsole(int[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                switch (field[x][y]) {
                    case 1 -> System.out.print(X);
                    case -1 -> System.out.print(O);
                    default -> System.out.print(CELL);
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public int setFieldSize() {
        System.out.print("Please enter size of field: ");
        return scanner.nextInt();
    }

    public Player setPlayer(String name, int symbol) {
        return new Player(name, symbol, isPlayerAI());
    }

    public boolean isPlayerAI() {
        System.out.print("Do you want AI for player one? (Y/N): ");
        return scanner.next().equals("Y");
    }

    public void playerMove(int[][] field, Player player) {
        Move move;
        if (player.isAI()) {
            move = getNextAIMove(field);
        } else {
            move = getNextMove(field);
        }
        field[move.getX()][move.getY()] = player.getSymbol();
        printFieldToConsole(field);
    }

    public boolean checkEndGameConditions(int[][] field, Player player) {
        if (isWinPosition(field, player.getSymbol())) {
            System.out.println(player.getName() + " WIN!");
            return true;
        } else if (isDrawPosition(field)) {
            System.out.println("DRAW!");
            return true;
        }

        return false;
    }

    public void play() {
        Player[] players = { setPlayer("Player 1", 1), setPlayer("Player 2", -1) };
        int[][] field = createField(setFieldSize());

        printFieldToConsole(field);

        boolean continueSession = true;
        while(continueSession) {
            for (Player player : players) {
                playerMove(field, player);
                if (checkEndGameConditions(field, player)) {
                    continueSession = false;
                    break;
                }
            }
        }
    }

}
