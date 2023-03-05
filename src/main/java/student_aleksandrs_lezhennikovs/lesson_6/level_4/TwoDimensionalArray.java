package student_aleksandrs_lezhennikovs.lesson_6.level_4;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {

    int[][] createArray() {

        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int cols = input.nextInt();
        int[][] intArray = new int[row][cols];
        return intArray;
    }

    void fillArrayWithRandomNumbers (int[][] intArray){

        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = random.nextInt(10);
           }
       }
    }

    int sumOfAllElementsInArray(int[][] intArray) {

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum += intArray[i][j];
            }
        }
        return sum;
    }
}
