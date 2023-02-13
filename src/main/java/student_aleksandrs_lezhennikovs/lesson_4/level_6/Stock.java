package student_aleksandrs_lezhennikovs.lesson_4.level_6;

class Stock {
    String name;
    double actualPrice;
    double minimumPrice;
    double maximumPrice;

    Stock(String name, double actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.minimumPrice = actualPrice;
        this.maximumPrice = actualPrice;
    }

    String getPriceInformation() {
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
}
