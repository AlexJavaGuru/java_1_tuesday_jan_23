package student_nikita_visnakovs.lesson_4.level_6;

public class StockTest {

    public static void main(String[] args) {
        StockTest test = new StockTest();

        test.testCurrantPrice();
        test.testMaxPrice();
        test.testMinPrice();

    }

    void testCurrantPrice() {
        Stock test = new Stock("Google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentPrice();
        checkResult(expectedResult, actualResult, "CurrantPrice test");
    }

    void testMaxPrice() {
        Stock test = new Stock("Google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentPrice();
        checkResult(expectedResult, actualResult, "MaxPrice test");
    }

    void testMinPrice() {
        Stock test = new Stock("Google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentPrice();
        checkResult(expectedResult, actualResult, "MinPrice test");
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " ,but real result is " + actualResult);
        }
    }
}