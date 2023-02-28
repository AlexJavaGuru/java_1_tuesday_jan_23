package student_natalija_rasponomarjova.lesson_5.level_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.createArrayTest();
        arrayUtilTest.findMaxNumberTest();
        arrayUtilTest.findMinNumberTest();
    }

    public void createArrayTest() {
        ArrayUtil testArray = new ArrayUtil();
        int[] newArray = testArray.createArray(10);
        int actualArraySize = newArray.length;
        if (actualArraySize == 10) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void findMaxNumberTest() {
        ArrayUtil testArray = new ArrayUtil();
        int[] newArray = {2, 56, 67, 500, -7, 0};
        int calculatedMax = testArray.findMaxNumber(newArray);
        if (calculatedMax == 500) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void findMinNumberTest() {
        ArrayUtil testArray = new ArrayUtil();
        int[] newArray = {4, 67, 8, 400, -3, 0, 100};
        int calculatedMin = testArray.findMinNumber(newArray);
        if (calculatedMin == -3) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }
}
