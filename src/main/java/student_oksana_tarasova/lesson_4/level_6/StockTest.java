package student_oksana_tarasova.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {
        testMaxPriceIsEqualToInitialPrice();
        testMaxPriceIsEqualToInitialPriceAfterUpdateOnLowerPrice();
        testMaxPriceIsUpdated();
        testMinPriceIsInitialPrice();
        testMinPriceIsUpdated();
    }

    static void testMaxPriceIsEqualToInitialPrice() {
        Stock stock = new Stock("Maxima", 999);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 999;

        check("Maxima", "Initializing", actualMaxPrice, expectedMaxPrice);
    }

    static void testMaxPriceIsEqualToInitialPriceAfterUpdateOnLowerPrice() {
        Stock stock = new Stock("Maxima", 999);
        stock.updatePrice(960);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 999;

        check("Maxima", "Updating to lower price", actualMaxPrice, expectedMaxPrice);
    }

    static void testMaxPriceIsUpdated() {
        Stock stock = new Stock("Maxima", 999);
        stock.updatePrice(1000);
        int actualMaxPrice = stock.getMaxPrice();
        int expectedMaxPrice = 1000;

        check("Maxima", "Updating to 1 000", actualMaxPrice, expectedMaxPrice);
    }
    static void testMinPriceIsInitialPrice() {
        Stock stock = new Stock("Maxima", 940);
        int actualMinPrice = stock.getMinPrice();
        int expectedMinPrice = 940;
        check("Maxima", "Initializing", actualMinPrice, expectedMinPrice);
    }

    static void testMinPriceIsUpdated() {
        Stock stock = new Stock("Maxima", 940);
        stock.updatePrice(930);
        int actualMinPrice = stock.getMinPrice();
        int expectedMinPrice = 930;

        check("Maxima", "Updating to 930", actualMinPrice, expectedMinPrice);
    }

    static void check(String companyName, String actionCheck, int objectPrice, int expectedPrice) {
        if (objectPrice == expectedPrice) {
            System.out.println(companyName + " " + actionCheck + "; price " + objectPrice + " = OK");
        } else {
            System.out.println(companyName + " " + actionCheck + "; price " + objectPrice + " = FAIL");
        }
    }
}
