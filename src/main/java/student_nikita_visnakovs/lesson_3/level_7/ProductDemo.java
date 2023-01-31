package student_nikita_visnakovs.lesson_3.level_7;

public class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Audi", 47745, 0.10);

        product.price();
        product.discount();
        product.newPrice();

    }
}