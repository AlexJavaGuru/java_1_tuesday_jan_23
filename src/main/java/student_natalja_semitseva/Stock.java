package student_natalja_semitseva;

class Stock {


    String nameCompany;
    int currentValue;
    int minValue;
    int maxValue;

    Stock(String nameCompany, int currentValue) {
        this.nameCompany = nameCompany;
        this.currentValue = currentValue;
        this.minValue = currentValue;
        this.maxValue = currentValue;


    }

    public void updatePrice(int newPrice) {
        currentValue = newPrice;
        if (newPrice > maxValue) {
            maxValue = newPrice;

        } else if (newPrice < maxValue) {
            minValue = newPrice;
        }
    }

    void getPriceInformation() {

        System.out.print("\nCompany = " + nameCompany + ",  ");
        System.out.print("Current Price = " + currentValue + "  ");
        System.out.print("Min Price = " + minValue + "  ");
        System.out.print("Max Price =  " + maxValue + "  ");

    }

    int getCurrentValue() {
        return currentValue;
    }

    int getMinValue() {
        return minValue;
    }

    int getMaxValue() {
        return maxValue;
    }
}
