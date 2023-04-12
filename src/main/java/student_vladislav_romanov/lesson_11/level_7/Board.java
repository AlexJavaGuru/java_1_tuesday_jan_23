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
    }

    public boolean hasWinningSequenceForHorizontal(int chip, int row) {
        int count = 0;
        for (int col = 0; col < width; col++) {
            if (getChip(row, col) == chip) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWinningSequenceForHorizontals(int chip) {
        for (int row = height - 1; row >= 0; row--) {
            if (hasWinningSequenceForHorizontal(chip, row)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWinningSequenceForVertical(int chip, int col) {
        int count = 0;
        for (int row = height - 1; row >= 0; row--) {
            if (getChip(row, col) == chip) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWinningSequenceForVerticals(int chip) {
        for (int col = 0; col < width; col++) {
            if (hasWinningSequenceForVertical(chip, col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForMainDiagonal(int chip, int row, int col) {
        int count = 0;
        for (int currentRow = row, currentCol = col; currentRow < height; currentRow++, currentCol++) {
            if (currentCol >= width - 1) {
                break;
            }
            if (getChip(currentRow, currentCol) == chip) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForMainDiagonals(int chip) {
        for (int row = height - 1; row >= 0; row--) {
            if (hasWinningSequenceForMainDiagonal(chip, row, 0)) {
                return true;
            }
        }
        for (int col = width - 1; col >= 0; col--) {
            if (hasWinningSequenceForMainDiagonal(chip, 0, col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForSideDiagonal(int chip, int row, int col) {
        int count = 0;
        for (int currentRow = row, currentCol = col; currentRow < height; currentRow++, currentCol--) {
            if (currentCol < 0) {
                break;
            }
            if (getChip(currentRow, currentCol) == chip) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForSideDiagonals(int chip) {
        for (int row = height - 1; row >= 0; row--) {
            if (hasWinningSequenceForSideDiagonal(chip, row, width - 1)) {
                return true;
            }
        }
        for (int col = 0; col < width; col++) {
            if (hasWinningSequenceForSideDiagonal(chip, 0, col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForBothDiagonals(int chip) {
        return hasWinningSequenceForMainDiagonals(chip) || hasWinningSequenceForSideDiagonals(chip);
    }

    public boolean hasWinningSequence(int chip) {
        return hasWinningSequenceForHorizontals(chip) || hasWinningSequenceForVerticals(chip) || hasWinningSequenceForBothDiagonals(chip);
    }

    public boolean isDrawPosition() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (getChip(row, col) == 0) {
                    return false;
                }
            }
        }
        return true;
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
