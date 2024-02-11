package student_oksana_maksimova.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {
        Stock google = new Stock( "GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
 /*   Написать тестовые сценарии для класса Stock в классе StockTest.

                            Что это такое, я не поняла..

        10 -> 12 -> 5 -> 7 -> 99 -> 77

        Test case max:

        Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
        Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
        Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
        Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
        Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27

         */