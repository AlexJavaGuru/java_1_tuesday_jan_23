package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class EvenAndOddNumbersArray {
    public static void main(String[] args) {
        EvenAndOddNumbersArray evenAndOddNumbersArray = new EvenAndOddNumbersArray();
        int[] arrayNumbers = evenAndOddNumbersArray.createArray(15);
        evenAndOddNumbersArray.arrayFilling(arrayNumbers, 150);
        evenAndOddNumbersArray.printInfo(arrayNumbers);
        System.out.println(evenAndOddNumbersArray.evenNumberArray(arrayNumbers));
        System.out.println(evenAndOddNumbersArray.oddNumberArray(arrayNumbers));

    }

    Random random = new Random();

    public int[] createArray(int length) {
        int[] arrayNumber = new int[length];
        return new int[length];
    }

    public void arrayFilling(int[] array, int numberRange) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(numberRange);
        }
    }

    public void printInfo(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public String evenNumberArray(int[] array) {
        String even = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += array[i] + "; ";
            }
        }
        return even;
    }

    public String oddNumberArray(int[] array) {
        String odd = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd += array[i] + "; ";
            }
        }
        return odd;
    }
}

