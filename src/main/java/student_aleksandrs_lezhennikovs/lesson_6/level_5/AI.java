package student_aleksandrs_lezhennikovs.lesson_6.level_5;

class AI {
    public Move getWin(int[][] field, int playerCheck) {
        Move move;
        if (getWinInHorizontals(field, playerCheck) != null) {
            move = getWinInHorizontals(field, playerCheck);
        } else if (getWinInVerticals(field, playerCheck) != null) {
            move = getWinInVerticals(field, playerCheck);
        } else if (getWinInFirstDiagonal(field, playerCheck) != null) {
            move = getWinInFirstDiagonal(field, playerCheck);
        } else {
            move = getWinInSecondDiagonal(field, playerCheck);
        }
        return move;
    }

    public Move getWinInOneRow(int[][] field, int playerCheck, int row) {
        int fieldSize = field.length;;
        int winCounter = 0;
        for (int column = 0; column < fieldSize; column++) {
            if (playerCheck == field[row][column]) {
                winCounter++;
            }
        }
        if (winCounter == fieldSize - 1) {
            for (int column = 0; column < fieldSize; column++) {
                if (isCellEmpty(field[row][column])) {
                    return new Move(row, column);
                }
            }
        }
        return null;
    }

    public Move getWinInHorizontals(int[][] field, int playerToCheck) {
        for (int rows = 0; rows < field.length; rows++) {
            if (getWinInOneRow(field, playerToCheck, rows) != null) {
                return getWinInOneRow(field, playerToCheck, rows);
            }
        }
        return null;
    }

    public Move getWinInOneCol(int[][] field, int playerCheck, int col) {
        int fieldSize = field.length;
        int winCounter = 0;
        for (int row = 0; row < fieldSize; row++) {
            if (playerCheck == field[row][col]) {
                winCounter++;
            }
        }
        if (winCounter == fieldSize - 1) {
            for (int row = 0; row < fieldSize; row++) {
                if (isCellEmpty(field[row][col])) {
                    return new Move(row, col);
                }
            }
        }
        return null;
    }

    public Move getWinInVerticals(int[][] field, int playerToCheck) {
        for (int col = 0; col < field.length; col++) {
            if (getWinInOneCol(field, playerToCheck, col) != null) {
                return getWinInOneCol(field, playerToCheck, col);
            }
        }
        return null;
    }

    public Move getWinInFirstDiagonal(int[][] field, int playerToCheck) {
        int fieldSize = field.length;
        int winCounter = 0;
        for (int cell = 0; cell < fieldSize; cell++) {
            if (playerToCheck == field[cell][cell]) {
                winCounter++;
            }
        }
        if (winCounter == fieldSize - 1) {
            for (int cell = 0; cell < fieldSize; cell++) {
                if (isCellEmpty(field[cell][cell])) {
                    return new Move(cell, cell);
                }
            }
        }
        return null;
    }

    public Move getWinInSecondDiagonal(int[][] field, int playerToCheck) {
        int fieldSize = field.length;
        int fromEnd = fieldSize - 1;
        int winCounter = 0;
        for (int fromStart = 0; fromStart < fieldSize; fromStart++) {
            if (playerToCheck == field[fromStart][fromEnd ]) {
                winCounter++;
            }
            fromEnd--;
        }
        if (winCounter == fieldSize - 1) {
            fromEnd = fieldSize- 1;
            for (int fromStart = 0; fromStart < fieldSize; fromStart++) {
                if (isCellEmpty(field[fromStart][fromEnd])) {
                    return new Move(fromStart, fromEnd);
                }
                fromEnd--;
            }
        }
        return null;
    }

    public Move getProtectedMoveFromLoss(int[][] field) {
        return getWin(field, 0);
    }

    public static boolean isCellEmpty(int cell) {
        return (cell == -1);
    }
}
