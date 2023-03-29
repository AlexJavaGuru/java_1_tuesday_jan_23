package student_nikita_visnakovs.lesson_6.level_5;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    private void play() {
        int[][] field = createField(3, 3);
        while (true) {
            printFieldToConsole(field);
            Move move0 = getEnemyMove(field);
            while (true) {
                if (field[move0.getX()][move0.getY()] == -1) {
                    field[move0.getX()][move0.getY()] = 0;
                    break;
                } else {
                    move0 = getEnemyMove(field);
                }
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Enemy WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            while (true) {
                if (field[move1.getX()][move1.getY()] == -1) {
                    field[move1.getX()][move1.getY()] = 1;
                    break;
                } else {
                    System.out.println("This point is busy, try again");
                    move1 = getNextMove();
                }
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("You WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }


    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck);

    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField(int rows, int columns) {
        int[][] field = new int[rows][columns];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }


    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X coordinates..");
        int x = scanner.nextInt();
        System.out.println("Enter Y coordinates..");
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j]);
                if (j < field[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println(" | ");
        }
        System.out.println(" ");
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[j].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonalsFirst(field, playerToCheck) || isWinPositionForDiagonalsSecond(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonalsFirst(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonalsSecond(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i] != playerToCheck) {

                return false;
            } else if (i == field.length - 1) {
                return true;
            }
        }
        return false;
    }

    public Move getEnemyMove(int[][] field) {
        int[][] fakeField = copyField(field);

        int count = countPossibleOptionalForMove(fakeField);
        while (count != 0) {
            Move fakeMove = generateMove(fakeField);
            if (fakeMove != null) {
                makeMove(fakeField, fakeMove, 1);
                if (isWinPosition(fakeField, 1)) {
                    return fakeMove;
                }
            }
            count--;
        }
        return getRandomMove(fakeField);
    }

    private void makeMove(int[][] fakeField, Move fakeMove, int i) {
        fakeField[fakeMove.getX()][fakeMove.getY()] = i;

    }

    private int countPossibleOptionalForMove(int[][] fakeField) {
        int count = 0;
        for (int i = 0; i < fakeField.length; i++) {
            for (int j = 0; j < fakeField.length; j++) {
                if (fakeField[i][j] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    private Move generateMove(int[][] fakeField) {
        for (int i = 0; i < fakeField.length; i++) {
            for (int j = 0; j < fakeField.length; j++) {
                if (fakeField[i][j] == -1) {
                    fakeField[i][j] = 5;
                    return new Move(i, j);
                }
            }
        }
        return null;
    }

    private Move getRandomMove(int[][] fakeFiled) {
        Random random = new Random();
        Move move;
        do {
            move = new Move(random.nextInt(3), random.nextInt(3));
        } while (fakeFiled[move.getX()][move.getY()] == -1);
        return move;
    }

    private int[][] copyField(int[][] field) {
        int[][] fakeField = new int[field.length][field.length];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                fakeField[i][j] = field[i][j];
            }
        }
        return fakeField;
    }

}