package student_aleksandrs_lezhennikovs.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        ArrayUtil checkArray = new ArrayUtil();
        int[] arrayUtil = checkArray.createArray(7);

        int expectedArraySize = 7;
        int actualArraySize = arrayUtil.length;

        if (expectedArraySize == actualArraySize) {
            System.out.println("Test array size is OK");
        } else {
            System.out.println("Test array size is Fail");
        }
    }

    public void shouldFindMaxNumber() {

        ArrayUtil checkArray = new ArrayUtil();
        int[] arrayUtil = checkArray.createArray(4);
        arrayUtil[0] = -10;
        arrayUtil[1] = 0;
        arrayUtil[2] = 700;
        arrayUtil[3] = 700;

        int expectedMax = 700;
        int calculatedMax = checkArray.findMaxNumber(arrayUtil);

        if (expectedMax == calculatedMax) {
            System.out.println("Max in array test is OK");
        } else {
            System.out.println("Max in  array test is Fail");
        }
    }

    public void shouldFindMinNumber() {

        ArrayUtil checkArray = new ArrayUtil();
        int[] arrayUtil = checkArray.createArray(4);
        arrayUtil[0] = -10;
        arrayUtil[1] = 0;
        arrayUtil[2] = 700;
        arrayUtil[3] = 700;

        int expectedMin = -10;
        int calculatedMin = checkArray.findMinNumber(arrayUtil);

        if (expectedMin == calculatedMin) {
            System.out.println("Min in array test is OK");
        } else {
            System.out.println("Min in  array test is Fail");
        }
    }
}
