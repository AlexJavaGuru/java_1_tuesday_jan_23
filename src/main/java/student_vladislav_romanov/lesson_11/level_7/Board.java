package student_vladislav_romanov.lesson_11.level_7;

import java.util.Arrays;

public class Board {

    private static final char CHIP = '\u2b24';
    private static final char CELL = '\u25a2';
    private int width;
    private int height;
    private int[][] field;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.field = fillBoardWithEmptyChips();
    }

    public void placeChip(int chip, Move move) {
        field[move.getY()][move.getX()] = chip;
        printBoard();
    }

    public boolean isMoveInRange(int col) {
        return col < width;
    }

    public int freeCellY(int col) {
        for (int row = height - 1; row >= 0; row--) {
            if (getChip(row, col) == 0) {
                return row;
            }
        }
        return -1;
    }

    private int[][] fillBoardWithEmptyChips() {
        int[][] emptyBoard = new int[height][width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                emptyBoard[row][col] = 0;
            }
        }

        return emptyBoard;
    }

    public void printBoard() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                switch (getChip(row, col)) {
                    case 1 -> System.out.print("\u001B[31m" + CHIP + "\u001B[0m");
                    case -1 -> System.out.print("\u001B[33m" + CHIP + "\u001B[0m");
                    default -> System.out.print(CELL);
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getChip(int row, int col) {
        return field[row][col];
    }

    @Override
    public String toString() {
        return "Board{" +
                "width=" + width +
                ", height=" + height +
                ", chips=" + Arrays.toString(field) +
                '}';
    }

}
