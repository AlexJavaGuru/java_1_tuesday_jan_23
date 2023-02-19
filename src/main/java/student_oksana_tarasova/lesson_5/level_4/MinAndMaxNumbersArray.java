package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class MinAndMaxNumbersArray {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);
        int[] arrayNumber = new int[size];
        System.out.println("Array length:" + size);

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(150);
        }
        System.out.println(Arrays.toString(arrayNumber));


        int max = arrayNumber[0];
        int min = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if (min > arrayNumber[i]) {
                min = arrayNumber[i];
            }
            if (arrayNumber[i] > max) {
                max = arrayNumber[i];
            }
        }
        System.out.println("Maximum number array: " + max);
        System.out.println("Minimum number array: " + min);
    }

}
