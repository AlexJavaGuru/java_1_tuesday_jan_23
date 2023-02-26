package student_oksana_tarasova.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class EvenAndOddNumbersArray {
    public static void main(String[] args) {
        EvenAndOddNumbersArray evenAndOddNumbersArray = new EvenAndOddNumbersArray();
        int[] arrayNumbers = evenAndOddNumbersArray.createArray();
        evenAndOddNumbersArray.arrayFilling(arrayNumbers);
        evenAndOddNumbersArray.printInfo(arrayNumbers);
        System.out.println(evenAndOddNumbersArray.evenNumberArray(arrayNumbers));
        System.out.println(evenAndOddNumbersArray.oddNumberArray(arrayNumbers));

    }

    Random random = new Random();

    public int[] createArray() {
        int arrayLength = random.nextInt(10);
        int[] arrayNumber = new int[arrayLength];
        return new int[arrayLength];
    }

    public int[] arrayFilling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
        }
        return array;
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

