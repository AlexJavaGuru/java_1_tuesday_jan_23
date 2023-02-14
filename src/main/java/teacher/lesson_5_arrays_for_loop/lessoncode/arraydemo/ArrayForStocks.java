package teacher.lesson_5_arrays_for_loop.lessoncode.arraydemo;

import teacher.lesson_5_arrays_for_loop.lessoncode.stockcheck.Stock;

public class ArrayForStocks {

    public static void main(String[] args) {
        Stock[] stocks = new Stock[5];

        stocks[0] = new Stock("Google", 100.0);
        stocks[1] = new Stock("Apple", 200.0);
        stocks[2] = new Stock("Tesla", 300.0);

        System.out.println(stocks[0].getPriceInformation());
        System.out.println(stocks[1].getPriceInformation());
        System.out.println(stocks[2].getPriceInformation());
    }
}
