package student_oksana_tarasova.lesson_10.level_2;

import java.util.*;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.saveTest();
        test.deleteByBookIdTest();
        test.notDeleteByBookIdTest1();
        test.deleteBookTest1();
        test.notDeleteBookTest1();
        test.findBookByIdTest1();
        test.notFindBookByIdTest1();
    }

    public void saveTest() {
        List<Book> books = new ArrayList();
        Book book = new Book("Ivanov", "Kvaksha");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        long realResult = bookDatabase.save(book);
        long expectedResult = 1L;
        check(realResult == expectedResult, "save test");
    }

    public void deleteByBookIdTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.delete(1L);
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 1;
        check(realResult == expectedResult, "delete by id");
    }


    public void notDeleteByBookIdTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.delete(3L);
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 2;
        check(realResult == expectedResult, " not delete by id");
    }

    public void deleteBookTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.delete(book);
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 1;
        check(realResult == expectedResult, "delete book");
    }

    public void notDeleteBookTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        Book book3 = new Book("Sidorov", "More");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.delete(book3);
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 2;
        check(realResult == expectedResult, "not delete book");
    }
    public void findBookByIdTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        Optional<Book> realResult =  bookDatabase.findById(1L);
        Optional<Book> expectedResult = Optional.of(book);
        check(realResult.equals(expectedResult), "find Book By Id");
    }

    public void notFindBookByIdTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        Optional<Book> realResult =  bookDatabase.findById(3L);
        Optional<Book> expectedResult = Optional.empty();
        check(realResult.equals(expectedResult), "not find Book By Id");
    }

    public void findByAuthorTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Ivanov", "Kvaksha");
        Book book1 = new Book("Petrov", "Pole");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        List<Book> realResult =  bookDatabase.findByAuthor("Ivanov");
        List<Book> expectedResult = ArrayList<Book> ;
        check(realResult.equals(expectedResult), "not find Book By Id");
    }



    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }


}
