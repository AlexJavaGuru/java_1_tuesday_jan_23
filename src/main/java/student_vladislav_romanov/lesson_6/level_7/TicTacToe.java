package student_vladislav_romanov.lesson_6.level_7;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    static Scanner scanner = new Scanner(System.in);
    char cell = '\u25a2';

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            boolean winPosition = true;
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] != playerToCheck) {
                    winPosition = false;
                    break;
                }
            }
            if (winPosition) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(char[][] field, char playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            boolean winPosition = true;
            for (int y = 0; y < field[x].length; y++) {
                if (field[y][x] != playerToCheck) {
                    winPosition = false;
                    break;
                }
            }
            if (winPosition) {
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
        boolean hasEmptyCell = false;

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == cell) {
                    hasEmptyCell = true;
                    break;
                }
            }
            if (hasEmptyCell) {
                break;
            }
        }

        return !hasEmptyCell;
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

    public Move getNextMove(char[][] field, Player player) {
        int x;
        int y;
        if (player.isAI()) {
            Random random = new Random();
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } else {
            System.out.print("Enter coordinate x (from 1 to " + (field.length) + "): ");
            x = scanner.nextInt() - 1;
            System.out.print("Enter coordinate y (from 1 to " + (field.length) + "): ");
            y = scanner.nextInt() - 1;
        }

        if (isMoveInRange(field, x, y)) {
            if (isCellFree(field, x, y)) {
                return new Move(x, y);
            } else {
                if (!player.isAI()) {
                    System.out.println("Cell isn't empty. Try again!");
                }
                return getNextMove(field, player);
            }
        } else {
            System.out.println("Cell is out of range. Try again!");
            return getNextMove(field, player);
        }
    }

    public boolean isMoveInRange(char[][] field, int x, int y) {
        return x < field.length && y < field.length;
    }

    public boolean isCellFree(char[][] field, int x, int y) {
        return field[x][y] == cell;
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

    public Player setPlayer(char symbol) {
        return new Player(symbol, isPlayerAI());
    }

    public boolean isPlayerAI() {
        System.out.print("Do you want AI for player one? (Y/N): ");
        return scanner.next().equals("Y");
    }

    public void play() {
        Player playerOne = setPlayer('\u2612');
        Player playerTwo = setPlayer('\u2b24');

        char[][] field = createField(setFieldSize());
        printFieldToConsole(field);
        while(true) {
            Move move0 = getNextMove(field, playerOne);
            field[move0.getX()][move0.getY()] = playerOne.getSymbol();
            printFieldToConsole(field);
            if (isWinPosition(field, playerOne.getSymbol())) {
                System.out.println("Player 1 WIN!");
                break;
            } else if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = getNextMove(field, playerTwo);
            field[move1.getX()][move1.getY()] = playerTwo.getSymbol();
            printFieldToConsole(field);
            if (isWinPosition(field, playerTwo.getSymbol())) {
                System.out.println("Player 2 WIN!");
                break;
            } else if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
