package student_nikita_visnakovs.lesson_9.level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest tester = new BookReaderTest();
        tester.testAddBook1();
        tester.testAddBook2();
        tester.testAddBook3();
        tester.testAddBook4();
        tester.testAddBook5();
        tester.testAddBook6();
        tester.testDeleteBook1();
        tester.testDeleteBook2();
        tester.testGetListOfAllBooks();
        tester.testFindByAuthor();
        tester.testFindByAuthor2();
        tester.testFindByAuthor3();
        tester.testFindByTitle1();
        tester.testFindByTitle2();
        tester.testFindByTitle3();
        tester.testMarkAsRead1();
        tester.testMarkAsRead2();
        tester.testMarkAsUnread1();
        tester.testGetAllReadBooks1();
        tester.testGetAllReadBooks2();
        tester.testGetAllUnreadBooks1();
        tester.testGetAllUnreadBooks2();
    }

    public void testGetAllUnreadBooks1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
        bookReader.markAsRead(harryPotter);
        List<String> expectedResult = new ArrayList<>() {{
            add("Harry Potter 2 [Rowling]");
            add("Harry Potter 3 [Rowling]");
        }};
        List<String> actualResult = bookReader.getListOfAllUnreadBooks();
        checkResult(expectedResult, actualResult, "Get all unread books test ");
    }

    public void testGetAllUnreadBooks2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
        bookReader.markAsRead(harryPotter);
        bookReader.markAsRead(harryPotter2);
        bookReader.markAsRead(harryPotter3);
        List<String> expectedResult = new ArrayList<>();
        List<String> actualResult = bookReader.getListOfAllUnreadBooks();
        checkResult(expectedResult, actualResult, "Get all unread books test 2");
    }

    public void testGetAllReadBooks1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
        bookReader.markAsRead(harryPotter2);
        bookReader.markAsRead(harryPotter3);
        List<String> expectedResult = new ArrayList<>() {
            {
                add("Harry Potter 2 [Rowling]");
                add("Harry Potter 3 [Rowling]");
            }
        };
        List<String> actualResult = bookReader.getListOfAllReadBooks();
        checkResult(expectedResult, actualResult, "Get all read books test ");
    }

    public void testGetAllReadBooks2() {
        BookReader bookReader = new BookReaderImpl();
        createTestLibrary(bookReader);
        List<String> expectedResult = new ArrayList<>();
        List<String> actualResult = bookReader.getListOfAllReadBooks();
        checkResult(expectedResult, actualResult, "Get all read books test 2 ");
    }

    public void testMarkAsUnread1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
        bookReader.markAsUnread(harryPotter2);
        checkResult(!harryPotter2.isRead());
    }

    public void testMarkAsRead1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Harry Potter 2", "Rowling");
        Book lordOfRings2 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsRead(lordOfRings);
        boolean actualResult = lordOfRings.isRead();
        checkResult(actualResult, "Mark as read test ");
    }

    public void testMarkAsRead2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Harry Potter 2", "Rowling");
        Book lordOfRings2 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsRead(lordOfRings);
        boolean actualResult = lordOfRings.isRead();
        checkResult(!actualResult, "Mark as read test 2 ");
    }

    public void testFindByTitle1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Harry Potter 2", "Rowling");
        Book lordOfRings2 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>() {{
            add(lordOfRings2);
        }};
        List<Book> actualResult = bookReader.findByTitle("Harry Potter 3");
        checkResult(expectedResult, actualResult);
    }

    public void testFindByTitle2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Harry Potter 2", "Rowling");
        Book lordOfRings2 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>() {{
            add(lordOfRings);
            add(lordOfRings2);
        }};
        List<Book> actualResult = bookReader.findByTitle("Harry");
        checkResult(expectedResult, actualResult);
    }

    public void testFindByTitle3() {
        BookReader bookReader = new BookReaderImpl();
        createTestLibrary(bookReader);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = bookReader.findByTitle("Potter");
        checkResult(expectedResult, actualResult);
    }

    public void testFindByAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
        List<Book> expectedResult = new ArrayList<>() {{
            add(harryPotter2);
            add(harryPotter3);
        }};
        List<Book> actualResult = bookReader.findByAuthor("Rowling");
        checkResult(expectedResult, actualResult);
    }

    public void testFindByAuthor2() {
        BookReader bookReader = new BookReaderImpl();
        createTestLibrary(bookReader);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = bookReader.findByAuthor("Rowlin");
        checkResult(expectedResult, actualResult);
    }

    public void testFindByAuthor3() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
        List<Book> expectedResult = new ArrayList<>() {{
            add(harryPotter2);
            add(harryPotter3);
        }};
        List<Book> actualResult = bookReader.findByAuthor("Row");
        checkResult(expectedResult, actualResult);
    }

    public void testGetListOfAllBooks() {
        BookReader bookReader = new BookReaderImpl();
        createTestLibrary(bookReader);
        String[] expectedResult = {"Harry Potter [Rowling]", "Harry Potter 2 [Rowling]", "Harry Potter 3 [Rowling]"};
        String[] actualResult = bookReader.getListOfAllBooks();
        checkResult(expectedResult, actualResult, "Get List of all book test");
    }

    public void testDeleteBook1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        bookReader.addBook(harryPotter);
        boolean actualResult = bookReader.deleteBook(harryPotter);
        checkResult(actualResult, "Delete book test");
    }

    public void testDeleteBook2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        boolean actualResult = bookReader.deleteBook(harryPotter);
        checkResult(!actualResult, "Delete book test 2");
    }

    public void testAddBook1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(actualResult, "Add book test ");
    }

    public void testAddBook2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        bookReader.addBook(harryPotter);
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult, "Add book test 2");
    }

    public void testAddBook3() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult, "Add book test 3");
    }

    public void testAddBook4() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        harryPotter.setAuthor("Rowling");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult, "Add book test 4");
    }

    public void testAddBook5() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        harryPotter.setTitle("Harry Potter");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult, "Add book test 5");
    }

    public void testAddBook6() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        harryPotter.setTitle("Harry Potter");
        harryPotter.setAuthor("Rowling");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(actualResult, "Add book test 6");
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
            System.out.println(testName +  " has passed!!!");
        } else {
            System.out.println(testName + "failed!!!");
        }
    }

    private void checkResult(String[] expectedResult, String[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName +  " has passed!!!");
        } else {
            System.out.println(testName + "failed!!!");
        }
    }

    private void checkResult(List<Book> expectedResult, List<Book> actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    private void checkResult(List<String> expectedResult, List<String> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName +  " has passed!!!");
        } else {
            System.out.println(testName + "failed!!!");
        }
    }

    private void createTestLibrary(BookReader bookReader) {
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book harryPotter2 = new Book("Harry Potter 2", "Rowling");
        Book harryPotter3 = new Book("Harry Potter 3", "Rowling");
        bookReader.addBook(harryPotter);
        bookReader.addBook(harryPotter2);
        bookReader.addBook(harryPotter3);
    }
}
