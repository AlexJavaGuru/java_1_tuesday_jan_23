package student_natalija_rasponomarjova.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {
    boolean contains(int[] numbers, int numberToSearch) {
        for (int number : numbers) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] numbers, int numberToSearch) {
        int counter = 0;
        for (int number : numbers) {
            if (number == numberToSearch) {
                counter++;
            }
        }
        return counter;
    }

    boolean replaceFirst(int[] numbers, int numberToReplace, int newNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToReplace) {
                numbers[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] numbers, int numberToReplace, int newNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToReplace) {
                numbers[i] = newNumber;
            }
        }
        return newNumber;
    }

    void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Array after reverse: " + Arrays.toString(numbers));
    }

    void sortArray(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
