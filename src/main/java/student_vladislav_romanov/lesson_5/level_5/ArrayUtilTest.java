package student_vladislav_romanov.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
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

}
