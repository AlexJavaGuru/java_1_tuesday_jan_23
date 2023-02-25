package student_natalja_semitseva.lesson_5_level_5_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest util = new ArrayUtilTest();
        ArrayUtilTest.shouldCreateArray();
        ArrayUtilTest.shouldFindMaxNumber();
        ArrayUtilTest.shouldFindMinNumberTest();


    }


    public static void shouldCreateArray() {
        ArrayUtilTest utilArray = new ArrayUtilTest();
        int[] intArray = {10, 20, 3};
        if (intArray == intArray) {
            System.out.println("CreateArrayTest -  OK");
        } else {

            System.out.println("CreateArrayTest -  FAILED");
        }
    }

    public static void shouldFindMaxNumber() {

        ArrayUtilTest util = new ArrayUtilTest();
        int[] max = {10, 20, 30, 40};
        int realResult = max.length;
        if (realResult == max.length) {
            System.out.println("FindMaxNumberTest -  OK");
        } else {
            System.out.println("FindMaxNumberTest -  FAILED");
        }

    }


    public static void shouldFindMinNumberTest() {

        ArrayUtil newUtil = new ArrayUtil();
        int[] min = {10, 20, 30};
        int realResult = min.length;
        if (realResult == min.length) {
            System.out.println("MinTest -  OK");
        } else {

            System.out.println("MinTest -  FAILED");
        }

    }

}