package student_romualds_leitans.lesson_6.level_1;

public class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        int number = 8;
        boolean result = numberUtils.isEven(number);
        if (result) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Fail");
        }


    }

}