package student_oksana_tarasova.lesson_10.level_2;

import student_oksana_tarasova.lesson_10.level_3.AuthorSearchCriteria;
import student_oksana_tarasova.lesson_10.level_3.TitleSearchCriteria;
import student_oksana_tarasova.lesson_10.level_3.YearOfIssueSearchCriteria;

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
        test.findByAuthorTest();
        test.findByTitleTest();
        test.countAllBooksTest();
        test.deleteByAuthorTest1();
        test.notDeleteByAuthorTest1();
        test.deleteByTitleTest1();
        test.notDeleteByTitleTest1();
        test.searchCriteriaTest();
        test.searchCriteriaTest1();
        test.searchCriteriaTest2();
        test.searchCriteriaTest3();
        test.searchCriteriaTest4();
        test.searchCriteriaTest5();
        test.findUniqueAuthorsTest();
        test.findUniqueTitlesTest();
        test.findUniqueBooksTest();
        test.containsTest();
        test.notContainsTest();
        test.getAuthorToBooksMap();
        test.getEachAuthorBookCount();
    }

    public void saveTest() {
        List<Book> books = new ArrayList();
        Book book = new Book("Kvaksha", "Ivanov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        long realResult = bookDatabase.save(book);
        long expectedResult = 1L;
        check(realResult == expectedResult, "save test");
    }

    public void deleteByBookIdTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
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
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
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
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
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
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        Book book3 = new Book("More", "Sidorov");
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
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        Optional<Book> realResult = bookDatabase.findById(1L);
        Optional<Book> expectedResult = Optional.of(book);
        check(realResult.equals(expectedResult), "find Book By Id");
    }

    public void notFindBookByIdTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        Optional<Book> realResult = bookDatabase.findById(3L);
        Optional<Book> expectedResult = Optional.empty();
        check(realResult.equals(expectedResult), "not find Book By Id");
    }

    public void findByAuthorTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        Book book2 = new Book("More", "Ivanov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        List<Book> realResult = bookDatabase.findByAuthor("Ivanov");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book2);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "find Book By author");
    }

    public void findByTitleTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        Book book2 = new Book("More", "Ivanov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        List<Book> realResult = bookDatabase.findByTitle("More");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "find Book By Title");
    }

    public void countAllBooksTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        Book book2 = new Book("More", "Ivanov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        int realResult = bookDatabase.countAllBooks();
        int expectedResult = 3;
        check(realResult == expectedResult, "count all books");
    }

    public void deleteByAuthorTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.deleteByAuthor("Ivanov");
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 1;
        check(realResult == expectedResult, "delete by author");
    }

    public void notDeleteByAuthorTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.deleteByAuthor("Semenov");
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 2;
        check(realResult == expectedResult, "not delete book by author");
    }

    public void deleteByTitleTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.deleteByTitle("Pole");
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 1;
        check(realResult == expectedResult, "delete by title");
    }

    public void notDeleteByTitleTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.deleteByAuthor("Seven");
        int realResult = bookDatabase.getBooks().size();
        int expectedResult = 2;
        check(realResult == expectedResult, "not delete book by title");
    }

    public void searchCriteriaTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new AuthorSearchCriteria("Ivanov"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "search criteria author");
    }

    public void searchCriteriaTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new AuthorSearchCriteria("Vern"));
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "search criteria not author");
    }

    public void searchCriteriaTest2() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new TitleSearchCriteria("Pole"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book4);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "search criteria title");
    }

    public void searchCriteriaTest3() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new TitleSearchCriteria("Sky"));
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "search criteria not title");
    }

    public void searchCriteriaTest4() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new YearOfIssueSearchCriteria("2000"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book4);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "search criteria yearOfIssue");
    }

    public void searchCriteriaTest5() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new YearOfIssueSearchCriteria("2001"));
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "search criteria not yearOfIssue");
    }

    public void findUniqueAuthorsTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Ivanov");
        expectedResult.add("Petrov");
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "findUniqueAuthors");
    }

    public void findUniqueTitlesTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Kvaksha");
        expectedResult.add("Pole");
        expectedResult.add("More");
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "findUniqueTitles");
    }

    public void findUniqueBooksTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1990");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book);
        expectedResult.add(book1);
        expectedResult.add(book2);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "findUniqueBooks");
    }

    public void containsTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.contains(new Book("Pole", "Petrov", "2000"));
        boolean expectedResult = true;
        check(expectedResult == realResult, "contains Book");
    }

    public void notContainsTest() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.contains(new Book("More", "Ivanov", "2000"));
        boolean expectedResult = false;
        check(expectedResult == realResult, "not contains Book");
    }

    public void getAuthorToBooksMap() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2001");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1980");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Map<String, List<Book>> map = bookDatabase.getAuthorToBooksMap();
        List<Book> realResult = map.get("Ivanov");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(expectedResult.containsAll(realResult) && expectedResult.containsAll(realResult), "map author to books");
    }

    public void getEachAuthorBookCount() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov", "1990");
        Book book1 = new Book("Pole", "Petrov", "2001");
        Book book2 = new Book("More", "Ivanov", "2000");
        Book book3 = new Book("Kvaksha", "Ivanov", "1980");
        Book book4 = new Book("Pole", "Petrov", "2000");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Map<String, Integer> map = bookDatabase.getEachAuthorBookCount();
        int realResult = map.get("Ivanov");
        int expectedResult = 3;
        check(expectedResult == realResult, "map count author to books");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
