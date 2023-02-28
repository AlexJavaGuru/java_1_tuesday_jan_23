package student_vladislav_romanov.lesson_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expectedLength = 7;
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(7);
        int currentLength = array.length;

        if (currentLength == expectedLength) {
            System.out.println("createArray method test SUCCEED!");
        } else {
            System.out.println("createArray method test FAILED! Expected length " + expectedLength + ", but in fact " + currentLength);
        }
    }

    public void shouldFindMaxNumber() {
        int expectedMaxNumber = 44;
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = {3, 18, 44, 35, 39, 22, 11, 3, 4, 43};

        int currentMaxNumber = arrayUtil.findMaxNumber(array);

        if (currentMaxNumber == expectedMaxNumber) {
            System.out.println("findMaxNumber method test SUCCEED!");
        } else {
            System.out.println("findMaxNumber method test FAILED! Expected " + expectedMaxNumber + ", but in fact " + currentMaxNumber);
        }
    }

    public void shouldFindMinNumber() {
        int expectedMinNumber = 11;
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = {14, 94, 19, 74, 11, 58, 87, 62, 50, 85};

        int currentMinNumber = arrayUtil.findMinNumber(array);

        if (currentMinNumber == expectedMinNumber) {
            System.out.println("findMinNumber method test SUCCEED!");
        } else {
            System.out.println("findMinNumber method test FAILED! Expected " + expectedMinNumber + ", but in fact " + currentMinNumber);
        }
    }

}
