package student_vladislav_romanov.lesson_11.level_7;

public class WinLogic {

    Board board;
    int chip;

    public WinLogic(Board board, int chip) {
        this.board = board;
        this.chip = chip;
    }

    public boolean hasWinningSequenceForHorizontal(int row) {
        int count = 0;
        for (int col = 0; col < board.getWidth(); col++) {
            if (board.getChip(row, col) == chip) {
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

    public boolean hasWinningSequenceForHorizontals() {
        for (int row = board.getHeight() - 1; row >= 0; row--) {
            if (hasWinningSequenceForHorizontal(row)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWinningSequenceForVertical(int col) {
        int count = 0;
        for (int row = board.getHeight() - 1; row >= 0; row--) {
            if (board.getChip(row, col) == chip) {
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

    public boolean hasWinningSequenceForVerticals() {
        for (int col = 0; col < board.getWidth(); col++) {
            if (hasWinningSequenceForVertical(col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForMainDiagonal(int row, int col) {
        int count = 0;
        for (int currentRow = row, currentCol = col; currentRow < board.getHeight(); currentRow++, currentCol++) {
            if (currentCol >= board.getWidth() - 1) {
                break;
            }
            if (board.getChip(currentRow, currentCol) == chip) {
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

    private boolean hasWinningSequenceForMainDiagonals() {
        for (int row = board.getHeight() - 1; row >= 0; row--) {
            if (hasWinningSequenceForMainDiagonal(row, 0)) {
                return true;
            }
        }
        for (int col = board.getWidth() - 1; col >= 0; col--) {
            if (hasWinningSequenceForMainDiagonal(0, col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForSideDiagonal(int row, int col) {
        int count = 0;
        for (int currentRow = row, currentCol = col; currentRow < board.getHeight(); currentRow++, currentCol--) {
            if (currentCol < 0) {
                break;
            }
            if (board.getChip(currentRow, currentCol) == chip) {
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

    private boolean hasWinningSequenceForSideDiagonals() {
        for (int row = board.getHeight() - 1; row >= 0; row--) {
            if (hasWinningSequenceForSideDiagonal(row, board.getWidth() - 1)) {
                return true;
            }
        }
        for (int col = 0; col < board.getWidth(); col++) {
            if (hasWinningSequenceForSideDiagonal(0, col)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasWinningSequenceForBothDiagonals() {
        return hasWinningSequenceForMainDiagonals() || hasWinningSequenceForSideDiagonals();
    }

    public boolean hasWinningSequence() {
        return hasWinningSequenceForHorizontals() || hasWinningSequenceForVerticals() || hasWinningSequenceForBothDiagonals();
    }

    public boolean isDrawPosition() {
        for (int row = 0; row < board.getHeight(); row++) {
            for (int col = 0; col < board.getWidth(); col++) {
                if (board.getChip(row, col) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
