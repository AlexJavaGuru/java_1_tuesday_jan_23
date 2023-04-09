package student_oleg_gryazev.lesson_6.task_21;

import java.util.Random;

public class TwoDimensionalArray {

    void randomFillingTwoDimensionArray(int[][] arrayToFill) {

        Random random = new Random();
        for (int i = 0; i < arrayToFill.length; i++)
            for (int j = 0; j < arrayToFill.length; j++)
                arrayToFill[i][j] = random.nextInt(10);
    }

    int sumOfArrayNumbers(int[][] array) {
        int sumNumbers = 0;
        for (int[] arr : array) {
            for (int i : arr)
                sumNumbers += i;
        }
        return sumNumbers;
    }
}

