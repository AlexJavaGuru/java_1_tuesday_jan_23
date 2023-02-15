package student_natalija_rasponomarjova.lesson_4.level_6;
/*Написать тестовые сценарии для класса Stock в классе StockTest.
10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27


Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
String priceInformation = google.getPriceInformation();
System.out.println(priceInformation);
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
priceInformation = google.getPriceInformation();
System.out.println(priceInformation);

После выполнения кода вывод в консоли должет быть следующим:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15*/

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testMaxValue();

    }

    public void testMaxValue() {

        Stock tesla = new Stock("TESLA", 999);
        System.out.println(tesla.getPriceInformation());

        tesla.updateValue(12);
        checkResults(tesla.maxValue == 12, "Max price test 1");

        tesla.updateValue(5);
        checkResults(tesla.maxValue == 5, "Max price test 2");

        tesla.updateValue(7);
        checkResults(tesla.maxValue == 7, "Max price test 3");

        tesla.updateValue(99);
        checkResults(tesla.maxValue == 99, "Max price test 4");

        tesla.updateValue(77);
        checkResults(tesla.maxValue == 77, "Max price test 5");

        System.out.println(tesla.getPriceInformation());
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}


