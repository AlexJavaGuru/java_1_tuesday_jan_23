package student_anastasiia_bokareva.lesson4.level6;

public class Stock {
    String nameOfCompany;
    int currentPrice;
    int minPrice;
    int  maxPrice;
    public Stock (String nameOfCompany, int currentPrice){
        this.nameOfCompany = nameOfCompany;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }
    public void updatePrice (int newPrice){
        currentPrice = newPrice;
        if (currentPrice > maxPrice){
            maxPrice=currentPrice;
        }
        if (currentPrice<minPrice){
            minPrice=currentPrice;
        }

    }
    public String getPriceInformation(){
        return "Company name is - " + nameOfCompany + ", Current Price is - " + currentPrice + " ,Max Price is - " + maxPrice + " , Min Price is - " + minPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }
    public int getMaxPrice(){
        return maxPrice;
    }
    public int getMinPrice(){
        return minPrice;
    }
}
