package student_romualds_leitans.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        testMaxPriceIsEqualToInitialPriceAfterUpdateLowerPrice();
        testMaxPriceUpdated();
        testMaxPriceIsEqualToInitialPrice();
        testMaxPriceIsEqualToInitialPrice2();
        testMaxPriceUpdated2();

    }

    private static void testMaxPriceIsEqualToInitialPriceAfterUpdateLowerPrice() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(1);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 999;

        check("Ģoog", actualMaxPrice, expectedMaxPrice);
    }

    private static void testMaxPriceUpdated() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(1);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 999;

        check("Ģoog", actualMaxPrice, expectedMaxPrice);
    }

    private static void testMaxPriceIsEqualToInitialPrice() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(8);
        stock.updatePrice(1000);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 1000;

        check("Ģoog", actualMaxPrice, expectedMaxPrice);
    }

    private static void testMaxPriceUpdated2() {
        Stock stock = new Stock("GOOG", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 1000;

        check("Ģoog", actualMaxPrice, expectedMaxPrice);
    }
    private static void testMaxPriceIsEqualToInitialPrice2() {
        Stock stock = new Stock("GOOG", 27);
        stock.updatePrice(9);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 27;

        check("Ģoog", actualMaxPrice, expectedMaxPrice);
    }


    private static void check(String companyName, int objectPrice, int expectedPrice) {
        if (objectPrice == expectedPrice) {
            System.out.println(companyName + ": price " + objectPrice + " = OK");
        } else {
            System.out.println(companyName + ": price " + objectPrice + " = FAIL");
        }

    }
}
