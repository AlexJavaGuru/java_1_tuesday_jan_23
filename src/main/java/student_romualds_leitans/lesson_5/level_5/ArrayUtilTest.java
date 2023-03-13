package student_romualds_leitans.lesson_5.level_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil test = new ArrayUtil();
        int[] array = test.createArray(10);
        if (array.length != 10) {
            System.out.println("Error: array length is not 5");
        } else {
            System.out.println("Array created successfully");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil test = new ArrayUtil();

        int[] array = {1, 2, 3, 4, 5, 6};
        int maxNumber = test.findMaxNumber(array);
        int expectedMaxNumber = 6;
        if (maxNumber == expectedMaxNumber) {
            System.out.println("Max number test OK");
        } else {
            System.out.println("Max number test FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] array = {9, 3, 5, 1, 8, 2};
        int minNumber = test.findMinNumber(array);
        int expectedMinNumber = 3;
        if (minNumber == expectedMinNumber) {
            System.out.println("Min number test OK");
        } else {
            System.out.println("Min number test FAIL");
        }
    }
}