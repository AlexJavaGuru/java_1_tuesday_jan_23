package student_nikita_visnakovs.lesson_6.level_3;

public class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean changeFirst(int[] arr, int searchNumber, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int changeAll(int[] arr, int numberToChange, int newNumber) {
        int changeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToChange) {
                arr[i] = newNumber;
                changeCount++;
            }
        }
        return changeCount;
    }

    void reverts(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(arr.length - 1) - i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    void sortAscending  (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
