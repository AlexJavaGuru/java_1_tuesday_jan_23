package student_vladislav_romanov.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {
        stockTest();
    }

    static void stockTest() {
        Stock google = new Stock("GOOG", 10);

        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        int expectedCurrentPrice = 77;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 99;

        int actualCurrentPrice = google.currentPrice;
        int actualMinPrice = google.minPrice;
        int actualMaxPrice = google.maxPrice;

        if (actualCurrentPrice == expectedCurrentPrice) {
            System.out.println("Current price test PASSED");
        } else {
            System.out.println("Current price test FAILED");
        }

        if (actualMinPrice == expectedMinPrice) {
            System.out.println("Min price test PASSED");
        } else {
            System.out.println("Min price test FAILED");
        }

        if (actualMaxPrice == expectedMaxPrice) {
            System.out.println("Max price test PASSED");
        } else {
            System.out.println("Max price test FAILED");
        }
    }

}
