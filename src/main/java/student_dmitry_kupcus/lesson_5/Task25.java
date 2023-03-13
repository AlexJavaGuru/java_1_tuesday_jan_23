package student_dmitry_kupcus.lesson_5;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Please enter quantity of arrays:");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        for (int i = 0; i < 0; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter elements in " + i + " array:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Total arrays: " + array.length);
        arrayUtil.printArrayToConsole(array);
    }
}
