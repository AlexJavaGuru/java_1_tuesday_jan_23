package student_daniels_belejuns.lesson_6.level_5;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            boolean hasWon = true;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != playerToCheck) {
                    hasWon = false;
                    break;
                }
            }
            if (hasWon) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int col = 0; col < field[0].length; col++) {
            boolean hasWon = true;
            for (int row = 0; row < field.length; row++) {
                if (field[row][col] != playerToCheck) {
                    hasWon = false;
                    break;
                }
            }
            if (hasWon) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int size = field.length;
        boolean hasWon = true;
        for (int i = 0; i < size; i++) {
            if (field[i][i] != playerToCheck) {
                hasWon = false;
                break;
            }
        }
        if (hasWon) {
            return true;
        }

        hasWon = true;
        for (int i = 0; i < size; i++) {
            if (field[i][size - 1 - i] != playerToCheck) {
                hasWon = false;
                break;
            }
        }
        if (hasWon) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        int size = field.length;
        for (int i = 0; i < size; i++) {
            boolean hasWon = true;
            for (int j = 0; j < size; j++) {
                if (field[i][j] != playerToCheck) {
                    hasWon = false;
                    break;
                }
            }
            if (hasWon) {
                return true;
            }
        }

        for (int j = 0; j < size; j++) {
            boolean hasWon = true;
            for (int i = 0; i < size; i++) {
                if (field[i][j] != playerToCheck) {
                    hasWon = false;
                    break;
                }
            }
            if (hasWon) {
                return true;
            }
        }
        boolean hasWon = true;
        for (int i = 0; i < size; i++) {
            if (field[i][i] != playerToCheck) {
                hasWon = false;
                break;
            }
        }
        if (hasWon) {
            return true;
        }
        hasWon = true;
        for (int i = 0; i < size; i++) {
            if (field[i][size - 1 - i] != playerToCheck) {
                hasWon = false;
                break;
            }
        }
        if (hasWon) {
            return true;
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        int size = field.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (field[i][j] == 0) {
                    return false;
                }
            }
        }
        for (int player = 1; player <= 2; player++) {
            if (isWinPosition(field, player)) {
                return false;
            }
        }
        return true;
    }
}
