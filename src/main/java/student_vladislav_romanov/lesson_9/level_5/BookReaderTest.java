package student_vladislav_romanov.lesson_9.level_5;

import student_vladislav_romanov.TestUtil;

class BookReaderTest extends TestUtil {

    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.addBookTestSucceed();
        bookReaderTest.addBookTestFailed();
        bookReaderTest.printStat();
    }

    public void addBookTestSucceed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, 1258, 222, 152, "978-5-367-00360-4");

        boolean expected = true;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookTestSucceed");
    }

    public void addBookTestFailed() {
        BookReader bookReader = new BookReaderImpl();
        Book shogun = new Book("Сёгун", "Клавелл", "Амфора", 2008, "Русский", 1207, 1258, 222, 152, "978-5-367-00360-4");

        bookReader.addBook(shogun);
        boolean expected = false;
        boolean current = bookReader.addBook(shogun);

        printResult(current == expected, "addBookTestFailed");
    }

}
