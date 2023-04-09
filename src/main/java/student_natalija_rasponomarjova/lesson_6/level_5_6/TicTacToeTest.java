package student_natalija_rasponomarjova.lesson_6.level_5_6;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.winPositionForHorizontalsWinTest();
        test.winPositionForVerticalsWinTest();
        test.winPositionForDiagonalsWinTest();
        test.isWinPositionTest();
        test.isDrawPositionTest();
        test.createFieldTest();
    }

    TicTacToe ticTacToe = new TicTacToe();

    public void winPositionForHorizontalsWinTest() {
        int[][] field = {{0, 1, 1},
                {0, 0, 0},
                {1, 1, 0}};
        boolean expected = true;

        boolean fact = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult(true, "WinPositionForHorizontals");
    }

    public void winPositionForVerticalsWinTest() {
        int[][] field = {{0, 1, 1},
                {1, 1, 0},
                {1, 1, 0}};
        boolean expected = true;
        boolean fact = ticTacToe.isWinPositionForVerticals(field, 1);
        checkResult(true, "WinPositionForVerticals");

    }

    public void winPositionForDiagonalsWinTest() {
        int[][] field = {{1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}};
        boolean expected = true;
        boolean fact = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkResult(true, "WinPositionForDiagonals");
    }

    public void isWinPositionTest() {
        int[][] field = {{1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}};
        //boolean expected = true;
        boolean fact = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkResult(true, "isWinPosition");
    }

    public void isDrawPositionTest() {
        int[][] field = {{0, 1, 1},
                {1, 1, 0},
                {1, 0, 0}};
        checkResult(true, "isDraw");
        field = new int[][]{{-1, 1, 1},
                {1, -1, 0},
                {1, 1, 0}};
        checkResult(false, "noDraw");

    }

    public void createFieldTest() {
        int[][] fact = ticTacToe.createField();
        int[][] expected = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        checkResult(true,"The field created");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Test OK");
        } else {
            System.out.println(testName + " Test Failed");

        }
    }
}
