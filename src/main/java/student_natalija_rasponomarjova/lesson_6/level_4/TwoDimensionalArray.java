package student_natalija_rasponomarjova.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] numbers = new int[3][3];

        twoDimensionalArray.fillWithRandomNumbers(numbers);
        twoDimensionalArray.printArray(numbers);
        twoDimensionalArray.sumOfNumbers(numbers);
    }

    public void fillWithRandomNumbers(int[][] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(50);
            }
        }
    }

    public void printArray(int[][] numbers) {
        System.out.println(Arrays.deepToString(numbers));
    }

    public void sumOfNumbers(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}

