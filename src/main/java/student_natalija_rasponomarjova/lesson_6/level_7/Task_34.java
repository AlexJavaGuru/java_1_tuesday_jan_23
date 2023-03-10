package student_natalija_rasponomarjova.lesson_6.level_7;

import java.util.Arrays;

class Task_34 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1, 5, 6, 789, -500, 43, 8, 9, 7, 11};
        sortArray(numbers);
        printArray(numbers);

       Arrays.sort(numbers);
       printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
    }
}

