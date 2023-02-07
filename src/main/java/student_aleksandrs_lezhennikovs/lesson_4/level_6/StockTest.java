package student_aleksandrs_lezhennikovs.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.checkActualPriceUpdate();
        stockTest.checkUpdateCurrentPrice();
        stockTest.checkMaximumPrice();
    }

    void checkActualPriceUpdate() {
        double currentPrice = 100;

        Stock ms = new Stock("Micro Soft", 100);
        if (currentPrice == ms.actualPrice) {
            System.out.println("Actual price test initialization = OK");
        } else {
            System.out.println("Actual price test initialization = FAIL");
        }
    }

    void checkUpdateCurrentPrice() {
        double firstUpdate = 10;
        double secondUpdate = 12;
        double thirdUpdate = 7;
        double fourthUpdate = 5;
        double fifthUpdate = 99;
        double sixthUpdate = 77;

        Stock goog = new Stock("Google", 30);
        goog.updatePrice(10);
        if (firstUpdate == goog.actualPrice) {
            System.out.println("First price update test = OK");
        } else {
            System.out.println("First price update test = FAIL");
        }

        goog.updatePrice(12);
        if (secondUpdate == goog.actualPrice) {
            System.out.println("Second price update test = OK");
        } else {
            System.out.println("Second price update test = FAIL");
        }

        goog.updatePrice(7);
        if (thirdUpdate == goog.actualPrice) {
            System.out.println("Third price update test = OK");
        } else {
            System.out.println("Third price update test = FAIL");
        }

        goog.updatePrice(5);
        if (fourthUpdate == goog.actualPrice) {
            System.out.println("Fourth price update test = OK");
        } else {
            System.out.println("Fourth price update test = FAIL");
        }

        goog.updatePrice(99);
        if (fifthUpdate == goog.actualPrice) {
            System.out.println("Fifth price update test = OK");
        } else {
            System.out.println("Fifth price update test = FAIL");
        }

        goog.updatePrice(77);
        if (sixthUpdate == goog.actualPrice) {
            System.out.println("Sixth price update test = OK");
        } else {
            System.out.println("Sixth price update test = FAIL");
        }
    }

    void checkMaximumPrice() {
        double firstMaxUpdate = 999;
        double secondMaxUpdate = 1000;
        double thirdMaxUpdate = 27;

        Stock apple = new Stock("Apple", 500);
        apple.updatePrice(999);
        if (firstMaxUpdate == apple.maximumPrice) {
            System.out.println("First maximum price update = OK");
        } else {
            System.out.println("First maximum price update = FAIL");
        }

        apple.updatePrice(1);
        if (firstMaxUpdate == apple.maximumPrice) {
            System.out.println("Second maximum price update = OK");
        } else {
            System.out.println("Second maximum price update = FAIL");
        }

        apple.updatePrice(999);
        apple.updatePrice(2);
        apple.updatePrice(1000
        );
        if (secondMaxUpdate == apple.maximumPrice) {
            System.out.println("Third maximum price update = OK");
        } else {
            System.out.println("Third maximum price update = FAIL");
        }

        apple.updatePrice(999);
        apple.updatePrice(2);
        apple.updatePrice(1000);
        apple.updatePrice(8);

        if (secondMaxUpdate == apple.maximumPrice) {
            System.out.println("Fourth maximum price update = OK");
        } else {
            System.out.println("Fourth maximum price update = FAIL");
        }

        Stock amazon = new Stock("Amazon", 9);
        amazon.updatePrice(27);
        if (thirdMaxUpdate == amazon.maximumPrice) {
            System.out.println("Fifth maximum price update = OK");
        } else {
            System.out.println("Fifth maximum price update = FAIL");
        }
    }
}
