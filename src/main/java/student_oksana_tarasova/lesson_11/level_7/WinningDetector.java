package student_oksana_tarasova.lesson_11.level_7;

class WinningDetector {

    WinningPosition[] isWin;

    public WinningDetector(WinningPosition[] isWin) {
        this.isWin = isWin;
    }

    boolean isWinPosition(int[][] field, int playTurn) {
        for (WinningPosition winningPosition1 : isWin) {
            if (winningPosition1.countFour(field, playTurn)) {
                return true;
            }
        }
        return false;
    }
}
