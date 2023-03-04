package student_anastasiia_bokareva.lesson4.level6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testCurrentPrice();
        stockTest.testMinPrice();
        stockTest.testMaxPrice();
        stockTest.testMaxPrice2();
        stockTest.testMaxPrice3();
        stockTest.testMaxPrice4();

    }

    public void checkPrice(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName+" - Test passed!");
        } else {
            System.out.println(testName+" - Test Failed!");
        }

    }
    public void testCurrentPrice() {
        Stock test = new Stock("google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int realResult = test.getCurrentPrice();
        ;
        int expectedResult = 77;
        checkPrice(expectedResult, realResult, "Test Current Price");
    }
    public void testMinPrice(){
        Stock test = new Stock("google", 10);
        test.updatePrice(12);
        test.updatePrice(5);
        test.updatePrice(7);
        test.updatePrice(99);
        test.updatePrice(77);
        int realResult = test.getMinPrice();
        ;
        int expectedResult = 5;
        checkPrice(expectedResult, realResult, "Test Min Price");
    }
    public void testMaxPrice() {
        Stock test = new Stock("google", 10);
        test.updatePrice(999);
        int realResult = test.maxPrice;
        int expectedResult = 999;
        checkPrice(expectedResult, realResult, "Test Max Price");
    }
    public void testMaxPrice2() {
        Stock test = new Stock("google", 10);
        test.updatePrice(999);
        test.updatePrice(2);
        test.updatePrice(1000);
        test.updatePrice(8);
        int realResult = test.getMaxPrice();
        int expectedResult = 1000;
        checkPrice(expectedResult, realResult, "Test Max Price 2");
    }
    public void testMaxPrice3() {
        Stock test = new Stock("google", 10);
        test.updatePrice(999);
        test.updatePrice(2);
        test.updatePrice(1000);
        int realResult = test.getMaxPrice();
        int expectedResult = 1000;
        checkPrice(expectedResult, realResult, "Test Max Price 3");
    }
    public void testMaxPrice4() {
        Stock test = new Stock("google", 10);
        test.updatePrice(999);
        test.updatePrice(1);
        int realResult = test.getMaxPrice();
        int expectedResult = 999;
        checkPrice(expectedResult, realResult, "Test Max Price 4");
    }
}

