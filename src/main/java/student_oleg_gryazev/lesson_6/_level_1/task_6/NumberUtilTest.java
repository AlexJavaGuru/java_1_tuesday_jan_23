package student_oleg_gryazev.lesson_6._level_1.task_6;

public class NumberUtilTest {

    public static void main(String[] args){
        NumberUtilTest test = new NumberUtilTest();
        test.isEvenTrueTest();
        test.isEvenFalse();
    }

    void isEvenTrueTest() {
        NumberUtil numberUtil = new NumberUtil();

        boolean expectedResultEven = true;
        boolean actualResult = numberUtil.isEven(10);

        if (expectedResultEven == actualResult) {
            System.out.println("Test is passed, the number is even.");
        } else {
            System.out.println("Test is failed!");
            System.out.println("Expected result " + expectedResultEven + ", actual result " + actualResult);
        }
    }

    void isEvenFalse() {
        NumberUtil numberUtil = new NumberUtil();

        boolean expectedResultOdd = false;
        boolean actualResult = numberUtil.isEven(11);

        if (expectedResultOdd == actualResult) {
            System.out.println("Test is passed, the number is odd.");
        } else {
            System.out.println("Test is failed!");
        }
    }

}

