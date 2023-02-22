package student_nikita_visnakovs.lesson_5.level_7;

import student_nikita_visnakovs.lesson_5.level_5.ArrayUtil;

import java.util.Scanner;

public class Task_41 {

    public static void main(String[] args) {
        System.out.println("Enter array length..");
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] myArray = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        arrayUtil.printArrayToConsole(myArray);
        System.out.println("Max number = " + arrayUtil.findMaxNumber(myArray));
        System.out.println("Min number = " + arrayUtil.findMinNumber(myArray));
    }
}
