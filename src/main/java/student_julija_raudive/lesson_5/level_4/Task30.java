package student_julija_raudive.lesson_5.level_4;

import java.util.Random;

class Task30 {
    public static void main(String[] args) {

        ArrayUtil arr = new ArrayUtil();

        Random random = new Random();
        int lengthOfArray = random.nextInt(10);
        int[] array = arr.createArray(lengthOfArray);
        arr.fillArrayWithRandomNumbers(array);

        arr.printArrayToConsole(array);

        System.out.println("Odd values:");

        for (int value : array) {

            if (value % 2 != 0) {
                System.out.print(value + " ");
            }

        }

    }
}
