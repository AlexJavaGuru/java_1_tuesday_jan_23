package student_daniels_belejuns.lesson_9.level_3;

import java.util.Optional;

class ProductDatabaseTest {
    public static void main(String[] args) {
        ProductDatabaseTest test = new ProductDatabaseTest();
        test.findByTitle();
        test.notFindByTitle();
    }

    public void findByTitle() {

        Product[] products = {
                new Product("lemon"),
                new Product("melon"),
                new Product("apple"),
                new Product("pear")
        };
        ProductDatabase productDatabase = new InMemoryDatabase(products);
        Optional<Product> realResult = productDatabase.findByTitle("apple");
        if (realResult.isPresent()) {
            System.out.println("Find by title test Passed");
        }
    }

    public void notFindByTitle() {
        Product[] products = {};
        ProductDatabase productDatabase = new InMemoryDatabase(products);
        Optional<Product> realResult = productDatabase.findByTitle("orange");
        if (realResult.isEmpty()) {
            System.out.println("Not find by title test Passed");
        }
    }
}
