package student_oksana_tarasova.lesson_6.level_5;

import java.util.Arrays;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.createFieldTest();
        test.fillInTheFieldTest();


    }

    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] expectedResult = new int[3][3];
        int[][] realResult = ticTacToe.createField(3,3);
        check(Arrays.equals(expectedResult, realResult), "CreateField ");
    }

    public void fillInTheFieldTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = new int[3][3];
        int[][] expectedResult = {{-1, -1, -1},{-1, -1, -1},{-1, -1, -1}};
        int[][] realResult = ticTacToe.fillInTheField(array, -1);
        check(Arrays.equals(expectedResult, realResult), "fillInTheField ");
    }

    public void check(boolean state, String nameTest) {
        if(state) {
            System.out.println(nameTest + "= ok");
        } else {
            System.out.println(nameTest + "= fail");
        }
    }
}
