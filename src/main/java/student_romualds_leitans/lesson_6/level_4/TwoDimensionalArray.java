package student_romualds_leitans.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {

    public void fillRandomNumberArray(int array[][],int rows, int colums) {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public int getSumOfArray(int array[][],int rows, int colums) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
