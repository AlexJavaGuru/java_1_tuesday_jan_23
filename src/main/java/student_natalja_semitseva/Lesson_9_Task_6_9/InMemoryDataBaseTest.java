package student_natalja_semitseva.Lesson_9_Task_6_9;

import java.util.Arrays;

class InMemoryDataBaseTest {
    public static void main(String[] args) {
InMemoryDataBaseTest test =new InMemoryDataBaseTest();
test.testSave();
test.testSaveFailed();
test.testFindByTitle();
test.testFindByTitleFailed();
    }

    public void testSave() {
        InMemoryDataBase inMemoryDataBase = new InMemoryDataBase();
        Product books = new Product("Books");
        Product workBooks = new Product("WorkBooks");

        inMemoryDataBase.save(books);
        inMemoryDataBase.save(workBooks);
        Product[] expected = {books, workBooks};
        Product[] current = inMemoryDataBase.productsDataBase;

       checkResults(!Arrays.equals(expected,current), "Test save");
    }

    public void testSaveFailed() {
        InMemoryDataBase inMemoryDatabase = new InMemoryDataBase();
        Product books = new Product("Books");
        Product workBooks = new Product("WorkBooks");

        Product[] expected = {books, workBooks};
        Product[] current = inMemoryDatabase.productsDataBase;

       checkResults(!Arrays.deepEquals(current, expected), "Test saveFailed");
    }

    public void testFindByTitle() {
       InMemoryDataBase inMemoryDataBase = new InMemoryDataBase();
        Product books = new Product("Books");

        inMemoryDataBase.save(books);
        Product expected = books;
        Product current = inMemoryDataBase.findByTitle("Books");

        checkResults(current.equals(expected), "Test FindByTitle");
    }

    public void testFindByTitleFailed() {
       InMemoryDataBase inMemoryDatabase = new InMemoryDataBase();
        Product books = new Product("Books");

        inMemoryDatabase.save(books);
        Product current = inMemoryDatabase.findByTitle("wordBooks");

       checkResults(current == null, "Test findByTitleFailed");
    }
    private void checkResults(boolean number, String testName) {
        if (number) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
}
}