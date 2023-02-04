package student_nikita_visnakovs.lesson_3.level_7;

public class Product {

    String car;
    double regularPrice;
    double discount;

    public Product(String car, double regularPrice, double discount) {
        this.car = car;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public void price() {
        System.out.println("Car price is " + regularPrice);
    }

    public void discount() {
        System.out.println("Discount is " + "10%");
    }

    public void newPrice() {
        System.out.println("New price is " + (regularPrice - (regularPrice * discount)));
    }

}
