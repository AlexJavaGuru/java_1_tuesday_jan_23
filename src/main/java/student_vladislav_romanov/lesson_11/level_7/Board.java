package student_vladislav_romanov.lesson_11.level_7;

import java.util.Arrays;

public class Board {

    private int width;
    private int height;
    private Chip[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = fillBoardWithEmptyChips();
    }

    public void placeChip(Chip chip, Move move) {
        board[move.getY()][move.getX()] = chip;
        printBoard();
    }

    public boolean isMoveInRange(int col) {
        return col < width;
    }

    public int freeCellY(int col) {
        for (int row = height - 1; row >= 0; row--) {
            if (getChip(row, col).getColor() == ChipColor.NONE) {
                return row;
            }
        }
        return -1;
    }

    private Chip[][] fillBoardWithEmptyChips() {
        Chip[][] emptyBoard = new Chip[height][width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                emptyBoard[row][col] = new Chip(ChipColor.NONE);
            }
        }

        return emptyBoard;
    }

    public void printBoard() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(getChip(row, col));
            }
            System.out.println();
        }
    }

    public boolean hasWinningSequenceForHorizontal(Chip chip, int row) {
        int count = 0;
        for (int col = 0; col < width; col++) {
            if (getChip(row, col).equals(chip)) {
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

    public boolean hasWinningSequenceForHorizontals(Chip chip) {
        for (int row = height - 1; row >= 0; row--) {
            if (hasWinningSequenceForHorizontal(chip, row)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWinningSequenceForVertical(Chip chip, int col) {
        int count = 0;
        for (int row = height - 1; row >= 0; row--) {
            if (getChip(row, col).equals(chip)) {
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

    public boolean hasWinningSequenceForVerticals(Chip chip) {
        for (int col = 0; col < width; col++) {
            if (hasWinningSequenceForVertical(chip, col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForMainDiagonal(Chip chip, int row, int col) {
        int count = 0;
        for (int currentRow = row, currentCol = col; currentRow < height; currentRow++, currentCol++) {
            if (currentCol >= width - 1) {
                break;
            }
            if (getChip(currentRow, currentCol).equals(chip)) {
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

    private boolean hasWinningSequenceForMainDiagonals(Chip chip) {
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

    private boolean hasWinningSequenceForSideDiagonal(Chip chip, int row, int col) {
        int count = 0;
        for (int currentRow = row, currentCol = col; currentRow < height; currentRow++, currentCol--) {
            if (currentCol < 0) {
                break;
            }
            if (getChip(currentRow, currentCol).equals(chip)) {
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

    private boolean hasWinningSequenceForSideDiagonals(Chip chip) {
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

    private boolean hasWinningSequenceForBothDiagonals(Chip chip) {
        return hasWinningSequenceForMainDiagonals(chip) || hasWinningSequenceForSideDiagonals(chip);
    }

    public boolean hasWinningSequence(Chip chip) {
        return hasWinningSequenceForHorizontals(chip) || hasWinningSequenceForVerticals(chip) || hasWinningSequenceForBothDiagonals(chip);
    }

    public boolean isDrawPosition() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (getChip(row, col).equals(new Chip(ChipColor.NONE))) {
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

    public Chip getChip(int row, int col) {
        return board[row][col];
    }

    @Override
    public String toString() {
        return "Board{" +
                "width=" + width +
                ", height=" + height +
                ", chips=" + Arrays.toString(board) +
                '}';
    }

}
