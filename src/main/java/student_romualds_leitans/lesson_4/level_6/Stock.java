package student_romualds_leitans.lesson_4.level_6;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (minPrice > newPrice) {
            minPrice = newPrice;
        } else if (maxPrice < newPrice) {
            maxPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
        return null;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

}
