package student_oleg_gryazev.lesson_6._level_3.task_12;

public class ArrayService {


    boolean contains(int[] arr, int numberToSearch) {
        // boolean searchNumber = false;
        for (int element : arr)
            if (element == numberToSearch) {
                return true;
            }
        return false;
    }

    int countNumberOccurrences(int[] arr) {
        int numberOccurrences = 0;
        for (int arrayNumber : arr) {
            if (arrayNumber == 3) {
                numberOccurrences += 1;
            }
        }
        return numberOccurrences;
    }

    boolean replaceFirstNumberInArray(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;

    }

    int replaceAllSimilarNumbers(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;

            }
        }
        return newNumber;
    }
    void revert(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
        }
            }

        }



