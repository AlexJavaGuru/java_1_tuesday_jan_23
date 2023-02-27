package student_julija_raudive.lesson_6.level_5;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
        game.playWithAI();
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        boolean win = false;

        for (int[] valueRow : field) {
            int sum = 0;

            for (int valueColumn : valueRow) {

                if (valueColumn == playerToCheck) {

                    sum++;
                }

                if (sum == 3) {
                    win = true;
                    break;
                }
            }

        }
        return win;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean win = false;

        for (int i = 0; i < field[0].length; i++) {
            int sum = 0;

            for (int[] valueRow : field) {

                if (valueRow[i] == playerToCheck) {

                    sum++;
                }

                if (sum == 3) {
                    win = true;
                    break;
                }

            }

        }

        return win;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        boolean win = false;
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field[0].length; j++) {

                if (i == j) {
                    if (field[i][j] == playerToCheck) {
                        mainDiagonal++;
                    }

                    if (mainDiagonal == 3) {
                        win = true;
                        break;
                    }
                }
                if (i + j == field.length - 1) {

                    if (field[i][j] == playerToCheck) {
                        secondaryDiagonal++;
                    }

                    if (secondaryDiagonal == 3) {
                        win = true;
                        break;
                    }

                }

            }

        }

        return win;

    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {

        boolean isWin = false;
        boolean horizontalResult = isWinPositionForHorizontals(field, playerToCheck);
        boolean verticalResult = isWinPositionForVerticals(field, playerToCheck);
        boolean diagonalResult = isWinPositionForDiagonals(field, playerToCheck);

        if (horizontalResult || verticalResult || diagonalResult) {
            isWin = true;
        }

        return isWin;

    }


    public boolean isDrawPosition(int[][] field) {

        boolean isDraw = false;
        boolean firstPlayerWin = isWinPosition(field, 0);
        boolean secondPlayerWin = isWinPosition(field, 1);

        boolean isEmptySpace = false;
        for (int[] valueRow : field) {


            for (int valueColumn : valueRow) {

                if (valueColumn == -1) {

                    isEmptySpace = true;
                    break;
                }
            }
        }

        if (!(firstPlayerWin || secondPlayerWin || isEmptySpace)) {
            isDraw = true;
        }

        return isDraw;
    }

    public int[][] createField() {

        return new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    }

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of your next move");
        System.out.println("x: ");
        int x = scanner.nextInt();
        System.out.println("y: ");
        int y = scanner.nextInt();

        return new Move(x, y);

    }

    public void printFieldToConsole(int[][] field) {

        for (int[] value : field) {

            for (int j = 0; j < field[0].length; j++) {
                if (value[j] != -1) {
                    System.out.print(" " + (value[j]) + "\t");
                } else {
                    System.out.print((value[j]) + "\t");
                }

            }
            System.out.println();

        }
        System.out.println();

    }

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
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
            printFieldToConsole(field);
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

    public Move getNextMoveAI(int[][] field) {

        Random random = new Random();
        int x  = random.nextInt(3);
        int y = random.nextInt(3);

         while(field[x][y] != -1) {
             x = random.nextInt(3);
             y = random.nextInt(3);
        }

        return new Move(x, y);

    }

    public void playWithAI() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMoveAI(field);
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
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
