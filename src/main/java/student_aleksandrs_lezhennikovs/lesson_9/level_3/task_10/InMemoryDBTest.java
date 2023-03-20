package student_aleksandrs_lezhennikovs.lesson_9.level_3.task_10;

import java.util.Optional;

class InMemoryDBTest {
    public static void main(String[] args) {
        checkFindByTitleOptional();
        checkEmptyOptional();
    }

    private static void checkEmptyOptional() {
        Product[] products = {new Product("phone"),
                              new Product("tv"),
                              new Product("car")};
        ProductDatabase productDatabase = new InMemoryDatabase(products);
        Optional<Product> expectedResult = Optional.empty();
        Optional<Product> actualResult = productDatabase.findByTitle("apple");
        check("Optional isEmpty check", expectedResult, actualResult);
    }
    private static void checkFindByTitleOptional() {
        Product[] products = {new Product("phone"),
                              new Product("tv"),
                              new Product("car")};
        InMemoryDatabase productDatabase = new InMemoryDatabase(products);
        Optional<Product> expectedOpt = Optional.ofNullable(new Product("car"));
        Optional<Product> actualOpt= productDatabase.findByTitle("car");
        String expectedResult = expectedOpt.get().getTitle();
        String actualResult = actualOpt.get().getTitle();
        check("Optional find by title", expectedResult, actualResult);
    }

    private static void check(String actionName, Optional<Product> expect, Optional<Product> actual) {
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
