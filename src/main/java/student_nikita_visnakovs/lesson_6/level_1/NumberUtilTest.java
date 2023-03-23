package student_nikita_visnakovs.lesson_6.level_1;

public class NumberUtilTest {

    public static void main(String[] args) {

        NumberUtilTest tester = new NumberUtilTest();
        tester.testIsEven();
    }

    public void testIsEven() {
        int even = 100;
        NumberUtil subject = new NumberUtil();
        boolean actualResult = subject.isEven(even);
        checkResult(actualResult , "Is even test");
    }

    void checkResult(boolean actualResult , String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has filed!");
        }

    }
}
