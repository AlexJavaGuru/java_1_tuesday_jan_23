package student_andrejs_cekalins.lesson_9.level_3.Task_8;

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
        Product expectedResult = products[2];
        ProductDatabase productDatabase = new InMemoryDatabase(products);
        Product realResult = productDatabase.findByTitle("apple");
        if (expectedResult.equals(realResult)) {
            System.out.println("Find by title test Passed");
        }
    }

    public void notFindByTitle() {
        Product[] products = {};
        ProductDatabase productDatabase = new InMemoryDatabase(products);
        Product realResult = productDatabase.findByTitle("apple");
        if (realResult == null) {
            System.out.println("Not find by title test Passed");
        }
    }

    /*public void saveProduct() {
        Product[] products = {
                new Product("lemon"),
                new Product("melon"),
                new Product("apple"),
                new Product("pear"),
        };
        Product productNew = new Product("orange");
        Product expectedResult =pr
                ProductDatabase productDatabase = new InMemoryDatabase(products);
        realResult = productDatabase.save(productNew);
        System.out.println("Save product test Passed");
    }

     */
}


