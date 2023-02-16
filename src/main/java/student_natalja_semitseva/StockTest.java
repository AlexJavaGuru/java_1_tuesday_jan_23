package student_natalja_semitseva;

class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.testCurrantValue();
        test.testMaxValue();
        test.testMinValue();
        test.stockTest();
        test.testMaxPriceToInitialPrice();


    }

    public void stockTest() {
        Stock google = new Stock("Google", 10);
        google.getPriceInformation();
        google.updatePrice(15);
        google.getPriceInformation();
        google.updatePrice(7);
        google.getPriceInformation();
        google.updatePrice(14);
        google.getPriceInformation();


    }


    void testCurrantValue() {
        Stock test = new Stock("Google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentValue();
        checkResult("CurrentValue test  - ", expectedResult, actualResult);
    }

    void testMinValue() {
        Stock test = new Stock("Google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentValue();
        checkResult("MinValue  - ", expectedResult, actualResult);

    }

    void testMaxValue() {
        Stock test = new Stock("Google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int expectedResult = 77;
        int actualResult = test.getCurrentValue();
        checkResult("MaxValue  -", expectedResult, actualResult);
    }

    public void checkResult(String name, int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(name + expectedResult + " price  " + actualResult + " OK");
        } else {
            System.out.println(name + expectedResult + " price  " + actualResult + " FAIL");
        }
    }

    private void testMaxPriceToInitialPrice() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(1);
        int actualMaxPrice = stock.getMaxValue();
        int expectedMaxPrice = 999;

        checkResult("Google ", 999, 999);


    }
}


