package student_oksana_tarasova.lesson_4.level_6;

class StockMaximaDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Maxima", 666);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(555);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(1000);
        System.out.println(stock.getPriceInformation());
    }
}
