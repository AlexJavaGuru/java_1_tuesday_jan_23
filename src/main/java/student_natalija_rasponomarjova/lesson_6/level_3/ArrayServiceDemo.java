package student_natalija_rasponomarjova.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] numbers = new int[]{2, 4, 6, 89, 3, 90, 23, 90, 45, 87, 90};
        System.out.println("The array contains required number - " +
                arrayService.contains(numbers, 45));
        System.out.println("The number occurs:" + " " +
                arrayService.countOccurrences(numbers, 90) + " " + "times");
        arrayService.reverseArray(numbers);

        System.out.println(arrayService.replaceFirst(numbers, 2, 5));
        System.out.println(Arrays.toString(numbers));

        System.out.println(arrayService.replaceAll(numbers, 90, 95));
        System.out.println(Arrays.toString(numbers));

        arrayService.sortArray(numbers);


    }
}
