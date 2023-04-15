package student_konstantin_kudrjavtsev.lesson_6.level_1_intern;


public class NumberUtilsTest {
    public static void main(String[] args) {

        testNumberUtils();

    }

        private static void testNumberUtils() {
            NumberUtils numberUtils = new NumberUtils();
            int number = 8;
            boolean actualResult = numberUtils.isEven(number);
            if (actualResult) {
                System.out.println("Test isEven: " + "Test has passed");
            } else {
                System.out.println("Test isEven: " + "Test failed");
            }
    }
}