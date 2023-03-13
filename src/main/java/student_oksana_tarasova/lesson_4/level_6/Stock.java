package student_oksana_tarasova.lesson_4.level_6;

class Stock {

    String name;
    int actualPrice;
    int minPrice;
    int maxPrice;

    public Stock(String name, int actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    public String getPriceInformation() {
        return "Company = " + name + ", Current Price = " + actualPrice + " , Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

    void updatePrice(int actualPrice) {
        this.actualPrice = actualPrice;
        if (actualPrice > maxPrice) {
            maxPrice = actualPrice;
        } else if (actualPrice < minPrice) {
            minPrice = actualPrice;
        }
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}


