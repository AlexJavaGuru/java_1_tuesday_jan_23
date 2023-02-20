package student_dmitry_kupcus.lesson_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Task26 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
      /*  ArrayUtil arrayUtil = new ArrayUtil();*/
        System.out.println("Please enter quantity of arrays:");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Array length is: " + array.length);
        System.out.println("Elements in array: " + Arrays.toString(array));
    }
}
