package student_oksana_tarasova.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.calculateArrayLengthTest();
        test.copyInRangeTest();
    }

    public void calculateArrayLengthTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] in = {2, 4, 3, 6, 3, 5, 2, 4, 3, 7, 3, 5};
        int expectedResult = 10;
        int realResult = arrayCopy.calculateArrayLength(in, 1, 5);
        check(realResult == expectedResult, "Length array");
    }

    public void copyInRangeTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] in = {2, 4, 3, 6, 3, 5, 2, 4, 3, 7, 3, 5};
        int[] expectedResult = {2, 4, 3, 3, 5, 2, 4, 3, 3, 5};
        int[] realResult = arrayCopy.copyInRange(in, 1, 5);
        check(Arrays.equals(realResult, expectedResult), "copy in Range");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}


