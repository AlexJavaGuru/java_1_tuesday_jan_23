package student_andrejs_cekalins.lesson_6.level_5_6;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            boolean isWinPosition = true;
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] != playerToCheck) {
                    isWinPosition = false;
                }
            }
            if (isWinPosition) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            boolean isWinPosition = true;
            for (int y = 0; y < field[x].length; y++) {
                if (field[y][x] != playerToCheck) {
                    isWinPosition = false;
                }
            }
            if (isWinPosition) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonalFromTheLeftToTheRight(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonalFromTheRightToTheLeft(int[][] field, int playerToCheck) {
        for (int x = 0; x < field.length; x++) {
            if (field[x][field.length - 1 - x] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonalFromTheLeftToTheRight(field, playerToCheck) || isWinPositionForDiagonalFromTheRightToTheLeft(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForVerticals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public int[][] createField() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int col = scanner.nextInt();
        int[][] field = new int[row][col];
        int cell = -1;
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                field[x][y] = cell;
            }
        }
        return field;
    }

    public boolean isDrawPosition(int[][] field) {
        int cell = -1;
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                if (field[x][y] == cell) {
                    return false;
                }
            }
        }
        return true;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Set coordinates for move: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                System.out.print("|" + field[x][y] + "|");
            }
            System.out.println("");
        }
    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
