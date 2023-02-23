package student_vladislav_romanov.lesson_5.extra;

import java.util.Arrays;

public class TicTacToeTest {

    char playerOne = '\u2612';
    char playerTwo = '\u2b24';
    char cell = '\u25a2';

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
        char[][] field = {{playerTwo, playerOne, cell}, {playerOne, playerOne, playerOne}, {cell, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForHorizontals(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForHorizontalsTestSucceed");
    }

    public void isWinPositionForHorizontalsTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerOne, playerOne, cell}, {playerOne, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForHorizontals(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForHorizontalsTestFailed");
    }

    public void isWinPositionForVerticalsTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerOne, playerOne, cell}, {playerOne, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForVerticals(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForVerticalsTestSucceed");
    }

    public void isWinPositionForVerticalsTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerOne}, {playerTwo, playerOne, cell}, {cell, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForVerticals(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForVerticalsTestFailed");
    }

    public void isWinPositionForMainDiagonalTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerTwo, playerOne, cell}, {playerTwo, cell, playerOne}};
        boolean currentResult = ticTacToe.isWinPositionForMainDiagonal(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForMainDiagonalTestSucceed");
    }

    public void isWinPositionForMainDiagonalTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerOne, playerOne, cell}, {playerOne, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForMainDiagonal(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForMainDiagonalTestFailed");
    }

    public void isWinPositionForSideDiagonalTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerTwo, playerOne}, {playerTwo, playerOne, cell}, {playerOne, cell, playerTwo}};
        boolean currentResult = ticTacToe.isWinPositionForSideDiagonal(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForSideDiagonalTestSucceed");
    }

    public void isWinPositionForSideDiagonalTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerTwo, playerTwo}, {playerTwo, playerOne, cell}, {playerOne, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForSideDiagonal(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForSideDiagonalTestFailed");
    }

    public void isWinPositionForDiagonalsTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerTwo, playerOne, cell}, {playerTwo, cell, playerOne}};
        boolean currentResult = ticTacToe.isWinPositionForDiagonals(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionForDiagonalsTestSucceed");
    }

    public void isWinPositionForDiagonalsTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerOne, playerOne, cell}, {playerOne, cell, cell}};
        boolean currentResult = ticTacToe.isWinPositionForDiagonals(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionForDiagonalsTestFailed");
    }

    public void isWinPositionTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerTwo, playerOne, cell}, {playerTwo, cell, playerOne}};
        boolean currentResult = ticTacToe.isWinPosition(field, playerOne);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isWinPositionTestSucceed for player one");
    }

    public void isWinPositionTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerOne, playerTwo}, {playerTwo, playerOne, cell}, {playerTwo, cell, playerOne}};
        boolean currentResult = ticTacToe.isWinPosition(field, playerTwo);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isWinPositionTestFailed for player two");
    }

    public void isDrawPositionTestSucceed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerTwo, playerTwo}, {playerTwo, playerTwo, playerOne}, {playerOne, playerOne, playerTwo}};
        boolean currentResult = ticTacToe.isDrawPosition(field);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, true, "isDrawPositionTestSucceed");
    }

    public void isDrawPositionTestFailed() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] field = {{playerOne, playerTwo, playerTwo}, {playerTwo, playerTwo, playerOne}, {playerOne, cell, playerTwo}};
        boolean currentResult = ticTacToe.isDrawPosition(field);

        ticTacToe.printFieldToConsole(field);
        printResult(currentResult, false, "isDrawPositionTestFailed");
    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        char[][] expectedResult = {{cell, cell, cell}, {cell, cell, cell}, {cell, cell, cell}};
        char[][] currentResult = ticTacToe.createField(3);

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
