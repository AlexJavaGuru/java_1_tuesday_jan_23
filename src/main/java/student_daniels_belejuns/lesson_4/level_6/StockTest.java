package student_daniels_belejuns.lesson_4.level_6;

public class StockTest {
    public static void main(String[]args){
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        double expectedCurrentPrice = 14;
        double expectedMinPrice = 7;
        double expectedMaxPrice = 15;

        double actualCurrentPrice = google.currentPrice;
        double actualMinPrice = google.minPrice;
        double actualMaxPrice = google.maxPrice;

        if(actualCurrentPrice == expectedCurrentPrice){
            System.out.println("Current price passed");
        }
        else{
            System.out.println("Current price failed");
        }

        if (actualMinPrice == expectedMinPrice){
            System.out.println("Min price passed");
        }
        else{
            System.out.println("Min price failed");
        }

        if (actualMaxPrice == expectedMaxPrice){
            System.out.println("Max price passed");
        }
        else{
            System.out.println("Min price failed");
        }

    }
}
