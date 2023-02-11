package student_nikita_visnakovs.lesson_4.level_6;

public class Stock {

    String nameOfCompany;
    int currentPrice;
    int minPrice;
    int maxPrice;


    Stock(String nameOfCompany, int currentPrice) {
        this.nameOfCompany = nameOfCompany;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    void getPriceInformation() {
        System.out.println("Company: " + nameOfCompany);
        System.out.println("Current price: " + currentPrice);
        System.out.println("Minimal price: " + minPrice);
        System.out.println("Maximum price: " + maxPrice);
    }

    int getCurrentPrice() {
        return currentPrice;
    }

    int getMinPrice() {
        return minPrice;
    }

    int getMaxPrice() {
        return maxPrice;
    }
}

