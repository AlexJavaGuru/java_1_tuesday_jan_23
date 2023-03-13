package student_ilya_tihonov.lesson_6.level_1;

public class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.checkEvenResult();
    }
    public boolean isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(9);
        boolean expectedResult = false;
        return realResult == expectedResult;
    }
    public void checkEvenResult() {
        if (isEvenTest()) {
            System.out.println("NumberUtils = ok");
        } else {
            System.out.println("NumberUtils = fail");
        }
    }
}
