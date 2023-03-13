package student_oksana_tarasova.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] arr = new int[5][2];
        array.fillArrayWithRandomNumbers(arr);
        array.printArray(arr);
        System.out.println("Sum of all array numbers: " + array.sumNumbersTwoDimensionalArray(arr));
    }

    public int[][] fillArrayWithRandomNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Random random = new Random();
                arr[i][j] = random.nextInt(50) - 25;
            }
        }
        return arr;
    }

    public void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public int sumNumbersTwoDimensionalArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}

