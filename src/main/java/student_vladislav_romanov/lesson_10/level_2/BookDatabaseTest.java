package student_vladislav_romanov.lesson_10.level_2;

import student_vladislav_romanov.TestUtil;

import java.util.Optional;

class BookDatabaseTest extends TestUtil {

    public static void main(String[] args) {
        BookDatabaseTest bookDatabaseTest = new BookDatabaseTest();
        bookDatabaseTest.saveTestSucceed();
        bookDatabaseTest.saveTestFailed();
        bookDatabaseTest.deleteByIdTestSucceed();
        bookDatabaseTest.deleteByIdTestFailed();
        bookDatabaseTest.deleteByBookTestSucceed();
        bookDatabaseTest.deleteByBookTestFailed();
        bookDatabaseTest.findByIdTestSucceed();
        bookDatabaseTest.findByIdTestFailed();
        bookDatabaseTest.printStat();
    }

    public void saveTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");

        long expected = 1;
        long current = bookDatabase.save(shogun);
        printResult(current == expected, "saveTestSucceed");
    }

    public void saveTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");

        long expected = 10;
        long current = bookDatabase.save(shogun);
        printResult(current != expected, "saveTestFailed");
    }

    public void deleteByIdTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");

        boolean expected = true;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete((long) 1);
        printResult(current == expected, "deleteByIdTestSucceed");
    }

    public void deleteByIdTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");

        boolean expected = false;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete((long) 2);
        printResult(current == expected, "deleteByIdTestFailed");
    }

    public void deleteByBookTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл");

        boolean expected = true;
        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        boolean current = bookDatabase.delete(shogun);
        printResult(current == expected, "deleteByBookTestSucceed");
    }

    public void deleteByBookTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл");

        boolean expected = false;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete(taipan);
        printResult(current == expected, "deleteByBookTestFailed");
    }

    public void findByIdTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);

        Optional<Book> expected = Optional.of(taipan);
        Optional<Book> current = bookDatabase.findById((long) 2);

        printResult(current.equals(expected), "findByIdTestSucceed");
    }

    public void findByIdTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");

        bookDatabase.save(shogun);

        Optional<Book> expected = Optional.empty();
        Optional<Book> current = bookDatabase.findById((long) 2);

        printResult(current.equals(expected), "findByIdTestFailed");
    }

}
