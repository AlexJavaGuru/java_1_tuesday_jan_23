package student_romualds_leitans.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {
    int[][] array;
    int rows;
    int colums;

    public TwoDimensionalArray(int rows, int colums) {
        array = new int[rows][colums];
        this.rows = rows;
        this.colums = colums;
    }

    public void fillRandomNumberArray() {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public int getSumOfArray() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
