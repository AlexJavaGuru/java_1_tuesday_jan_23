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

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        return "Company = \"" + company + "\"" +
                ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice;
    }
}