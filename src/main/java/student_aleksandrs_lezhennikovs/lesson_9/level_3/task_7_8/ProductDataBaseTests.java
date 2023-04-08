package student_aleksandrs_lezhennikovs.lesson_9.level_3.task_7_8;

class ProductDataBaseTests {
    public static void main(String[] args) {
        checkFindByTitle();
        checkSaveInDatabase();
    }

    private static void checkSaveInDatabase() {
        Product[] products = {new Product("phone"),
                              new Product("tv"),
                              new Product("car")};
        InMemoryDatabase productDatabase = new InMemoryDatabase(products);
        productDatabase.save(new Product("NewProduct"));
        String expectedProduct = "NewProduct";
        String actualProduct = productDatabase.getStorage()[3].getTitle();
        check("Save in DB", expectedProduct, actualProduct);
    }

    private static void checkFindByTitle() {
        Product[] products = {new Product("phone"),
                              new Product("tv"),
                              new Product("car")};
        ProductDatabase productDatabase = new InMemoryDatabase(products);
        Product expectedResult = new Product("car");
        Product actualResult = productDatabase.findByTitle("car");
        check("Find by title", expectedResult, actualResult);
    }

    private static void check(String actionName, Product expect, Product actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }

    private static void check(String actionName, String expect, String actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
