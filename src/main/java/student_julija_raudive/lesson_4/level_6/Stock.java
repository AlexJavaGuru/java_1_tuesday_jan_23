package student_julija_raudive.lesson_4.level_6;

class Stock {

    String company;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }


    public void updatePrice(int newPrice) {

        if (newPrice > maxPrice) {
            maxPrice = newPrice;

        } else if (newPrice < minPrice) {
            minPrice = newPrice;

        } else {

            currentPrice = newPrice;
        }


    }

    public String getPriceInformation() {
        return "Company = \"" + company + "\"" +
                ", Current Price = " + currentPrice +
                ", Min Price = " + minPrice +
                ", Max Price = " + maxPrice;
    }


}
