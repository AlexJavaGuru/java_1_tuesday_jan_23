package student_vladislav_romanov.lesson_5.level_7;

import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.print("Please enter array length: ");
        int[] numbers = arrayUtil.createArray(scanner.nextInt());

        arrayUtil.fillArrayWithRandomNumbers(numbers);

        arrayUtil.printArrayToConsole(numbers);
    }

}
