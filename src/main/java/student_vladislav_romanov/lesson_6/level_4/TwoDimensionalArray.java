package student_vladislav_romanov.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arr = new int[2][5];
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        twoDimensionalArray.fillArray(arr);
        twoDimensionalArray.printArray(arr);
        twoDimensionalArray.sumOfArrayElements(arr);
    }

    public void fillArray(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    public void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumOfArrayElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of array elements is " + sum);
    }

}
