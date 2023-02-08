package student_aleksandrs_lezhennikovs.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {

        checkActualPriceUpdate();
        checkUpdateCurrentPrice();
        checkMaxMinPrice();
    }

    static void checkActualPriceUpdate() {
        double currentPrice = 100;

        Stock ms = new Stock("Micro Soft", 100);
        check(ms.name, " Actual price test initialization", ms.actualPrice, currentPrice);
    }

    static void checkUpdateCurrentPrice() {
        double firstUpdate = 10;
        double secondUpdate = 12;
        double thirdUpdate = 5;
        double fourthUpdate = 7;
        double fifthUpdate = 99;
        double sixthUpdate = 77;

        Stock goog = new Stock("Google", 30);
        goog.updatePrice(10);
        check(goog.name, " First actual price update", goog.actualPrice, firstUpdate);
        check(goog.name, " Minimum price check 1", goog.minimumPrice, 10);
        check(goog.name, " MAX price check 1", goog.maximumPrice, 30);

        goog.updatePrice(12);
        check(goog.name, " Second actual price update", goog.actualPrice, secondUpdate);
        check(goog.name, " Minimum price check 2", goog.minimumPrice, 10);
        check(goog.name, " MAX price check 2", goog.maximumPrice, 30);

        goog.updatePrice(5);
        check(goog.name, " Third actual price update", goog.actualPrice, thirdUpdate);
        check(goog.name, " Minimum price check 3", goog.minimumPrice, 5);
        check(goog.name, " MAX price check 3", goog.maximumPrice, 30);

        goog.updatePrice(7);
        check(goog.name, " Fourth actual price update", goog.actualPrice, fourthUpdate);
        check(goog.name, " Minimum price check 4", goog.minimumPrice, 5);
        check(goog.name, " MAX price check 4", goog.maximumPrice, 30);

        goog.updatePrice(99);
        check(goog.name, " Fifth actual price update", goog.actualPrice, fifthUpdate);
        check(goog.name, " Minimum price check 5", goog.minimumPrice, 5);
        check(goog.name, " MAX price check 5", goog.maximumPrice, 99);

        goog.updatePrice(77);
        check(goog.name, " Sixth actual price update", goog.actualPrice, sixthUpdate);
        check(goog.name, " Minimum price check 6", goog.minimumPrice, 5);
        check(goog.name, " MAX price check 5", goog.maximumPrice, 99);
    }

    static void checkMaxMinPrice() {
        double firstExpectedMaxPrice = 999;
        double secondExpectedMaxPrice = 1000;
        double thirdExpectedMaxPrice = 27;

        Stock apple = new Stock("Apple", 500);
        apple.updatePrice(999);
        check(apple.name, " 500 -> 999 ", apple.maximumPrice, firstExpectedMaxPrice);
        check(apple.name," Minimum price initialization", apple.minimumPrice, 500);

        apple.updatePrice(1);
        check(apple.name," 999 -> 1", apple.maximumPrice, firstExpectedMaxPrice);
        check(apple.name," Minimum price update", apple.minimumPrice, 1);

        apple.updatePrice(999);
        apple.updatePrice(2);
        apple.updatePrice(1000);
        check(apple.name," 1 -> 999 -> 2 -> 1000", apple.maximumPrice, secondExpectedMaxPrice);
        check(apple.name," Minimum price check", apple.minimumPrice, 1);

        apple.updatePrice(999);
        apple.updatePrice(2);
        apple.updatePrice(1000);
        apple.updatePrice(8);
        check(apple.name," 1000 -> 999 -> 2 -> 1000 -> 8", apple.maximumPrice, secondExpectedMaxPrice);
        check(apple.name," Minimum price check 2", apple.minimumPrice, 1);

        Stock amazon = new Stock("Amazon", 9);
        amazon.updatePrice(27);
        check(amazon.name, " 9 -> 27", amazon.maximumPrice, thirdExpectedMaxPrice);
        check(amazon.name," Minimum price check",amazon.minimumPrice, 9);
    }

    private static void check(String companyName, String actionCheck, double objectPrice, double expectedPrice) {
        if (objectPrice == expectedPrice) {
            System.out.println(companyName + actionCheck + "; price " + objectPrice + " = OK");
        } else {
            System.out.println(companyName + actionCheck + "; price " + objectPrice + " = FAIL");
        }
    }
}
