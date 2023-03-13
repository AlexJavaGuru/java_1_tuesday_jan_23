package student_anastasiia_bokareva.lesson3.level7;

public class Product {
    String name;
    Double regularPrice;
    Double discount;
    Product (String name) {
        this.name=name;
    }

    double setPrice(double regularPrice) {
        return regularPrice;
    }

    double setDiscount(double discount) {
        return discount;
    }

    double actualPrice(double regularPrice, double discount) {
        double result = regularPrice * (1 - discount);
        return result;
    }
    public void newPrice (){
        System.out.println("New price = "+ actualPrice(regularPrice, discount));
    }

}
