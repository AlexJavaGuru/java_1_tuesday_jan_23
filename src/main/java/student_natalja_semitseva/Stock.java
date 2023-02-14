package student_natalja_semitseva;

public class Stock {


        String nameCompany;
        int currentValue;
        int minValue;
        int maxValue;

       Stock(String nameCompany, int currentValue) {
           this.nameCompany = nameCompany;
           this.currentValue = currentValue;
           this.minValue =  currentValue;
           this.maxValue = currentValue;


    }

    public void updatePrice(int newPrice) {
           currentValue = newPrice;
           if (newPrice > maxValue) {
           maxValue = newPrice;

           }else if (newPrice < maxValue) {
               minValue = newPrice;
           }
    }
    void getPriceInformation() {
        System.out.println("Company: " + nameCompany);
        System.out.println("Current price: " + currentValue);
        System.out.println("Minimal price: " + minValue);
        System.out.println(" Maximum price: " + maxValue);
    }
    int getCurrentValue() {
           return currentValue;
    }
    int getMinValue() {
           return minValue;
    }
    int getMaxValue () {
           return maxValue;
    }
}
