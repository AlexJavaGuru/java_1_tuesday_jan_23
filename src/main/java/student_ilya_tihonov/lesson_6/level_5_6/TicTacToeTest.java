package student_ilya_tihonov.lesson_6.level_5_6;

public class TicTacToeTest {

    public void testIsWinPositionForHorizontals() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        if (!ticTacToe.isWinPositionForHorizontals(field, 0)) {
            throw new AssertionError();
        }

        field = new int[][]{{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
        if (!ticTacToe.isWinPositionForHorizontals(field, 1)) {
            throw new AssertionError();
        }

        field = new int[][]{{0, 0, -1}, {-1, 1, -1}, {-1, -1, 1}};
        if (ticTacToe.isWinPositionForHorizontals(field, 0)) {
            throw new AssertionError();
        }
        if (ticTacToe.isWinPositionForHorizontals(field, 1)) {
            throw new AssertionError();
        }
    }

    public void testIsWinPositionForVerticals() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, -1, -1}, {0, -1, -1}, {0, -1, -1}};
        if (!ticTacToe.isWinPositionForVerticals(field, 0)) {
            throw new AssertionError();
        }

        field = new int[][]{{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}};
        if (!ticTacToe.isWinPositionForVerticals(field, 1)) {
            throw new AssertionError();
        }

        field = new int[][]{{0, -1, -1}, {-1, 1, -1}, {-1, -1, 1}};
        if (ticTacToe.isWinPositionForVerticals(field, 0)) {
            throw new AssertionError();
        }
        if (ticTacToe.isWinPositionForVerticals(field, 1)) {
            throw new AssertionError();
        }
    }

    public void testIsWinPositionForDiagonals() {
        int[][] field = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        int playerToCheck = 0;
        TicTacToe ticTacToe = new TicTacToe();

        if (ticTacToe.isWinPositionForHorizontals(field, playerToCheck)) {
            System.out.println("Test passed");
        } else {
            System.err.println("Test failed");
        }
    }
    public void testIsWinPosition() {
        TicTacToe game = new TicTacToe();
        int[][] field = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int playerToCheck = 1;
        boolean expected = true;
        boolean actual = game.isWinPosition(field, playerToCheck);
        if (actual == expected) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed. Expected: " + expected + ", but actual: " + actual);
        }
    }

    public void testIsDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] fieldOne = {{0, 1, 0}, {1, 0, 1}, {1, 0, 1}};
        boolean isDrawOne = ticTacToe.isDrawPosition(fieldOne);
        if (isDrawOne) {
            System.out.println("Test case 1 passed");
        } else {
            System.out.println("Test case 1 failed");
        }

        int[][] fieldTwo = {{0, 1, 0}, {1, 0, 1}, {1, 1, 0}};
        boolean isDrawTwo = ticTacToe.isDrawPosition(fieldTwo);
        if (!isDrawTwo) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test case 2 failed");
        }

        int[][] fieldThree = {{0, 1, -1}, {1, 0, 1}, {1, 0, 1}};
        boolean isDrawThree = ticTacToe.isDrawPosition(fieldThree);
        if (!isDrawThree) {
            System.out.println("Test case 3 passed");
        } else {
            System.out.println("Test case 3 failed");
        }

        int[][] fieldFour = {{0, 1, 0}, {1, 1, 0}, {1, 0, 1}};
        boolean isDrawFour = ticTacToe.isDrawPosition(fieldFour);
        if (!isDrawFour) {
            System.out.println("Test case 4 passed");
        } else {
            System.out.println("Test case 4 failed");
        }
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = ticTacToe.createField();

        boolean testPassed = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] != -1) {
                    testPassed = false;
                }
            }
        }

        if (testPassed) {
            System.out.println("Test passed successfully!");
        } else {
            System.out.println("Test failed: failed to create field with correct values");
        }
    }




}
