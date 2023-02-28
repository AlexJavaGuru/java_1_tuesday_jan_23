package student_vladislav_romanov.lesson_6.level_7;

import java.util.Scanner;

class TicTacToe {

    static Scanner scanner = new Scanner(System.in);
    char cell = '\u25a2';

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontal(char[][] field, char playerToCheck, int x) {
        for (int y = 0; y < field[x].length; y++) {
            if (field[x][y] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForHorizontals(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (isWinPositionForHorizontal(field, playerToCheck, x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVertical(char[][] field, char playerToCheck, int x) {
        for (int y = 0; y < field[x].length; y++) {
            if (field[y][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForVerticals(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (isWinPositionForVertical(field, playerToCheck, x)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForMainDiagonal(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForSideDiagonal(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            int y = field.length - x - 1;
            if (field[x][y] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(char[][] field, char playerToCheck) {
        return isWinPositionForMainDiagonal(field, playerToCheck) || isWinPositionForSideDiagonal(field, playerToCheck) ;
    }

    public boolean isWinPosition(char[][] field, char playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(char[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == cell) {
                    return false;
                }
            }
        }
        return true;
    }

    public char[][] createField(int size) {
        char[][] field = new char[size][size];

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                field[x][y] = cell;
            }
        }

        return field;
    }

    public Move getNextMove(char[][] field) {
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

    public Move getNextAIMove(char[][] field, Player player) {
        Move move;
        AI ai = new AI();
        move = ai.getAIMove(field, player);

        if (isCellFree(field, move)) {
            return move;
        } else {
            return getNextAIMove(field, player);
        }
    }

    public boolean isMoveInRange(char[][] field, Move move) {
        return move.getX() < field.length && move.getY() < field.length;
    }

    public boolean isCellFree(char[][] field, Move move) {
        return field[move.getX()][move.getY()] == cell;
    }

    public void printFieldToConsole(char[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                System.out.print(field[x][y]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public int setFieldSize() {
        System.out.print("Please enter size of field: ");
        return scanner.nextInt();
    }

    public Player setPlayer(String name, char symbol) {
        return new Player(name, symbol, isPlayerAI());
    }

    public boolean isPlayerAI() {
        System.out.print("Do you want AI for player one? (Y/N): ");
        return scanner.next().equals("Y");
    }

    public void playerMove(char[][] field, Player player) {
        Move move;
        if (player.isAI()) {
            move = getNextAIMove(field, player);
        } else {
            move = getNextMove(field);
        }
        field[move.getX()][move.getY()] = player.getSymbol();
        printFieldToConsole(field);
    }

    public boolean checkEndGameConditions(char[][] field, Player player) {
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
        Player playerOne = setPlayer("Player 1", '\u2612');
        Player playerTwo = setPlayer("Player 2", '\u2b24');

        char[][] field = createField(setFieldSize());
        printFieldToConsole(field);
        while(true) {
            playerMove(field, playerOne);
            if (checkEndGameConditions(field, playerOne)) {
                break;
            }

            playerMove(field, playerTwo);
            if (checkEndGameConditions(field, playerTwo)) {
                break;
            }
        }
    }

}
