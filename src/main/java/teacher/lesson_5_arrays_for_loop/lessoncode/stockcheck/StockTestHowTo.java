package teacher.lesson_5_arrays_for_loop.lessoncode.stockcheck;

public class StockTestHowTo {

    /*
    10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
     */

    public static void main(String[] args) {
        testMaxPriceIsEqualToInitialPrice();
        testMaxPriceIsEqualToInitialPriceAfterUpdateOnLowerPrice();
        testMaxPriceIsUpdated();
    }

    private static void testMaxPriceIsEqualToInitialPrice() {
        Stock stock = new Stock("Google", 999);
        double actualMaxPrice = stock.getMaximumPrice();
        double expectedMaxPrice = 999;

        check("Google", "Initializing", actualMaxPrice, expectedMaxPrice);
    }

    private static void testMaxPriceIsEqualToInitialPriceAfterUpdateOnLowerPrice() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(1);
        double actualMaxPrice = stock.getMaximumPrice();
        double expectedMaxPrice = 999;

        check("Google", "Updating to lower price", actualMaxPrice, expectedMaxPrice);
    }

    private static void testMaxPriceIsUpdated() {
        Stock stock = new Stock("Google", 999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        double actualMaxPrice = stock.getMaximumPrice();
        double expectedMaxPrice = 1000;

        check("Google", "Updating from 2 to 1 000", actualMaxPrice, expectedMaxPrice);
    }

    private static void check(String companyName, String actionCheck, double objectPrice, double expectedPrice) {
        if (objectPrice == expectedPrice) {
            System.out.println(companyName + " " + actionCheck + "; price " + objectPrice + " = OK");
        } else {
            System.out.println(companyName + " " + actionCheck + "; price " + objectPrice + " = FAIL");
        }
    }
}
