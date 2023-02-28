package student_vladislav_romanov.lesson_6.level_7;

import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        test.isWinPositionForHorizontalsTestSucceed();
        test.isWinPositionForHorizontalsTestFailed();
        test.isWinPositionForVerticalsTestSucceed();
        test.isWinPositionForVerticalsTestFailed();
        test.isWinPositionForDiagonalsTestSucceed();
        test.isWinPositionForMainDiagonalTestSucceed();
        test.isWinPositionForMainDiagonalTestFailed();
        test.isWinPositionForSideDiagonalTestSucceed();
        test.isWinPositionForSideDiagonalTestFailed();
        test.isWinPositionForDiagonalsTestFailed();
        test.isWinPositionTestSucceed();
        test.isWinPositionTestFailed();
        test.isDrawPositionTestSucceed();
        test.isDrawPositionTestFailed();
        test.createFieldTest();
    }

    public void isWinPositionForHorizontalsTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, 1}, {-1, 1, 0}, {0, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForHorizontals(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForHorizontalsTestSucceed");
    }

    public void isWinPositionForHorizontalsTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {1, 1, 0}, {1, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForHorizontals(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForHorizontalsTestFailed");
    }

    public void isWinPositionForVerticalsTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {1, 1, 0}, {1, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForVerticals(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForVerticalsTestSucceed");
    }

    public void isWinPositionForVerticalsTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, 1}, {-1, 1, 0}, {0, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForVerticals(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForVerticalsTestFailed");
    }

    public void isWinPositionForMainDiagonalTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        boolean currentResult = ticTacToe.isWinPositionForMainDiagonal(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForMainDiagonalTestSucceed");
    }

    public void isWinPositionForMainDiagonalTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {1, 1, 0}, {1, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForMainDiagonal(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForMainDiagonalTestFailed");
    }

    public void isWinPositionForSideDiagonalTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, 1}, {-1, 1, 0}, {1, 0, -1}};
        boolean currentResult = ticTacToe.isWinPositionForSideDiagonal(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForSideDiagonalTestSucceed");
    }

    public void isWinPositionForSideDiagonalTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, -1}, {-1, 1, 0}, {1, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForSideDiagonal(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForSideDiagonalTestFailed");
    }

    public void isWinPositionForDiagonalsTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        boolean currentResult = ticTacToe.isWinPositionForDiagonals(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForDiagonalsTestSucceed");
    }

    public void isWinPositionForDiagonalsTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {1, 1, 0}, {1, 0, 0}};
        boolean currentResult = ticTacToe.isWinPositionForDiagonals(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForDiagonalsTestFailed");
    }

    public void isWinPositionTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        boolean currentResult = ticTacToe.isWinPosition(field, 1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionTestSucceed for player one");
    }

    public void isWinPositionTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, 1, -1}, {-1, 1, 0}, {-1, 0, 1}};
        boolean currentResult = ticTacToe.isWinPosition(field, -1);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionTestFailed for player two");
    }

    public void isDrawPositionTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, -1}, {-1, -1, 1}, {1, 1, -1}};
        boolean currentResult = ticTacToe.isDrawPosition(field);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isDrawPositionTestSucceed");
    }

    public void isDrawPositionTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {{1, -1, -1}, {-1, -1, 1}, {1, 0, -1}};
        boolean currentResult = ticTacToe.isDrawPosition(field);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isDrawPositionTestFailed");
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] expectedResult = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] currentResult = ticTacToe.createField(3);

        ticTacToe.printFieldToConsole(currentResult);
        printResult(Arrays.deepEquals(currentResult, expectedResult), "createFieldTest");
    }

    public void printResult(boolean result, boolean expected, String test) {
        if (result == expected) {
            System.out.println(test + " test SUCCEED");
        } else {
            System.out.println(test + " test FAILED");
        }
        System.out.println("----------------------------------------------------");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
        } else {
            System.out.println(test + " test FAILED");
        }
        System.out.println("----------------------------------------------------");
    }
}
