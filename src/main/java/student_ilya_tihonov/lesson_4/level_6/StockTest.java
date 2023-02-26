package student_ilya_tihonov.lesson_4.level_6;

public class StockTest {

    public static void main(String[] args){
        checkUpdatePrice();
    }

    private static void check(String name, String checkChanges, double objectPrice, double expectedPrice){
        if (objectPrice == expectedPrice){
            System.out.println(name + checkChanges + "; price " +objectPrice + " = OK");
        } else {
            System.out.println(name + checkChanges + "; price " +objectPrice + " = FAIL");}
        }

    static void checkUpdatePrice(){
        double firstUpdate = 10;
        double secondUpdate = 12;
        double thirdUpdate = 5;
        double forthUpdate = 7;
        double fifthUpdate = 99;
        double sixthUpdate = 77;

        Stock apple = new Stock("Apple",100);
        apple.updatePrice(10);
        check(apple.name, "First price change", apple.actualPrice, firstUpdate);
        check(apple.name, "Minimum price", apple.actualPrice, 10);
        check(apple.name, "Maximum price", apple.actualPrice, 100);

        apple.updatePrice(12);
        check(apple.name, "First price change", apple.actualPrice, secondUpdate);
        check(apple.name, "Minimum price", apple.actualPrice, 12);
        check(apple.name, "Maximum price", apple.actualPrice, 100);

        apple.updatePrice(5);
        check(apple.name, "First price change", apple.actualPrice, thirdUpdate);
        check(apple.name, "Minimum price", apple.actualPrice, 5);
        check(apple.name, "Maximum price", apple.actualPrice, 100);

        apple.updatePrice(7);
        check(apple.name, "First price change", apple.actualPrice, forthUpdate);
        check(apple.name, "Minimum price", apple.actualPrice, 7);
        check(apple.name, "Maximum price", apple.actualPrice, 100);

        apple.updatePrice(99);
        check(apple.name, "First price change", apple.actualPrice, fifthUpdate);
        check(apple.name, "Minimum price", apple.actualPrice, 99);
        check(apple.name, "Maximum price", apple.actualPrice, 100);

        apple.updatePrice(77);
        check(apple.name, "First price change", apple.actualPrice, sixthUpdate);
        check(apple.name, "Minimum price", apple.actualPrice, 77);
        check(apple.name, "Maximum price", apple.actualPrice, 100);

    }
    static void checkMaximumMinimumPrice(){
        double firstMaxPrise = 999;
        double secondMaxPrice = 1000;
        double thirdMaxPrice = 27;

        Stock apple = new Stock("Apple", 100);
        apple.updatePrice(999);
        check(apple.name, " 100 -> 999", apple.maxPrice, firstMaxPrise);
        check(apple.name, "Min price", apple.minPrice, 100);

        apple.updatePrice(1);
        check(apple.name, " 999 -> 1", apple.maxPrice, firstMaxPrise);
        check(apple.name, "Min price", apple.minPrice, 1);

        apple.updatePrice(999);
        apple.updatePrice(2);
        check(apple.name,"1 -> 999 -> 2 -> 1000", apple.maxPrice, firstMaxPrise);
        check(apple.name, "Min price", apple.minPrice, 1);

        apple.updatePrice(999);
        apple.updatePrice(2);
        apple.updatePrice(1000);
        apple.updatePrice(8);
        check(apple.name,"1000 -> 999 -> 2 -> 1000 -> 8", apple.maxPrice, firstMaxPrise);
        check(apple.name, "Min price", apple.minPrice, 1);

    }


}
