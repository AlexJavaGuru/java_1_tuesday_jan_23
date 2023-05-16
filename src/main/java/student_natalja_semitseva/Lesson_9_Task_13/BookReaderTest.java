package student_natalja_semitseva.Lesson_9_Task_13;


import java.util.ArrayList;
import java.util.List;

public class BookReaderTest {


    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();

        bookReaderTest.testFindByTitle();
        bookReaderTest.testDeleteBook();
        bookReaderTest.testAddBook();
    }

    public void testFindByTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book TheGreenMile = new Book("The Green Mile", "Stephen King ");
        Book Cell = new Book("Cell", "Stephen King");
        Book Later = new Book("The Green Mile 2", "Stephen King");
        bookReader.addBook(TheGreenMile);
        bookReader.addBook(Cell);
        bookReader.addBook(Later);
        List<Book> expectedResult = new ArrayList<>() {{
            add(Later);
        }};
        List<Book> actualResult = bookReader.findByTitle("The Green Mile 2");
        checkResult(expectedResult, actualResult, "test Find By Title");
    }

    public void testDeleteBook() {
        BookReader bookReader = new BookReaderImpl();
        Book TheGreenMile = new Book("The Green Mile", "Stephen King");
        boolean actualResult = bookReader.deleteBook(TheGreenMile);
        checkResult(!actualResult, "Test Delete book ");
    }

    public void testAddBook() {
        BookReader bookReader = new BookReaderImpl();
        Book TheGreenMile = new Book("The Green Mile", "Stephen King");
        boolean actualResult = bookReader.addBook(TheGreenMile);
        checkResult(actualResult, "Test Add book ");
    }

    private void checkResult(boolean actualResult) {
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    private void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + "failed!!!");
        }
    }

    private void checkResult(List<Book> expectedResult, List<Book> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!!!");
        } else {
            System.out.println(testName + "failed!!!");
        }
    }
}