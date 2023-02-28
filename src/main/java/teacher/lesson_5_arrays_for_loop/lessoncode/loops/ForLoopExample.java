package teacher.lesson_5_arrays_for_loop.lessoncode.loops;

import teacher.lesson_5_arrays_for_loop.lessoncode.stockcheck.Stock;

public class ForLoopExample {

    public static void main(String[] args) {
        Stock[] stocks = new Stock[5];

        stocks[0] = new Stock("Google", 100.0);
        stocks[1] = new Stock("Apple", 200.0);
        stocks[4] = new Stock("Tesla", 300.0);

        for (int i = 0; i < stocks.length; i++) {
            System.out.println("i = " + i);
            if (stocks[i] != null) {
                System.out.println(stocks[i].getPriceInformation());
            }
        }

//        for (Stock stock : stocks) {
//            if (stock != null) {
//                System.out.println(stock.getPriceInformation());
//            }
//        }
    }
}
