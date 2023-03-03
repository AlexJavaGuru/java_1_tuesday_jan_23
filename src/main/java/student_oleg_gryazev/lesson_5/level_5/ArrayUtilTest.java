package student_oleg_gryazev.lesson_5.level_5;

import java.util.Arrays;

import static student_oleg_gryazev.lesson_5.level_5.ArrayUtil.findMaxInArray;
import static student_oleg_gryazev.lesson_5.level_5.ArrayUtil.findMinInArray;

class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(3);
        test.shouldCreateArray();
        test.shoulCreateRandomMassive();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] expectedResult = new int[3];
        int[] actualResult = arrayUtil.createArray(3);
        if (Arrays.equals(new int[]{expectedResult.length}, new int[]{actualResult.length})) {
            System.out.println("Expected result of lenght massive it is 3 and equal the actual result = "
                    + actualResult.length + ". Test is passed.");
        } else {
            System.out.println("Test !passed");
        }

    }

    public void shoulCreateRandomMassive() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomArray = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(randomArray);
        System.out.println("Random massive is created and = " + Arrays.toString(randomArray));
    }

    public void shouldFindMaxNumber() {


        int[] createArray = {2, 10, 11,};
        int expectedResult = 11;
        int maxNumber = findMaxInArray(createArray);
        if (maxNumber == expectedResult) {
            System.out.println("Max. massive number is = " + maxNumber + "Test is passed");
        } else {
            System.out.println("False Max number");
        }
    }

    public void shouldFindMinNumber() {
        int[] createArray = {2, -3, 11,};
        int expectedResult = -3;
        int minNumber = findMinInArray(createArray);
        if (minNumber == expectedResult) {
            System.out.println("Min. massive number is = " + minNumber + "Test is passed");
        } else {
            System.out.println("False Min number");
        }

    }
}




