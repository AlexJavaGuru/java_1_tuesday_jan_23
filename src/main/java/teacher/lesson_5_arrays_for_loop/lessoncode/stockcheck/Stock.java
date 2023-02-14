package teacher.lesson_5_arrays_for_loop.lessoncode.stockcheck;

public class Stock {
    String name;
    double actualPrice;
    double minimumPrice;
    double maximumPrice;

    public Stock(String name, double actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.minimumPrice = actualPrice;
        this.maximumPrice = actualPrice;
    }

    public String getPriceInformation() {
        return "Company = " + name + ", Current Price = " + actualPrice + " , Min Price = " + minimumPrice + ", Max Price = " + maximumPrice;
    }

    void updatePrice(int actualPrice) {
        this.actualPrice = actualPrice;
        if (actualPrice > maximumPrice) {
            maximumPrice = actualPrice;
        } else if (actualPrice < minimumPrice) {
            minimumPrice = actualPrice;
        }
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }

    public double getMaximumPrice() {
        return maximumPrice;
    }
}
