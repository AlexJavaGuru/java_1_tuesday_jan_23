package student_oleg_gryazev.lesson_6.task_21;

import java.util.Arrays;

public class TwoDimensionArrayDemo {
    public static void main(String[] args) {

        TwoDimensionalArray twoArray = new TwoDimensionalArray();
        int[][] twoDimension = new int[2][2];
        twoArray.randomFillingTwoDimensionArray(twoDimension);
        System.out.println("Two dimension massive = " + Arrays.deepToString(twoDimension));
        twoArray.sumOfArrayNumbers(twoDimension);
        System.out.println("The sum of all massive elements = " + twoArray.sumOfArrayNumbers(twoDimension));

    }

}
