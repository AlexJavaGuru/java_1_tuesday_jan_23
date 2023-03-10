package student_romualds_leitans.lesson_6.level_5;

import java.util.Scanner;

public class TicTacToe {
    int[][] field;

    public TicTacToe() {
        this.field = new int[3][3];
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[i].length - 1) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[i].length - 1) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
                return true;
            }
            if (field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean isHorizontalWin = isWinPositionForHorizontals(field,playerToCheck);
        boolean isVerticalWin = isWinPositionForVerticals(field,playerToCheck);
        boolean isDiagonalWin = isWinPositionForDiagonals(field,playerToCheck);
        return isDiagonalWin || isHorizontalWin || isVerticalWin;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1) { // ???? ???????? ?????????????? ???????????? ????????????
                    return false;
                }
            }
        }
        return true; // ?????? ???????????? ???????????? ?? ?????? ????????????????????
    }

    public int[][] createField() {
        int [][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field [i] [j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("?????????????? ???????????????????? ????????????, ???????? ???????????? ????????????????:");
        int x = scanner.nextInt();
        System.out.print("?????????????? ???????????????????? ?????? ??: ");
        int y = scanner.nextInt();
        System.out.print("?????????????? ???????????????????? ?????? Y: ");

        return new Move(x,y);
    }

    public void printFieldToConsole(int[][] field) {
        System.out.println("  0 1 2");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 1) {
                    System.out.print("X ");
                } else if (field[i][j] == -1) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



    public void play() {
        int[][] field = createField();
        while(true) {
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
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}

