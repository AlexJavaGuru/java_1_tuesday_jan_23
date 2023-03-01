package student_oksana_tarasova.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        int[] arrayDemo = {1, 2, 2, 4, 5, 2, 7, 5, 9, 10};
        System.out.println(Arrays.toString(arrayDemo));
        ArrayService.flipArray(arrayDemo);
        System.out.println(Arrays.toString(arrayDemo));
        ArrayService.replaceNumber(arrayDemo, 5, 25);
        System.out.println(Arrays.toString(arrayDemo));
        ArrayService.replaceAllNumbers(arrayDemo, 2, 33);
        System.out.println(Arrays.toString(arrayDemo));
        System.out.println("Number 33 occurs " + ArrayService.countOccurrences(arrayDemo, 33) + " times in the array");
    }
}

