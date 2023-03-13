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
        check(Arrays.equals(expectedResult, realResult), "arrayUtil");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.findMaxNumber(new int[]{3, 5, 8, 2, 8, 9});
        int expectResult = 9;
        check(realResult == expectResult, "maxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.findMinNumber(new int[]{3, 5, 8, 2, 8, 9});
        int expectResult = 2;
        check(realResult == expectResult,"minNumber");
    }

    public void check(boolean state, String nameMethod) {
        if(state){
            System.out.println(nameMethod + "= ok");
        } else {
            System.out.println(nameMethod + "= fail");
        }
    }
}

