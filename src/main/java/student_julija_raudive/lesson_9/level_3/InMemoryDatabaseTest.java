package student_julija_raudive.lesson_9.level_3;

import java.util.ArrayList;
import java.util.Optional;

class InMemoryDatabaseTest {

    ArrayList<Product> productList = new ArrayList<>();
    InMemoryDatabase database = new InMemoryDatabase(productList);

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.addProduct();
        test.findExistingProduct();
        test.findNonExistentProduct();


    }

    public void addProduct() {
        Product apple = new Product("Apple");
        database.save(apple);
        checkResults(productList.contains(apple), "Add new product test");

    }


    public void findExistingProduct() {
        database.save(new Product("Orange"));
        Product lemon = new Product("Lemon");
        database.save(lemon);
        database.save(new Product("Banana"));
        Optional<Product> result = database.findByTitle("Lemon");
        checkResults(result.get() == lemon, "Find existing product test");


    }

    public void findNonExistentProduct() {
        Optional<Product> result = database.findByTitle("Pear");
        checkResults(result.equals(Optional.empty()), "Find non-existent product test");

    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


}
