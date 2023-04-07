package student_oksana_tarasova.lesson_11.level_7;

class VerticalVictory extends WinningPosition {

    @Override
    boolean countFour(int[][] field, int playerTurn) {
        for (int verticalIndex = 0; verticalIndex < field.length; verticalIndex++) {
            if (findFour(field, playerTurn, verticalIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean findFour(int[][] field, int playerTurn, int verticalIndex) {
        int count = 0;
        for (int horizontal = 0; horizontal < field.length; horizontal++) {
            if (field[horizontal][verticalIndex] == playerTurn) {
                count++;
            } else {
                count = 0;
            }
        }
        if (count >=4 ) {
            return true;
        }
        return false;
    }
}
