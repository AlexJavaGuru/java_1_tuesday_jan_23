package student_natalja_semitseva.level_3;


import java.util.Arrays;
import java.util.Random;

public class ArrayService {


    boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int value : arr) {

            if (value == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    void revert(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int[] x = array;
            int temp = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - i - 1] = temp;

        }
    }

    void sort(int[] array) {


        int temp = 0;
        boolean isSorted = false;
        while (!isSorted == true) {

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = true;
                    temp = array[i];
                    array[i] = temp;

                }
            }
        }
    }


}

//array[i]) <array[i + 1]







