package student_natalja_semitseva;

public class StockTest {
        public static void main(String[] args) {
        StockTest test = new StockTest();
       test.testCurrantValue();
       test.testMaxValue();
       test.testMinValue();
       test.StockTest();


    }
    public void StockTest() {
    Stock google = new Stock("Google",10);
    google.getPriceInformation();

    google.updatePrice(15);
    google.getPriceInformation();
    google.updatePrice(7);
    google.getPriceInformation();
    google.updatePrice(14);
    google.getPriceInformation();



    }


    void testCurrantValue() {
        Stock test = new Stock("GOOG", 10);
        test.updatePrice(12);
        test.updatePrice( 5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentValue();
        checkResult(expectedResult, actualResult,"CurrentValue test");
    }

    void testMinValue() {
        Stock test = new Stock("GOOG", 10);
        test.updatePrice(12);
        test.updatePrice( 5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentValue();
        checkResult(expectedResult, actualResult,"MinValue");

    }

    void testMaxValue() {
        Stock test = new Stock("GOOG", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentValue();
        checkResult(expectedResult, actualResult, "MaxValue");
    }

    public void checkResult(int  expectedResult, int actualResult, String name) {
        if (expectedResult == actualResult) {
            System.out.println(name + " has passed!");
        } else {
            System.out.println(name + " failed!");
            System.out.println("Expected result" + expectedResult + ", but real result is " + actualResult);
        }
    }
}

