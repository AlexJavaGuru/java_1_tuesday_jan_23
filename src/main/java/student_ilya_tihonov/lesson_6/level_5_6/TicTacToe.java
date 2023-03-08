package student_ilya_tihonov.lesson_6.level_5_6;

import java.util.Scanner;

public class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){

        for (int row = 0; row < field.length; row++) {
            if (field[row][0] == playerToCheck &&
                    field[row][1] == playerToCheck &&
                    field[row][2] == playerToCheck) {

                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field[0].length; i++) {
            if (field[0][i] == playerToCheck &&
                    field[1][i] == playerToCheck &&
                    field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][2] == playerToCheck) {
            return true;
        }
        if (field[0][2] == playerToCheck &&
                field[1][1] == playerToCheck &&
                field[2][0] == playerToCheck) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) {
        boolean hasEmptyCell = false;
        boolean hasWinningPosition = false;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    hasEmptyCell = true;
                    break;
                }
            }
            if (hasEmptyCell) {
                break;
            }
        }

        if (!hasEmptyCell) {
            hasWinningPosition = isWinPosition(field, 0) || isWinPosition(field, 1);
        }

        // возвращаем результат проверки
        return !hasEmptyCell && !hasWinningPosition;
    }

        public int[][] createField() {
            int[][] field = new int[3][3];
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    field[i][j] = -1;
                }
            }
            return field;
        }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate (0-2): ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate (0-2): ");
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print("_ ");
                } else if (field[i][j] == 0) {
                    System.out.print("O ");
                } else if (field[i][j] == 1) {
                    System.out.print("X ");
                }
            }
            System.out.println();
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



