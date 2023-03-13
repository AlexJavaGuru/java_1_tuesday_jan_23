package student_romualds_leitans.lesson_3.level_7;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name){
        this.name = name;
    }
    void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    void setDiscount(double discount){
        this.discount = discount;
    }

    void printInformation(){
        System.out.println("Product: " + name + ", " + "Price with discount: " + (regularPrice - discount));
}

}
