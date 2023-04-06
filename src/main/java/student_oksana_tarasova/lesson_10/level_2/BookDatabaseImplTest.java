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
        boolean realResult1 = bookDatabase.contains(new Book("Kvaksha", "Ivanov"));
        check(!realResult1, "delete by id book");
    }


    public void notDeleteByBookIdTest1() {
        List<Book> books = new ArrayList<>();
        Book book = new Book("Kvaksha", "Ivanov");
        Book book1 = new Book("Pole", "Petrov");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(books);
        bookDatabase.save(book);
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.delete(3L);
        boolean expectedResult = false;
        check(realResult == expectedResult, "not delete by id");
    }

    public void deleteBookTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        bookDatabase.delete(new Book("Kvaksha", "Ivanov", "1990"));
        boolean realResult1 = bookDatabase.contains(new Book("Kvaksha", "Ivanov", "1990"));
        check(!realResult1, "book not contains");
    }

    public void notDeleteBookTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        bookDatabase.delete(new Book("Kvaksha", "Vern", "1990"));
        boolean realResult = bookDatabase.contains(new Book("Kvaksha", "Vern", "1990"));
        check(!realResult, "not delete book");
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
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        Optional<Book> realResult = bookDatabase.findById(9L);
        Optional<Book> expectedResult = Optional.empty();
        check(realResult.equals(expectedResult), "not find Book By Id");
    }

    public void findByAuthorTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.findByAuthor("Ivanov");
        List<Book> expectedResult = List.of(
                new Book("Kvaksha", "Ivanov", "1990"),
                new Book("More", "Ivanov", "2000"),
                new Book("Kvaksha", "Ivanov", "1980"),
                new Book("More", "Ivanov", "2000"),
                new Book("Kvaksha", "Ivanov", "1980")
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "find Book By author");
    }

    public void findByTitleTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.findByTitle("More");
        List<Book> expectedResult = List.of(
                new Book("More", "Ivanov", "2000"),
                new Book("More", "Ivanov", "2000")
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "find Book By Title");
    }

    public void countAllBooksTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        int realResult = bookDatabase.countAllBooks();
        int expectedResult = 8;
        check(realResult == expectedResult, "count all books");
    }

    public void deleteByAuthorTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        bookDatabase.deleteByAuthor("Ivanov");
        List<Book> realResult = bookDatabase.findByAuthor("Ivanov");
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "book not contains");
    }

    public void notDeleteByAuthorTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        bookDatabase.deleteByAuthor("Semenov");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>(saveBook());
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "not delete book by author");

    }

    public void deleteByTitleTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        bookDatabase.deleteByTitle("Pole");
        List<Book> realResult = bookDatabase.findByTitle("Pole");
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "delete by title");
    }

    public void notDeleteByTitleTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        bookDatabase.deleteByTitle("Ovod");
        boolean realResult1 = bookDatabase.contains(new Book("Ovod", "Voinich", "1990"));
        check(!realResult1, "not delete book by title");
    }

    public void searchCriteriaTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.find(new AuthorSearchCriteria("Ivanov"));
        List<Book> expectedResult = List.of(
                new Book("Kvaksha", "Ivanov", "1990"),
                new Book("More", "Ivanov", "2000"),
                new Book("Kvaksha", "Ivanov", "1980"),
                new Book("More", "Ivanov", "2000"),
                new Book("Kvaksha", "Ivanov", "1980")
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "search criteria author");
    }

    public void searchCriteriaTest1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.find(new AuthorSearchCriteria("Vern"));
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "search criteria not author");
    }

    public void searchCriteriaTest2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.find(new TitleSearchCriteria("Pole"));
        List<Book> expectedResult = List.of(
                new Book("Pole", "Petrov", "2001"),
                new Book("Pole", "Petrov", "2000"),
                new Book("Pole", "Petrov", "2001")
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "search criteria title");
    }

    public void searchCriteriaTest3() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.find(new TitleSearchCriteria("Sky"));
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "search criteria not title");
    }

    public void searchCriteriaTest4() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.find(new YearOfIssueSearchCriteria("1980"));
        List<Book> expectedResult = List.of(
                new Book("Kvaksha", "Ivanov", "1980"),
                new Book("Kvaksha", "Ivanov", "1980")
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "search criteria yearOfIssue");
    }

    public void searchCriteriaTest5() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        List<Book> realResult = bookDatabase.find(new YearOfIssueSearchCriteria("2002"));
        List<Book> expectedResult = new ArrayList<>();
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "search criteria not yearOfIssue");
    }

    public void findUniqueAuthorsTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = Set.of(
                "Ivanov",
                "Petrov"
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "findUniqueAuthors");
    }

    public void findUniqueTitlesTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = Set.of(
                "Kvaksha",
                "Pole",
                "More"
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "findUniqueTitles");
    }

    public void findUniqueBooksTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = Set.of(
                new Book("Kvaksha", "Ivanov", "1990"),
                new Book("Pole", "Petrov", "2001"),
                new Book("More", "Ivanov", "2000"),
                new Book("Kvaksha", "Ivanov", "1980"),
                new Book("Pole", "Petrov", "2000")
        );
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "findUniqueBooks");
    }

    public void containsTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        boolean realResult = bookDatabase.contains(new Book("Pole", "Petrov", "2000"));
        boolean expectedResult = true;
        check(expectedResult == realResult, "contains Book");
    }

    public void notContainsTest() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        boolean realResult = bookDatabase.contains(new Book("Sandal", "Ivanov", "2000"));
        boolean expectedResult = false;
        check(expectedResult == realResult, "not contains Book");
    }

    public void getAuthorToBooksMap() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        Map<String, List<Book>> map = bookDatabase.getAuthorToBooksMap();
        List<Book> realResult = map.get("Ivanov");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("Kvaksha", "Ivanov", "1990"));
        expectedResult.add(new Book("More", "Ivanov", "2000"));
        expectedResult.add(new Book("Kvaksha", "Ivanov", "1980"));
        check(expectedResult.containsAll(realResult) && realResult.containsAll(expectedResult), "map author to books");
    }

    public void getEachAuthorBookCount() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl(saveBook());
        Map<String, Integer> map = bookDatabase.getEachAuthorBookCount();
        int realResult = map.get("Ivanov");
        int expectedResult = 5;
        check(expectedResult == realResult, "map count author to books");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }

    public static List<Book> saveBook() {
        List<Book> books = new ArrayList<>();
        books.add(0, new Book("Kvaksha", "Ivanov", "1990"));
        books.add(1, new Book("Pole", "Petrov", "2001"));
        books.add(2, new Book("More", "Ivanov", "2000"));
        books.add(3, new Book("Kvaksha", "Ivanov", "1980"));
        books.add(4, new Book("Pole", "Petrov", "2000"));
        books.add(5, new Book("Pole", "Petrov", "2001"));
        books.add(6, new Book("More", "Ivanov", "2000"));
        books.add(7, new Book("Kvaksha", "Ivanov", "1980"));
        return books;
    }
}
