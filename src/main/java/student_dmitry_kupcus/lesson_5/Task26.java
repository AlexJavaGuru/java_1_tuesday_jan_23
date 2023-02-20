package student_dmitry_kupcus.lesson_5;

import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Please enter quantity of arrays:");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }
}
