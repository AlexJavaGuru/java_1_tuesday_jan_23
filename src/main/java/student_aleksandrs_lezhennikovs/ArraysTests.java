package student_aleksandrs_lezhennikovs;

import java.util.Arrays;

public class ArraysTests {
    public static void main(String[] args) {
        int[] arrayOfInt = {3, 7, 1, 9, 4, 6, 5, 7};

        System.out.println("Element of array: " + arrayOfInt[4]);
        Arrays.sort(arrayOfInt);
        System.out.println("Sorted array: " + Arrays.toString(arrayOfInt));
        System.out.println("Element of array: " + arrayOfInt[4]);

    }
}
