package student_aleksandrs_lezhennikovs.lesson_5.level_5;

import student_aleksandrs_lezhennikovs.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;

class ArrayDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray) + " it was Etalon");
        arrayUtil.printArrayToConsole(myArray);

        int maxInArray = arrayUtil.findMaxNumber(myArray);
        System.out.println("Max element in array is: " + maxInArray);

        int minInArray = arrayUtil.findMinNumber(myArray);
        System.out.println("Min element in array is: " + minInArray);
    }
}
