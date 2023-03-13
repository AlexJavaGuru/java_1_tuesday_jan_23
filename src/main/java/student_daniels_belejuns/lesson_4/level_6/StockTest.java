package student_daniels_belejuns.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {

        StockTest cola = new StockTest();
        cola.maxStocktest();
        cola.minStocktest();
        cola.currentStocktest();

    }

    public void maxStocktest() {

        Stock cocaCola = new Stock("Coca cola", 10);

        System.out.println(cocaCola.getPriceInformation());

        cocaCola.updatePrice(12);
        checkResults(cocaCola.maxPrice == 12, "Max price test 1");

        cocaCola.updatePrice(5);
        checkResults(cocaCola.maxPrice == 12, "Max price test 2");

        cocaCola.updatePrice(7);
        checkResults(cocaCola.maxPrice == 12, "Max price test 3");

        cocaCola.updatePrice(99);
        checkResults(cocaCola.maxPrice == 99, "Max price test 4");

        cocaCola.updatePrice(77);
        checkResults(cocaCola.maxPrice == 99, "Max price test 5");

        System.out.println(cocaCola.getPriceInformation());
    }

    public void minStocktest() {

        Stock cocaCola = new Stock("Coca cola", 10);

        System.out.println(cocaCola.getPriceInformation());

        cocaCola.updatePrice(12);
        checkResults(cocaCola.minPrice == 10, "Min price test 1");

        cocaCola.updatePrice(5);
        checkResults(cocaCola.minPrice == 5, "Min price test 2");

        cocaCola.updatePrice(7);
        checkResults(cocaCola.minPrice == 5, "Min price test 3");

        cocaCola.updatePrice(99);
        checkResults(cocaCola.minPrice == 5, "Min price test 4");

        cocaCola.updatePrice(77);
        checkResults(cocaCola.minPrice == 5, "Min price test 5");

        System.out.println(cocaCola.getPriceInformation());
    }

    public void currentStocktest() {

        Stock cocaCola = new Stock("Coca cola", 10);

        System.out.println(cocaCola.getPriceInformation());

        cocaCola.updatePrice(12);
        checkResults(cocaCola.currentPrice == 12, "Current price test 1");

        cocaCola.updatePrice(5);
        checkResults(cocaCola.currentPrice == 5, "Current price test 2");

        cocaCola.updatePrice(7);
        checkResults(cocaCola.currentPrice == 7, "Current price test 3");

        cocaCola.updatePrice(99);
        checkResults(cocaCola.currentPrice == 99, "Current price test 4");

        cocaCola.updatePrice(77);
        checkResults(cocaCola.currentPrice == 77, "Current price test 5");

        System.out.println(cocaCola.getPriceInformation());

    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
