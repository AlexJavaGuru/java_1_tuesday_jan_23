package student_julija_raudive.lesson_5.level_5;



class ArrayUtilTest {
    ArrayUtil arr = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();


    }

    public void shouldCreateArray() {

        int lengthOfArray = 5;
        int[] array = arr.createArray(lengthOfArray);

        checkResults(lengthOfArray == array.length, "Array length test");

    }


    public void shouldFindMaxNumber() {

        int[] array = {1, 50, 6, 36, 8, 12};
        int max = arr.findMaxNumber(array);
        int result = 50;

        checkResults(max == result, "Find Max number test");

    }

    public void shouldFindMinNumber() {
        int[] array = {17, 50, 1, 36, 8, 12};
        int min = arr.findMinNumber(array);
        int result = 1;

        checkResults(min == result, "Find Min number test");

    }

    void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {

            System.out.println("OK");

        } else {
            System.out.println("FAIL");
        }

    }

}
