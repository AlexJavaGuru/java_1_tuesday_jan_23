package student_ilya_tihonov.lesson_4.level_6;

public class Stock {

    String name;
    double actualPrice;
    double minPrice;
    double maxPrice;

    Stock(String name, double actualPrice){
        this.name = name;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    public Stock(String name, int actualPrice) {
    }

    void updatePrice(int newPrise){
        this.actualPrice = newPrise;
        if (newPrise < minPrice){
            minPrice = newPrise;
        } else if (newPrise > maxPrice){
            maxPrice = newPrise;
        }
    }

    String getPriceInformation(){
        return "Company " + name + " actual price - " + actualPrice;
    }

}
