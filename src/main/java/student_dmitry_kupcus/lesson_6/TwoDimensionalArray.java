package student_dmitry_kupcus.lesson_6;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray run = new TwoDimensionalArray();
        int[][] array = new int[2][2];
        run.fillRandom(array);
        run.sumOfArrays(array);
    }

    public void fillRandom(int[][] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = rand.nextInt(10) + 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public void sumOfArrays(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("Sum of all arrays numbers: " + sum);
    }

}