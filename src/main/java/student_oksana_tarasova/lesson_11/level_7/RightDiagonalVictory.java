package student_oksana_tarasova.lesson_11.level_7;

class RightDiagonalVictory extends WinningPosition {

    @Override
    boolean countFour(int[][] field, int playerTurn) {
        if (diagonal1(field, playerTurn)
                || diagonal2(field, playerTurn)
                || diagonal3(field, playerTurn)
                || diagonal4(field, playerTurn)
                || diagonal5(field, playerTurn)
                || diagonal6(field, playerTurn)) {
            return true;
        }
        return false;
    }

    private boolean diagonal1(int[][] field, int playerTurn) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == playerTurn) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean diagonal2(int[][] field, int playerTurn) {
        int count = 0;
        for (int i = 0; i < field.length - 1; i++) {
            if (field[i + 1][i] == playerTurn) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean diagonal3(int[][] field, int playerTurn) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i + 1] == playerTurn) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean diagonal4(int[][] field, int playerTurn) {
        int count = 0;
        for (int i = 0; i < field.length - 1; i++) {
            if (field[i][i + 2] == playerTurn) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean diagonal5(int[][] field, int playerTurn) {
        int count = 0;
        for (int i = 0; i < field.length / 2 + 1; i++) {
            if (field[i][i + 3] == playerTurn) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean diagonal6(int[][] field, int playerTurn) {
        int count = 0;
        for (int i = 0; i < field.length / 2 + 1; i++) {
            if (field[i + 2][i] == playerTurn) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
