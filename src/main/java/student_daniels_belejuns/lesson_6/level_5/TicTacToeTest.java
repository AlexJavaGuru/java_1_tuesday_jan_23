package student_daniels_belejuns.lesson_6.level_5;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontals();
        test.notWinPositionForHorizontals();
        test.isWinPositionForVerticals();
        test.notWinPositionForVerticals();
        test.isWinPositionForDiagonals();
        test.notWinPositionForDiagonals();
        test.isWinPosition();
        test.notWinPosition();
        test.isDrawPosition();
        test.notDrawPosition();
    }

    public void isWinPositionForHorizontals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0,},
                {1, 1, 1},
                {1, 0, 0}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, 1);
        checkResult(realResult == expectedResult, "Is Win position for horizontals test ");
    }

    public void notWinPositionForHorizontals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 1, 0,},
                {1, 1, 1},
                {1, 0, 0}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, 0);
        checkResult(realResult == !expectedResult, "Is Win position for horizontals test ");
    }

    public void isWinPositionForVerticals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1,},
                {1, 1, 0},
                {1, 0, 0}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, 1);
        checkResult(realResult == expectedResult, "Is Win position for verticals test ");
    }

    public void notWinPositionForVerticals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1,},
                {1, 1, 0},
                {1, 0, 0}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, 0);
        checkResult(realResult == !expectedResult, "Not Win position for verticals test ");
    }

    public void isWinPositionForDiagonals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1,},
                {0, 1, 0},
                {0, 0, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, 1);
        checkResult(realResult == expectedResult, "Is Win position for diagonals test ");
    }

    public void notWinPositionForDiagonals() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1,},
                {0, 1, 0},
                {0, 0, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, 0);
        checkResult(realResult == !expectedResult, "Not Win position for diagonals test ");
    }

    public void isWinPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}};
        boolean realResult = true;
        boolean expectedResult = ticTacToe.isWinPosition(field, 1);
        checkResult(realResult == expectedResult, "Is Win position test ");
    }

    public void notWinPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}};
        boolean realResult = true;
        boolean expectedResult = ticTacToe.isWinPosition(field, 0);
        checkResult(realResult == !expectedResult, "Not Win position test ");
    }

    public void isDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{0, 0, 1},
                {1, 1, 0},
                {0, 1, 0}};
        boolean realResult = true;
        boolean expectedResult = ticTacToe.isDrawPosition(field);
        checkResult(realResult == expectedResult, "Is draw position test ");
    }

    public void notDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{-1, 0, 1},
                {1, 1, 0},
                {0, 0, 1}};
        boolean realResult = true;
        boolean expectedResult = ticTacToe.isDrawPosition(field);
        checkResult(realResult == !expectedResult, "Not draw position test ");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
