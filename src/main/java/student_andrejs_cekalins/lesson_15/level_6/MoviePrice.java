package student_andrejs_cekalins.lesson_15.level_6;

public class MoviePrice {
    private String priceCode;
    private double price;

    public MoviePrice(String priceCode, Double price) {
        this.priceCode = priceCode;
        this.price = price;
    }

    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode;
    }

    public String getPriceCode() {
        return priceCode;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MoviePrice{" +
                ", priceCode ='" + priceCode + '\'' +
                ", price ='" + price + '\'' +
                '}';
    }
}




