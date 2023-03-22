package student_vladislav_romanov.lesson_9.level_5;

import student_vladislav_romanov.TestUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BookReaderTest extends TestUtil {

    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.addBookTestSucceed();
        bookReaderTest.addBookTestFailed();
        bookReaderTest.addBookWithoutAuthorTestSucceed();
        bookReaderTest.addBookWithoutAuthorTestFailed();
        bookReaderTest.addBookWithoutTitleTestSucceed();
        bookReaderTest.addBookWithoutTitleTestFailed();
        bookReaderTest.removeBookTestSucceed();
        bookReaderTest.removeBookTestFailed();
        bookReaderTest.listOfBooksSucceed();
        bookReaderTest.listOfBooksFailed();
        bookReaderTest.listOfBooksByAuthorFullNameSucceed();
        bookReaderTest.listOfBooksByAuthorFullNameFailed();
        bookReaderTest.listOfBooksByAuthorSucceed();
        bookReaderTest.listOfBooksByAuthorFailed();
        bookReaderTest.printStat();
    }

    public void addBookTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = true;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookTestSucceed");
    }

    public void addBookTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        bookReader.addBook(shogun);
        boolean expected = false;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookTestFailed");
    }

    public void addBookWithoutAuthorTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = false;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookWithoutAuthorTestSucceed");
    }

    public void addBookWithoutAuthorTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = true;
        boolean current = bookReader.addBook(shogun);

        printResult(current != expected, "addBookWithoutAuthorTestFailed");
    }

    public void addBookWithoutTitleTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = false;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookWithoutTitleTestSucceed");
    }

    public void addBookWithoutTitleTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = true;
        boolean current = bookReader.addBook(shogun);

        printResult(current != expected, "addBookWithoutTitleTestFailed");
    }

    public void removeBookTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        bookReader.addBook(shogun);
        boolean expected = true;
        boolean current = bookReader.removeBook(shogun);

        printResult(current == expected, "removeBookTestSucceed");
    }

    public void removeBookTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");

        bookReader.addBook(taipan);
        boolean expected = false;
        boolean current = bookReader.removeBook(shogun);

        printResult(current == expected, "removeBookTestFailed");
    }

    public void listOfBooksSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");
        bookReader.addBook(shogun);
        bookReader.addBook(taipan);
        List<String> expected = new ArrayList<>();
        expected.add("Сёгун[Джеймс Клавелл]");
        expected.add("Тай-Пэн[Джеймс Клавелл]");
        List<String> current = bookReader.listOfBooks();
        Collections.sort(expected);
        Collections.sort(current);

        printResult(current.equals(expected), "listOfBooksSucceed");
    }

    public void listOfBooksFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");
        bookReader.addBook(shogun);
        bookReader.addBook(taipan);
        List<String> expected = new ArrayList<>();
        expected.add("Сёгун[Джеймс Клавелл]");
        List<String> current = bookReader.listOfBooks();
        Collections.sort(expected);
        Collections.sort(current);

        printResult(!current.equals(expected), "listOfBooksFailed");
    }

    public void listOfBooksByAuthorFullNameSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");
        Book falconGuard = new Book("Соколиная стража", "Роберт Торстон", "Армада", 1995, "Русский", 363, "5-87994-125-6");
        bookReader.addBook(shogun);
        bookReader.addBook(taipan);
        bookReader.addBook(falconGuard);
        List<String> expected = new ArrayList<>();
        expected.add("Сёгун[Джеймс Клавелл]");
        expected.add("Тай-Пэн[Джеймс Клавелл]");
        List<String> current = bookReader.listOfBooks("Джеймс Клавелл");
        Collections.sort(expected);
        Collections.sort(current);

        printResult(current.equals(expected), "listOfBooksByAuthorFullNameSucceed");
    }

    public void listOfBooksByAuthorFullNameFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");
        Book falconGuard = new Book("Соколиная стража", "Роберт Торстон", "Армада", 1995, "Русский", 363, "5-87994-125-6");
        bookReader.addBook(shogun);
        bookReader.addBook(taipan);
        bookReader.addBook(falconGuard);
        List<String> expected = new ArrayList<>();
        expected.add("Сёгун[Джеймс Клавелл]");
        List<String> current = bookReader.listOfBooks("Джеймс Клавелл");

        printResult(!current.equals(expected), "listOfBooksByAuthorFullNameFailed");
    }

    public void listOfBooksByAuthorSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");
        Book falconGuard = new Book("Соколиная стража", "Роберт Торстон", "Армада", 1995, "Русский", 363, "5-87994-125-6");
        bookReader.addBook(shogun);
        bookReader.addBook(taipan);
        bookReader.addBook(falconGuard);
        List<String> expected = new ArrayList<>();
        expected.add("Сёгун[Джеймс Клавелл]");
        expected.add("Тай-Пэн[Джеймс Клавелл]");
        List<String> current = bookReader.listOfBooks("Клавелл");
        Collections.sort(expected);
        Collections.sort(current);

        printResult(current.equals(expected), "listOfBooksByAuthorSucceed");
    }

    public void listOfBooksByAuthorFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");
        Book falconGuard = new Book("Соколиная стража", "Роберт Торстон", "Армада", 1995, "Русский", 363, "5-87994-125-6");
        bookReader.addBook(shogun);
        bookReader.addBook(taipan);
        bookReader.addBook(falconGuard);
        List<String> expected = new ArrayList<>();
        expected.add("Сёгун[Джеймс Клавелл]");
        List<String> current = bookReader.listOfBooks("Роберт");
        Collections.sort(expected);
        Collections.sort(current);

        printResult(!current.equals(expected), "listOfBooksByAuthorFailed");
    }

}
