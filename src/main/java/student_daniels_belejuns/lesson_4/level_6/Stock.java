package student_daniels_belejuns.lesson_4.level_6;

public class Stock {
    String company;
    double currentPrice;
    double minPrice;
    double maxPrice;

    Stock(String name, double price) {
        company = name;
        currentPrice = price;
        minPrice = price;
        maxPrice = price;
    }

    void updatePrice(double newPrice) {
        currentPrice = newPrice;
        if (newPrice < maxPrice) {
            minPrice = newPrice;
        }
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + company + ", CurrentPrice = " + currentPrice + ", Min Price = " + minPrice + ", Max price = " + maxPrice;
    }
}
