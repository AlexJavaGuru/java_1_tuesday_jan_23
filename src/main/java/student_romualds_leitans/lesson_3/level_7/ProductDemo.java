package student_romualds_leitans.lesson_3.level_7;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Milk");
        product.setRegularPrice (10.0);
        product.setDiscount (2.0);
        product.printInformation();

    }
}
