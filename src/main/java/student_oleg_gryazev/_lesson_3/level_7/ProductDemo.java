package student_oleg_gryazev._lesson_3.level_7;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Apple");
        product.setRegularPrice(1910);
        product.setDiscount(product.regularPrice / 100 * 15);
        String computer = product.getComputer();
        System.out.println("Usual price of computer model - " + computer + " is - " + product.getRegularPrice() + "\n");
        System.out.println("Computer model - " + computer + " has a discount of " + product.discount + "-\n");
        System.out.println("And it costs now - " + (product.regularPrice - product.discount + "-"));

    }
}
