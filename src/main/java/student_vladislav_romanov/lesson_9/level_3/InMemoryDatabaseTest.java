package student_vladislav_romanov.lesson_9.level_3;

import student_vladislav_romanov.TestUtil;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabaseTest extends TestUtil {

    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.saveTestSucceed();
        inMemoryDatabaseTest.saveTestFailed();
        inMemoryDatabaseTest.findByTitleTestSucceed();
        inMemoryDatabaseTest.findByTitleTestFailed();
        inMemoryDatabaseTest.printStat();
    }

    public void saveTestSucceed() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product laptop = new Product("Laptop");
        Product tablet = new Product("Tablet");

        inMemoryDatabase.save(laptop);
        inMemoryDatabase.save(tablet);
        Product[] expected = {laptop, tablet};
        Product[] current = inMemoryDatabase.productsDatabase;

        printResult(Arrays.deepEquals(current, expected), "saveTestSucceed");
    }

    public void saveTestFailed() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product laptop = new Product("Laptop");
        Product tablet = new Product("Tablet");

        Product[] expected = {laptop, tablet};
        Product[] current = inMemoryDatabase.productsDatabase;

        printResult(!Arrays.deepEquals(current, expected), "saveTestFailed");
    }

    public void findByTitleTestSucceed() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product laptop = new Product("Laptop");

        inMemoryDatabase.save(laptop);
        Optional<Product> expected = Optional.of(laptop);
        Optional<Product> current = inMemoryDatabase.findByTitle("Laptop");

        printResult(current.equals(expected), "findByTitleTestSucceed");
    }

    public void findByTitleTestFailed() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product laptop = new Product("Laptop");

        inMemoryDatabase.save(laptop);
        Optional<Product> current = inMemoryDatabase.findByTitle("Tablet");

        printResult(current.isEmpty(), "findByTitleTestFailed");
    }

}
