package student_aleksandrs_lezhennikovs.lesson_6.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        System.out.println("Input range of your array please");
        int[][] intArray = twoDimensionalArray.createArray();
        twoDimensionalArray.fillArrayWithRandomNumbers(intArray);
        System.out.println(Arrays.deepToString(intArray));
        int totalSum = twoDimensionalArray.sumOfAllElementsInArray(intArray);
        System.out.println("Total sum of element: " + totalSum);
    }



}
