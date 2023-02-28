package student_natalija_rasponomarjova.lesson_5.level_5;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.createArrayTest();
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
}


