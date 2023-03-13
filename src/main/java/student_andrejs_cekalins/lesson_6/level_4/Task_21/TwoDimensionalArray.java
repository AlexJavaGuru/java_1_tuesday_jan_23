package student_andrejs_cekalins.lesson_6.level_4.Task_21;


import java.util.Random;

class TwoDimensionalArray {
    public void fillDoubleArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        System.out.println("Double array random numbers are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findSumInDoubleArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Double array sum is: " + sum);
    }
}
