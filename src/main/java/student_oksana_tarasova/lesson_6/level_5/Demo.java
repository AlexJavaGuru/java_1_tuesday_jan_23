package student_oksana_tarasova.lesson_6.level_5;

class Demo {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int [][] ticTac = ticTacToe.createField(3, 3);
        ticTacToe.fillInTheField(ticTac);
        ticTacToe.printFieldToConsole(ticTac);
        //ticTacToe.isWinPositionForHorizontals(tikTak, 2);
    }
}
