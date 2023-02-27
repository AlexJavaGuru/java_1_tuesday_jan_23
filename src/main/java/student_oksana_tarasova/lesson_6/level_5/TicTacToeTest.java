package student_oksana_tarasova.lesson_6.level_5;
/*
import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.createFieldTest();
        test.fillInTheFieldTest();
        test.isWinTest();
        test.isWinTest1();


    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] expectedResult = new int[3][3];
        int[][] realResult = ticTacToe.createField(3, 3);
        check(Arrays.equals(expectedResult, realResult), "CreateField ");
    }

    public void fillInTheFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[3][3];
        int[][] expectedResult = {{-1, -1, -1},{-1, -1, -1},{-1, -1, -1}};
        int[][] realResult = ticTacToe.fillInTheField(array, -1);
        check(Arrays.equals(expectedResult, realResult), "fillInTheField ");
    }

    public void isWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{0, -1, -1},{0, 0, 0},{0, 0, 1}};
        boolean expectedResult = true;
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        check(expectedResult == realResult, "isWin");
    }

    public void isWinTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[][]{{1, -1, -1},{0, 1, 0},{-1, 0, 1}};
        boolean expectedResult = false;
        boolean realResult = ticTacToe.isWinPositionForHorizontals(array, 0);
        check(expectedResult == realResult, "isWinNo");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + "= ok");
        } else {
            System.out.println(nameTest + "= fail");
        }
    }
}
*/