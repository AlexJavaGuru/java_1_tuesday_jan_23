package student_oksana_tarasova.lesson_6.level_3;


class ArrayService {

    static boolean containsTheGivenNumberInTheArray(int[] array, int givenNumber) {
        for (int numberArray : array) {
            if (givenNumber == numberArray) {
                return true;
            }
        }
        return false;
    }

    static int countOccurrences(int[] array, int givenNumber) {
        int count = 0;
        for (int numberArray : array) {
            if (givenNumber == numberArray) {
                count++;
            }
        }
        return count;
    }



    static boolean replaceNumber(int[] array, int replaceNumber, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == replaceNumber) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    static boolean replaceAllNumbers(int[] array, int replaceNumber, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == replaceNumber) {
                array[i] = newNumber;
            }
        }
        return true;
    }

    static int[] flipArray(int[] array) {
        int i = 0;
        int size = array.length;
        do {
            int b = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = b;
            i++;
        }
        while (i < size / 2);
        return array;
    }

}



