package student_julija_raudive.lesson_6.level_5;

import java.util.Arrays;

class TicTacToeTest {

    TicTacToe game = new TicTacToe();

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winPositionForHorizontalsFirstRow();
        test.winPositionForHorizontalsSecondRow();
        test.winPositionForHorizontalsThirdRow();
        test.noWinForHorizontal();

        test.winPositionForVerticalFirstColumn();
        test.winPositionForVerticalSecondColumn();
        test.winPositionForVerticalThirdColumn();
        test.noWinForVertical();

        test.winPositionForMainDiagonal();
        test.winPositionForSecondaryDiagonal();
        test.noWinForDiagonal();

        test.horizontalIsWin();
        test.verticalIsWin();
        test.noWin();

        test.noDrawFirstPlayerWins();
        test.noDrawSecondPlayerWins();
        test.noDrawHasEmptySpaces();
        test.isDraw();

        test.createFieldTest();




    }


    public void winPositionForHorizontalsFirstRow() {
        boolean realResult = true;
        int[][] arr = {{0, 0, 0}, {0, -1, 1}, {1, 0, 0}};
        boolean isWin = game.isWinPositionForHorizontals(arr, 0);
        checkResults(realResult == isWin, "First row is win");

    }

    public void winPositionForHorizontalsSecondRow() {
        boolean realResult = true;
        int[][] arr = {{0, 1, 0}, {0, 0, 0}, {1, 0, 0}};
        boolean isWin = game.isWinPositionForHorizontals(arr, 0);
        checkResults(realResult == isWin, "Second row is win");

    }

    public void winPositionForHorizontalsThirdRow() {
        boolean realResult = true;
        int[][] arr = {{-1, 1, 0}, {0, -1, 0}, {0, 0, 0}};
        boolean isWin = game.isWinPositionForHorizontals(arr, 0);
        checkResults(realResult == isWin, "Third row is win");

    }

    public void noWinForHorizontal() {
        boolean realResult = false;
        int[][] arr = {{-1, 1, 0}, {0, -1, 0}, {-1, 0, 0}};
        boolean isWin = game.isWinPositionForHorizontals(arr, 0);
        checkResults(realResult == isWin, "No win for horizontal");

    }

    public void winPositionForVerticalFirstColumn() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 0}, {1, -1, 1}, {1, 0, 0}};
        boolean isWin = game.isWinPositionForVerticals(arr, 1);
        checkResults(realResult == isWin, "First column is win");

    }

    public void winPositionForVerticalSecondColumn() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 0}, {1, 0, 1}, {-1, 0, 0}};
        boolean isWin = game.isWinPositionForVerticals(arr, 0);
        checkResults(realResult == isWin, "Second column is win");

    }

    public void winPositionForVerticalThirdColumn() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 0}, {1, 1, 0}, {-1, 0, 0}};
        boolean isWin = game.isWinPositionForVerticals(arr, 0);
        checkResults(realResult == isWin, "Third column is win");

    }

    public void noWinForVertical() {
        boolean realResult = false;
        int[][] arr = {{1, 0, -1}, {1, 1, 0}, {-1, 0, 0}};
        boolean isWin = game.isWinPositionForVerticals(arr, 0);
        checkResults(realResult == isWin, "No win for vertical");

    }

    public void winPositionForMainDiagonal() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 0}, {1, 1, 0}, {-1, 1, 1}};
        boolean isWin = game.isWinPositionForDiagonals(arr, 1);
        checkResults(realResult == isWin, "Main diagonal is win");

    }

    public void winPositionForSecondaryDiagonal() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 0}, {1, 0, 0}, {0, 1, -1}};
        boolean isWin = game.isWinPositionForDiagonals(arr, 0);
        checkResults(realResult == isWin, "Secondary diagonal is win");

    }

    public void noWinForDiagonal() {
        boolean realResult = false;
        int[][] arr = {{1, 0, -1}, {1, 0, 0}, {0, 1, -1}};
        boolean isWin = game.isWinPositionForDiagonals(arr, 0);
        checkResults(realResult == isWin, "No win for diagonal");

    }

    public void horizontalIsWin() {
        boolean realResult = true;
        int[][] arr = {{0, 0, 0}, {0, -1, 1}, {1, 0, 0}};
        boolean isWin = game.isWinPosition(arr, 0);
        checkResults(realResult == isWin, "Horizontal is win");

    }

    public void verticalIsWin() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 0}, {1, -1, 1}, {1, 0, 0}};
        boolean isWin = game.isWinPosition(arr, 1);
        checkResults(realResult == isWin, "Vertical is win");

    }

    public void noWin() {
        boolean realResult = false;
        int[][] arr = {{1, 0, 0}, {1, -1, 1}, {-1, 0, 0}};
        boolean isWin = game.isWinPosition(arr, 1);
        checkResults(realResult == isWin, "No win");

    }

    public void noDrawFirstPlayerWins() {
        boolean realResult = false;
        int[][] arr = {{1, 0, 0}, {1, 1, 0}, {-1, 0, 0}};
        boolean isDraw = game.isDrawPosition(arr);
        checkResults(realResult == isDraw, "No draw and first player wins");

    }

    public void noDrawSecondPlayerWins() {
        boolean realResult = false;
        int[][] arr = {{1, 0, 0}, {1, -1, 1}, {1, 0, 0}};
        boolean isDraw = game.isDrawPosition(arr);
        checkResults(realResult == isDraw, "No draw and second player wins");

    }

    public void noDrawHasEmptySpaces() {
        boolean realResult = false;
        int[][] arr = {{1, 0, 0}, {1, -1, 1}, {-1, 0, 0}};
        boolean isDraw = game.isDrawPosition(arr);
        checkResults(realResult == isDraw, "Field has empty spaces, but no one wins");

    }

    public void isDraw() {
        boolean realResult = true;
        int[][] arr = {{1, 0, 1}, {1, 0, 1}, {0, 1, 0}};
        boolean isDraw = game.isDrawPosition(arr);
        checkResults(realResult == isDraw, "Is draw");

    }

    public void createFieldTest(){
        int[][] realResult = game.createField();
        int[][] result = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        checkResults(Arrays.deepEquals(result, realResult), "Create field");
    }

    public void checkResults(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + " test: OK");
        } else {
            System.out.println(testName + " test: FAIL");
        }
    }
}
