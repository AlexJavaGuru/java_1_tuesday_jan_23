package student_aleksandrs_lezhennikovs.lesson_5.extra;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        boolean result;
        if(rowCheck(field)) {
            result = true;
        } else if (colsCheck(field)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private static boolean rowCheck(int[][] field) {
        boolean result = false;
        int check = 0;
        int sumWin = field.length;
        for (int horizont = 0; horizont < field.length; horizont++) {
            for (int vertical = 0; vertical < field.length; vertical++) {
                check += field[horizont][vertical];
                if (check == sumWin){
                    result = true;
                    break;
                }
            }
            check = 0;
        }
        return result;
    }

    private static boolean colsCheck(int[][] field) {
        boolean result = false;
        int check = 0;
        int sumWin = field.length;
        for (int vertical = 0; vertical < field.length; vertical++) {
            for (int horizont = 0; horizont < field.length; horizont++) {
                check += field[horizont][vertical];
                if (check == sumWin){
                    result = true;
                    break;
                }
            }
            check = 0;
        }
        return result;
    }
}
