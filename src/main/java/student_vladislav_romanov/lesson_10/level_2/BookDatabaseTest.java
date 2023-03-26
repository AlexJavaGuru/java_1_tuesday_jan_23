package student_vladislav_romanov.lesson_10.level_2;

import student_vladislav_romanov.TestUtil;

import java.util.ArrayList;
import java.util.List;
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
        bookDatabaseTest.findByAuthorTestSucceed();
        bookDatabaseTest.findByAuthorTestFailed();
        bookDatabaseTest.printStat();
    }

    public void saveTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        long expected = 1;
        long current = bookDatabase.save(shogun);
        printResult(current == expected, "saveTestSucceed");
    }

    public void saveTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        long expected = 10;
        long current = bookDatabase.save(shogun);
        printResult(current != expected, "saveTestFailed");
    }

    public void deleteByIdTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        boolean expected = true;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete((long) 1);
        printResult(current == expected, "deleteByIdTestSucceed");
    }

    public void deleteByIdTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        boolean expected = false;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete((long) 2);
        printResult(current == expected, "deleteByIdTestFailed");
    }

    public void deleteByBookTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");

        boolean expected = true;
        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        boolean current = bookDatabase.delete(shogun);
        printResult(current == expected, "deleteByBookTestSucceed");
    }

    public void deleteByBookTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");

        boolean expected = false;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete(taipan);
        printResult(current == expected, "deleteByBookTestFailed");
    }

    public void findByIdTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);

        Optional<Book> expected = Optional.of(taipan);
        Optional<Book> current = bookDatabase.findById((long) 2);

        printResult(current.equals(expected), "findByIdTestSucceed");
    }

    public void findByIdTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        bookDatabase.save(shogun);

        Optional<Book> expected = Optional.empty();
        Optional<Book> current = bookDatabase.findById((long) 2);

        printResult(current.equals(expected), "findByIdTestFailed");
    }

    public void findByAuthorTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(taipan);

        List<Book> current = bookDatabase.findByAuthor("Клавелл");

        printResult(current.equals(expected), "findByIdTestSucceed");
    }

    public void findByAuthorTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(taipan);

        List<Book> current = bookDatabase.findByAuthor("Роберт");

        printResult(!current.equals(expected), "findByIdTestFailed");
    }

}
