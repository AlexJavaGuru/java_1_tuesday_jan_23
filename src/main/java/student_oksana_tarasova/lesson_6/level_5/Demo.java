package student_oksana_tarasova.lesson_6.level_5;

class Demo {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] ticTac = ticTacToe.createField(3, 3);
        ticTacToe.fillInTheField(ticTac, -1);
        ticTacToe.printFieldToConsole(ticTac);

        Move move1 = ticTacToe.getNextMove();
        ticTac [move1.getX()][move1.getY()] = 0;
        ticTacToe.printFieldToConsole(ticTac);

        Move move2 = ticTacToe.getNextMove();
        ticTac [move2.getX()][move2.getY()] = 0;
        ticTacToe.printFieldToConsole(ticTac);

        Move move3 = ticTacToe.getNextMove();
        ticTac [move3.getX()][move3.getY()] = 0;
        ticTacToe.printFieldToConsole(ticTac);

        ticTacToe.isWinPositionForHorizontals(ticTac, 0);


       // ticTacToe.getNextMove();
        //ticTacToe.printFieldToConsole(ticTac);

    }
}
