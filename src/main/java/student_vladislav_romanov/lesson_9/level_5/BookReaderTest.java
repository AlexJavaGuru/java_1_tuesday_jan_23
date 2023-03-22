package student_vladislav_romanov.lesson_9.level_5;

import student_vladislav_romanov.TestUtil;

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
        bookReaderTest.printStat();
    }

    public void addBookTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = true;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookTestSucceed");
    }

    public void addBookTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

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
        Book shogun = new Book("", "Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = false;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookWithoutTitleTestSucceed");
    }

    public void addBookWithoutTitleTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("", "Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        boolean expected = true;
        boolean current = bookReader.addBook(shogun);

        printResult(current != expected, "addBookWithoutTitleTestFailed");
    }

    public void removeBookTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");

        bookReader.addBook(shogun);
        boolean expected = true;
        boolean current = bookReader.removeBook(shogun);

        printResult(current == expected, "removeBookTestSucceed");
    }

    public void removeBookTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, "978-5-367-00360-4");
        Book taipan = new Book("Тай-Пэн", "Клавелл", "Амфора", 2008, "Русский", 848, "978-5-367-00593-6");

        bookReader.addBook(taipan);
        boolean expected = false;
        boolean current = bookReader.removeBook(shogun);

        printResult(current == expected, "removeBookTestFailed");
    }

}
