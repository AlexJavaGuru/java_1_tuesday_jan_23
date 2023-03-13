package student_dmitry_kupcus.lesson_6;


import java.util.Arrays;

class ArrayService {
    boolean contains(int[] arr, int searchNumber) {
        for (int j : arr) {
            if (j == searchNumber) {
                return true;
            }
        }
        return false;
    }

    public int howMuchContains(int[] arr, int searchNumber) {
        int i = 0;
        for (int number : arr) {
            if (number == searchNumber) {
                i++;
            }
        }
        return i;
    }

    boolean changeFirstNumberInArray(int[] arr, int changeNumber, int changeNumberTo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == changeNumber) {
                arr[i] = changeNumberTo;
                return true;
            }
        }
        return false;
    }

    int replaceAllNumberInArray(int[] arr, int changeNumbers, int changeNumbersTo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == changeNumbers) {
                arr[i] = changeNumbersTo;
            }
        }
        return changeNumbers;
    }

    void revertArray(int[] arr) { // need check
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    void sortArrays(int[] arr) {
        Arrays.sort(arr);
    }
}