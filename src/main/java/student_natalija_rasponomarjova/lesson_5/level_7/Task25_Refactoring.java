package student_natalija_rasponomarjova.lesson_5.level_7;

import java.util.Scanner;

class Task25_Refactoring {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length: ");
        int length = scanner.nextInt();
        System.out.println("Array length: " + length);
        int[] numbers = arrayUtil.createArray(length);
        for (int i = 0; i < length; i++) {
            System.out.println("Please, enter number: ");
            numbers[i] = scanner.nextInt();
        }
        arrayUtil.printArrayToConsole(numbers);
    }
}
