package student_julija_raudive.lesson_6.level_3;


import java.util.Arrays;

class ArrayService {

    public boolean contains(int[] arr, int number) {

        boolean result = false;

        for (int value : arr) {

            if (value == number) {
                result = true;
                break;
            }
        }

        return result;

    }

    public int countOccurrences(int[] arr, int number) {

        int counter = 0;
        for (int value : arr) {

            if (value == number) {
                counter++;
            }
        }
        return counter;
    }

    public boolean replaceNumber(int[] arr, int numberToReplace, int newNumber) {
        boolean isReplaced = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                isReplaced = true;
                break;
            }
        }
        return isReplaced;

    }

    public int replaceAllNumbers(int[] arr, int numberToReplace, int newNumber) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                counter++;
            }
        }
        return counter;

    }

    void reverse(int[] arr) {

        for (int i =0; i<arr.length/2; i++){

            int value = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = value;

        }

    }

    void sort(int[] arr){

        Arrays.sort(arr);

    }

}
