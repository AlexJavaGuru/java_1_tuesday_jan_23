package student_aleksandrs_lezhennikovs.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceDemo {

    public static void main(String[] args) {

        int[] myArray = {2, 50, 5, 30, 24, 15, 24, 5, 24, 10, 5};
        int[] flipArray;
        ArrayService arrayService = new ArrayService();
        System.out.println("Initial array \n" + Arrays.toString(myArray));
        arrayService.replaceNumberInArray(myArray, 24, 777);
        System.out.println("Replace first number \n" + Arrays.toString(myArray));
        arrayService.replaceAllNumberInArray(myArray, 5, 555);
        System.out.println("Replace all number \n" + Arrays.toString(myArray));
        arrayService.flipArray(myArray);
        System.out.println("Flipped array \n" + Arrays.toString(myArray));
        arrayService.sortArray(myArray);
        System.out.println("Sorted Array \n" + Arrays.toString(myArray));
    }
}
