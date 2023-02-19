package student_oksana_tarasova.lesson_5.level_5;

import java.util.Arrays;


class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] realResult = arrayUtil.createArray(8);
        int[] expectedResult = new int[8];
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("ArrayUtil = OK");
        } else {
            System.out.println("ArrayUtil = Fail");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.findMaxNumber(new int[]{3, 5, 8, 2, 8, 9});
        int expectResult = 9;
        if (realResult == expectResult) {
            System.out.println("maxNumber = ok");
        } else {
            System.out.println("maxNumber = fail");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.findMinNumber(new int[]{3, 5, 8, 2, 8, 9});
        int expectResult = 2;
        if (realResult == expectResult) {
            System.out.println("minNumber = ok");
        } else {
            System.out.println("minNumber = fail");
        }
    }
}

