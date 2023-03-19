package student_andrejs_cekalins.lesson_9.level_3.Task_8;

class ProductDatabaseTest {
    public static void main(String[] args) {
        ProductDatabaseTest test = new ProductDatabaseTest();
        test.findByTitle();
    }

    public void findByTitle() {

        Product[] products = {
                new Product("lemon"),
                new Product("melon"),
                new Product("apple"),
                new Product("pear")
        };
        Product expectedResult = products[2];
        ProductDatabase productDatabase = new InMemoryDatabase();
        Product realResult = productDatabase.findByTitle("apple");
        if (expectedResult.equals(realResult)) {
            System.out.println("Find by title test Passed");
        }
    }
}
