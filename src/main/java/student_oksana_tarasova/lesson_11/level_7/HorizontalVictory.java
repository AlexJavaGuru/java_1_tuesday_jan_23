package student_oksana_tarasova.lesson_11.level_7;

class HorizontalVictory extends WinningPosition {


    @Override
    boolean countFour(int[][] field, int playerTurn) {
        for (int horizontalIndex = 0; horizontalIndex < field.length; horizontalIndex++) {
            if (findFour(field, playerTurn, horizontalIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean findFour(int[][] field, int playerTurn, int horizontalIndex) {
        int count = 0;
        for (int vertical = 0; vertical < field.length; vertical++) {
            if (field[horizontalIndex][vertical] == playerTurn) {
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
