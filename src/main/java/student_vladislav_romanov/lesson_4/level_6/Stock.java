package student_vladislav_romanov.lesson_4.level_6;

class Stock {

    String company;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock (String name, int price) {
        company = name;
        currentPrice = price;
        minPrice = price;
        maxPrice = price;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + company + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

}
