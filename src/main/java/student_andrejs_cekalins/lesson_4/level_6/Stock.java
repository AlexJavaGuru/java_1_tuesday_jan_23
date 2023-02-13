package student_andrejs_cekalins.lesson_4.level_6;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int price) {
        this.companyName = companyName;
        this.currentPrice = price;
        this.minPrice = price;
        this.maxPrice = price;
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
        return "Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}
