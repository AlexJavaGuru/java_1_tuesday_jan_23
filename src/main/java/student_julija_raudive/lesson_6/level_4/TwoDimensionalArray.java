package student_julija_raudive.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public int[][] createAnArray(int row, int column) {
        return new int[row][column];

    }

    public void fillAnArray(int[][] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

    }

    public int arraySum(int[][] arr) {

        int sum = 0;
        for (int[] value : arr) {

            for (int i : value) {
                sum += i;
            }
        }
        return sum;
    }


}

