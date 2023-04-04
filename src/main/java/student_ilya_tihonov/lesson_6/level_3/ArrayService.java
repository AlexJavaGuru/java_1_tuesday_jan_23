package student_ilya_tihonov.lesson_6.level_3;

public class ArrayService {

    public boolean containsNumber(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public int countOccurrences(int[] array, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                count++;
            }
        }

        return count;
    }

    public void replaceFirst(int[] array, int oldNumber, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldNumber) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public void reverse(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            int temp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
    public void sortingNumbers(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}
