package student_oksana_tarasova.lesson_6.level_5;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.createFieldTest();
        test.fillInTheFieldTest();
        test.isWinHorizontalsTest();
        test.isWinHorizontalsTest1();
        test.isWinVerticalsTest();
        test.isWinVerticalsTest1();
        test.isWinDiagonalLeft();
        test.isWinDiagonalLeft1();
        test.isWinDiagonalRight();
        test.isWinDiagonalRight1();
        test.isWinTest1();
        test.isWinTest2();
        test.isWinTest3();
        test.isWinTest4();
        test.isWinTest5();
        test.isWinTest6();
        test.isWinTest7();
        test.isWinTest8();
        test.isDrawPositionTest();
        test.isDrawPositionTest1();


    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] expectedResult = new int[3][3];
        int[][] realResult = ticTacToe.createField(3, 3);
        check(Arrays.deepEquals(expectedResult, realResult), "CreateField ");
    }

    public void fillInTheFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[3][3];
        int[][] expectedResult = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] realResult = ticTacToe.fillInTheField(array, -1);
        check(Arrays.deepEquals(expectedResult, realResult), "fillInTheField ");
    }

    public void isWinHorizontalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1},
                {0, 0, 0},
                {-1, -1, -1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        check(expectedResult == realResult, "isWinHorizontals ");
    }

    public void isWinHorizontalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1},
                {0, 1, 0},
                {-1, -1, -1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        check(expectedResult == realResult, "isWinHorizontals ");
    }

    public void isWinVerticalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, 0, -1},
                {0, 0, 0},
                {-1, 0, -1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForVerticals(array, 0);
        check(expectedResult == realResult, "isWinVerticals ");
    }

    public void isWinVerticalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1},
                {0, 1, 0},
                {-1, -1, -1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPositionForVerticals(array, 0);
        check(expectedResult == realResult, "isWinVerticals ");
    }

    public void isWinDiagonalLeft() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{0, -1, -1},
                {0, 0, 0},
                {-1, -1, 0}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        check(expectedResult == realResult, "isWinDiagonalLeft ");
    }

    public void isWinDiagonalLeft1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1},
                {0, 1, 0},
                {-1, -1, -1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        check(expectedResult == realResult, "isWinDiagonalLeft ");
    }

    public void isWinDiagonalRight() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, 0},
                {1, 0, 0},
                {0, -1, -1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        check(expectedResult == realResult, "isWinDiagonalRight ");
    }

    public void isWinDiagonalRight1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, 0},
                {0, 1, 1},
                {0, -1, -1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPositionForDiagonals(array, 0);
        check(expectedResult == realResult, "isWinDiagonalRight ");
    }

    public void isWinTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{0, -1, -1}, {0, 0, 0}, {0, 0, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionHorizontal ");
    }

    public void isWinTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, -1, -1}, {0, 1, 0}, {-1, 0, 1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionHorizontal ");
    }

    public void isWinTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{0, -1, -1}, {0, 1, 0}, {-0, 0, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionVertical ");
    }

    public void isWinTest4() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, -1, -1}, {0, 1, 0}, {-1, 0, 1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionVertical ");
    }

    public void isWinTest5() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{0, -1, -1}, {0, 0, 1}, {-1, 0, 0}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionDiagonalLeft ");
    }

    public void isWinTest6() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, -1, -1}, {0, -1, 0}, {-1, 0, 1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionDiagonalLeft ");
    }

    public void isWinTest7() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, -1, 0}, {1, 0, 0}, {0, 0, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionDiagonalRight ");
    }

    public void isWinTest8() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, -1, -1}, {0, 1, 0}, {-1, 0, 1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPosition(array, 0);
        check(expectedResult == realResult, "isWinPositionDiagonalRight ");
    }

    public void isDrawPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, 0, 0}, {1, 1, 0}, {0, 1, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isDrawPosition(array);
        check(expectedResult == realResult, "isDrawPosition ");
    }

    public void isDrawPositionTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, 0, 0}, {1, -1, 0}, {0, 1, 1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isDrawPosition(array);
        check(expectedResult == realResult, "isDrawPosition ");

    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + "= ok");
        } else {
            System.out.println(nameTest + "= fail");
        }
    }
}
