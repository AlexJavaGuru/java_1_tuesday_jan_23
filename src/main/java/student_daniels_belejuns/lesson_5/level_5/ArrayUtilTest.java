package student_daniels_belejuns.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil testArray = new ArrayUtil();
        int[] newArray = testArray.createArray(15);
        int actualArraySize = newArray.length;
        if (actualArraySize == 15) {
            System.out.println("Succes");
        } else {
            System.out.println("Failed");
        }
    }

}
