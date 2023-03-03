package student_oleg_gryazev.lesson_5.level_5;

import java.util.Random;
class ArrayUtil {
    public int[] createArray(int arrayLenght) {
        return new int[arrayLenght];
    }

    public void fillArrayWithRandomNumbers(int[] createArrow) {
        Random random = new Random();

        for (int i = 0; i < createArrow.length; ++i) {
            createArrow[i] = random.nextInt(100);
        }

    }

    static int findMaxInArray(int[] createArrow) {

        int elementMax = 0;
        int arrayLenghtMax = createArrow.length;

        for (int i = 0; i < arrayLenghtMax; i++) {
            int max = createArrow[i];
            if (max > elementMax) {
                elementMax = max;

            }

        }
        return elementMax;
    }

    static int findMinInArray(int[] createArray) {

        int elementMin = 0;
        int arrayLenghtMin = createArray.length;

        for (int i = 0; i < arrayLenghtMin; i++) {
            int min = createArray[i];
            if (min < elementMin) {
                elementMin = min;

            }

        }
        return elementMin;
    }

}


