package student_julija_raudive.lesson_5.level_4;

import java.util.Scanner;

class Task26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array: ");
        int lengthOfArray = scanner.nextInt();

        ArrayUtil arr = new ArrayUtil();
        int[] array = arr.createArray(lengthOfArray);

        arr.fillArrayWithRandomNumbers(array);

        arr.printArrayToConsole(array);

    }
}
