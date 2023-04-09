package student_anastasiia_bokareva.lesson3.level7;

import java.util.Objects;

public class Product {
    String name;
    Double regularPrice;
    Double discount;
    public Product (String name) {
        this.name=name;
    }

    public Product(String name, Double regularPrice, Double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(regularPrice, product.regularPrice) &&
                Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }
}
