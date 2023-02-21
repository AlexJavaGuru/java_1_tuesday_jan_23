package student_andrejs_cekalins.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.maxStockPriceEqualToInitialPrice();
        test.maxStockPriceEqualToInitialPriceAfterUpdateOnLowerPrice();
        test.maxStockPriceUpdateOnLowerAndHigherPrice();
        test.maxStockPriceUpdateOnLowerThanHigherAndAgainLowerPrice();
        test.maxStockPriceHigherThanInitialPrice();
    }

    public void maxStockPriceEqualToInitialPrice() {
        Stock stock = new Stock("GOOG", 999);
        int expectedMaxPrice = 999;
        int result = stock.getMaxPrice();
        checkResult(result == expectedMaxPrice, "Max price test");
    }

    public void maxStockPriceEqualToInitialPriceAfterUpdateOnLowerPrice() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(1);
        int expectedMaxPrice = 999;
        int result = stock.getMaxPrice();
        checkResult(result == expectedMaxPrice, "Max price update on lower price test");
    }

    public void maxStockPriceUpdateOnLowerAndHigherPrice() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int expectedMaxPrice = 1000;
        int result = stock.getMaxPrice();
        checkResult(result == expectedMaxPrice, "Max price update on lower and higher price test");
    }

    public void maxStockPriceUpdateOnLowerThanHigherAndAgainLowerPrice() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int expectedMaxPrice = 1000;
        int result = stock.getMaxPrice();
        checkResult(result == expectedMaxPrice, "Max price update on lower, higher and again lower price test");
    }

    public void maxStockPriceHigherThanInitialPrice() {
        Stock stock = new Stock("GOOG", 9);
        stock.updatePrice(27);
        int expectedMaxPrice = 27;
        int result = stock.getMaxPrice();
        checkResult(result == expectedMaxPrice, "Max price higher than initial price test");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
