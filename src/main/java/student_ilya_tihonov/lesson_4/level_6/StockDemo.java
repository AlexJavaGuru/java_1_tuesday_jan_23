package student_ilya_tihonov.lesson_4.level_6;

public class StockDemo {

    public static void main(String[] args){

        Stock apple = new Stock("Apple", 100);
        String priceInformation = apple.getPriceInformation();
        System.out.println(priceInformation);
        apple.updatePrice(30);
        apple.updatePrice(120);
        apple.updatePrice(80);
        priceInformation = apple.getPriceInformation();
        System.out.println(priceInformation);

    }
}
