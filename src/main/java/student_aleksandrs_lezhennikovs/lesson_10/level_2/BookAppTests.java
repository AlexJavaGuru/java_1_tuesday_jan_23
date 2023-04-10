package student_aleksandrs_lezhennikovs.lesson_10.level_2;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.*;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindBookService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.OrderingService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.PagingService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabaseImpl;


import java.util.*;

class BookAppTests {
    public static void main(String[] args) {
        checkDeleteBiId();
        checkDeleteBook();
        checkDeleteFakeId();
        checkDeleteFakeBook();
        checkFindBookById();
        checkFindBookByFakeId();
        checkFindBookByAuthor();
        checkFindBookByFakeAuthor();
        checkFindBookByTitle();
        checkFindBookByFakeTitle();
        checkCountAllBooks();
        checkDeleteBookByAuthor();
        checkDeleteBookByFakeAuthor();
        checkDeleteBookByTitle();
        checkDeleteBookByFakeTitle();
        checkAuthorSearchCriteria();
        checkTitleSearchCriteria();
        checkYearSearchCriteria();
        checkAndSearchCriteria();
        checkOrLeftPartSearchCriteria();
        checkOrRightPartSearchCriteria();
        checkAndSearchCriteriaBooks();
        checkOrSearchCriteriaBooks();
        checkFindUniqueAuthors();
        checkFindUniqueTitles();
        checkFindUniqueBooks();
        checkContainsBooks();
        checkGetAuthorsToBooksMap();
        checkGetCountBookByAuthorMap();
        checkPagingService();
        checkOrderingByTitleService();
        checkOrderingByAuthorService();
        checkOrderingByYearService();
    }

    public static void checkDeleteBiId() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.deleteById(2L)) {
            System.out.println("Delete by Id Test has PASSED!");
        } else {
            System.out.println("Delete by Id Test has FAILED!");
        }
    }

    public static void checkDeleteFakeId() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (!bookDB.deleteById(3L)) {
            System.out.println("Delete Fake Id Test has PASSED!");
        } else {
            System.out.println("Delete Fake Id Test has FAILED!");
        }
    }

    public static void checkDeleteBook() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.deleteBook(secondBook)) {
            System.out.println("Delete book Test has PASSED!");
        } else {
            System.out.println("Delete book Test has FAILED!");
        }
    }

    public static void checkDeleteFakeBook() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        Book thirdBook = new Book("A3", "B3", 2023);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (!bookDB.deleteBook(thirdBook)) {
            System.out.println("Delete Fake book Test has PASSED!");
        } else {
            System.out.println("Delete Fake book Test has FAILED!");
        }
    }

    public static void checkFindBookById() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.findById(2L).isPresent()) {
            System.out.println("Find book by Id Test has PASSED!");
        } else {
            System.out.println("Find book by Id Test has FAILED!");
        }
    }

    public static void checkFindBookByFakeId() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (!bookDB.findById(3L).isPresent()) {
            System.out.println("Find book by Fake Id Test has PASSED!");
        } else {
            System.out.println("Find book by Fake Id Test has FAILED!");
        }
    }

    public static void checkFindBookByAuthor() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        Book thirdBook = new Book("A3", "B1", 2023);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        List<Book> result = bookDB.findByAuthor("B1");
        if (result.contains(firstBook) && result.contains(thirdBook)) {
            System.out.println("Find book by Author Test has PASSED!");
        } else {
            System.out.println("Find book by Author Test has FAILED!");
        }
    }

    public static void checkFindBookByFakeAuthor() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.findByAuthor("C").size() == 0) {
            System.out.println("Find book by Fake Author Test has PASSED!");
        } else {
            System.out.println("Find book by Fake Author Test has FAILED!");
        }
    }

    public static void checkFindBookByTitle() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.findByTitle("A2").contains(secondBook)) {
            System.out.println("Find book by Title Test has PASSED!");
        } else {
            System.out.println("Find book by Title Test has FAILED!");
        }
    }

    public static void checkFindBookByFakeTitle() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.findByTitle("C").size() == 0) {
            System.out.println("Find book by Fake Title Test has PASSED!");
        } else {
            System.out.println("Find book by Fake Title Test has FAILED!");
        }
    }

    public static void checkCountAllBooks() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        if (bookDB.countAllBooks() == 2) {
            System.out.println("Count all books Test has PASSED!");
        } else {
            System.out.println("Count all books Test has FAILED!");
        }
    }

    public static void checkDeleteBookByAuthor() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.deleteByAuthor("B2");
        if (!bookDB.getStorage().contains(secondBook)) {
            System.out.println("Delete book by Author Test has PASSED!");
        } else {
            System.out.println("Delete book by Author Test has FAILED!");
        }
    }

    public static void checkDeleteBookByFakeAuthor() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.deleteByAuthor("C");
        if (bookDB.getStorage().contains(firstBook) && bookDB.getStorage().contains(secondBook)) {
            System.out.println("Delete book by Fake Author Test has PASSED!");
        } else {
            System.out.println("Delete book by Fake Author Test has FAILED!");
        }
    }

    public static void checkDeleteBookByTitle() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.deleteByTitle("A2");
        if (!bookDB.getStorage().contains(secondBook)) {
            System.out.println("Delete book by Title Test has PASSED!");
        } else {
            System.out.println("Delete book by Title Test has FAILED!");
        }
    }

    public static void checkDeleteBookByFakeTitle() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B2", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.deleteByTitle("C");
        if (bookDB.getStorage().contains(firstBook) && bookDB.getStorage().contains(secondBook)) {
            System.out.println("Delete book by Title Test has PASSED!");
        } else {
            System.out.println("Delete book by Title Test has FAILED!");
        }
    }

    public static void checkAuthorSearchCriteria() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        bookDB.saveBook(firstBook);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("B1");
        if (authorSearchCriteria.match(firstBook)) {
            System.out.println("Author search criteria Test has PASSED!");
        } else {
            System.out.println("Author search criteria  Test has FAILED!");
        }
    }

    public static void checkTitleSearchCriteria() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        bookDB.saveBook(firstBook);
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("A1");
        if (titleSearchCriteria.match(firstBook)) {
            System.out.println("Title search criteria Test has PASSED!");
        } else {
            System.out.println("Title search criteria  Test has FAILED!");
        }
    }

    public static void checkYearSearchCriteria() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        bookDB.saveBook(firstBook);
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(2020);
        if (yearOfIssueSearchCriteria.match(firstBook)) {
            System.out.println("Year search criteria Test has PASSED!");
        } else {
            System.out.println("Year search criteria  Test has FAILED!");
        }
    }

    public static void checkAndSearchCriteria() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        bookDB.saveBook(firstBook);
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(2020);
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("A1");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria);
        if (andSearchCriteria.match(firstBook)) {
            System.out.println("And search criteria Test has PASSED!");
        } else {
            System.out.println("And search criteria  Test has FAILED!");
        }
    }

    public static void checkOrLeftPartSearchCriteria() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        bookDB.saveBook(firstBook);
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(2020);
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("C");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria);
        if (orSearchCriteria.match(firstBook)) {
            System.out.println("Or search criteria Left part Test has PASSED!");
        } else {
            System.out.println("Or search criteria Left part Test has FAILED!");
        }
    }

    public static void checkOrRightPartSearchCriteria() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        bookDB.saveBook(firstBook);
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(3000);
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("A1");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria);
        if (orSearchCriteria.match(firstBook)) {
            System.out.println("Or search criteria Right part Test has PASSED!");
        } else {
            System.out.println("Or search criteria Right part Test has FAILED!");
        }
    }

    public static void checkAndSearchCriteriaBooks() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2020);
        Book secondBook = new Book("A2", "B1", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        FindBookService findBookService = new FindBookService(bookDB);
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(2020);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("B1");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(yearOfIssueSearchCriteria, authorSearchCriteria);
        List<Book> result = findBookService.initialSearch(andSearchCriteria);
        if (result.contains(firstBook) && result.contains(secondBook)) {
            System.out.println("And search criteria for Books Test has PASSED!");
        } else {
            System.out.println("And search criteria for Books Test has FAILED!");
        }
    }

    public static void checkOrSearchCriteriaBooks() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        FindBookService findBookService = new FindBookService(bookDB);
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(2020);
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("B1");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(yearOfIssueSearchCriteria, authorSearchCriteria);
        List<Book> result = findBookService.initialSearch(orSearchCriteria);
        if (result.contains(firstBook) && result.contains(secondBook)) {
            System.out.println("Or search criteria for Books Test has PASSED!");
        } else {
            System.out.println("Or search criteria for Books Test has FAILED!");
        }
    }

    public static void checkFindUniqueAuthors() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        Book fourthBook = new Book("A3", "B1", 2000);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        Set<String> result = bookDB.findUniqueAuthors();
        if (result.contains("B1") && result.contains("B2") && result.contains("B3") && result.size() == 3) {
            System.out.println("Unique authors Test has PASSED!");
        } else {
            System.out.println("Unique authors Test has FAILED!");
        }
    }

    public static void checkFindUniqueTitles() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        Book fourthBook = new Book("A3", "B1", 2000);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        Set<String> result = bookDB.findUniqueTitles();
        if (result.contains("A1") && result.contains("A2") && result.contains("A3") && result.size() == 3) {
            System.out.println("Unique titles Test has PASSED!");
        } else {
            System.out.println("Unique titles Test has FAILED!");
        }
    }

    public static void checkFindUniqueBooks() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        Book fourthBook = new Book("A1", "B1", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        Set<Book> result = bookDB.findUniqueBooks();
        if (result.contains(firstBook) && result.contains(secondBook) && result.contains(thirdBook) && result.size() == 3) {
            System.out.println("Unique books Test has PASSED!");
        } else {
            System.out.println("Unique books Test has FAILED!");
        }
    }

    public static void checkContainsBooks() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        Book fourthBook = new Book("A1", "B1", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        Set<Book> result = bookDB.findUniqueBooks();
        if (result.contains(secondBook)) {
            System.out.println("Contains book Test has PASSED!");
        } else {
            System.out.println("Contains book Test has FAILED!");
        }
    }

    public static void checkGetAuthorsToBooksMap() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        Book fourthBook = new Book("A1", "B1", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        List<Book> listB1 = new ArrayList<>();
        listB1.add(firstBook);
        listB1.add(fourthBook);
        Map<String, List<Book>> expect = new HashMap<>();
        List<Book> listB2 = new ArrayList<>();
        listB2.add(secondBook);
        List<Book> listB3 = new ArrayList<>();
        listB3.add(thirdBook);
        expect.put("B1", listB1);
        expect.put("B2", listB2);
        expect.put("B3", listB3);
        Map<String, List<Book>> result = bookDB.getAuthorToBooksMap();
        if (result.equals(expect)) {
            System.out.println("Authors to books map Test has PASSED!");
        } else {
            System.out.println("Authors to books map Test has FAILED!");
        }
    }

    public static void checkGetCountBookByAuthorMap() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A2", "B2", 2020);
        Book thirdBook = new Book("A3", "B3", 2023);
        Book fourthBook = new Book("A1", "B1", 2021);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        Map<String, Integer> expect = new HashMap<>();
        expect.put("B1", 2);
        expect.put("B2", 1);
        expect.put("B3", 1);
        Map<String, Integer> result = bookDB.getEachAuthorBookCount();
        if (result.equals(expect)) {
            System.out.println("Count books by Author map Test has PASSED!");
        } else {
            System.out.println("ACount books by Author map Test has FAILED!");
        }
    }

    public static void checkPagingService() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        for (int i = 0; i < 8; i++) {
            bookDB.saveBook(new Book("A","B",2000));
        }
        List<Book> firstList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            firstList.add(new Book("A","B",2000));
        }
        List<Book> secondList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            secondList.add(new Book("A","B",2000));
        }
        Map<Integer, List<Book>> expect = new HashMap<>();
        Map<Integer, List<Book>> result = new HashMap<>();
        expect.put(1,firstList);
        expect.put(2, secondList);
        PagingService pagingService = new PagingService();
        result = pagingService.paging(5, bookDB.getStorage());
        if (result.equals(expect)) {
            System.out.println("Paging Test has PASSED!");
        } else {
            System.out.println("Paging Test has FAILED!");
        }
    }

    public static void checkOrderingByTitleService() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B1", 2021);
        Book secondBook = new Book("A3", "B2", 2023);
        Book thirdBook = new Book("A4", "B3", 2022);
        Book fourthBook = new Book("A2", "B4", 2020);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(fourthBook);
        OrderingService orderingService = new OrderingService();
        orderingService.ordering("byTitle", bookDB.getStorage());
        List<Book> expect = new ArrayList<>();
        expect.add(firstBook);
        expect.add(fourthBook);
        expect.add(secondBook);
        expect.add(thirdBook);
        if (bookDB.getStorage().equals(expect)) {
            System.out.println("Ordering by Title Test has PASSED!");
        } else {
            System.out.println("Ordering by Title Test has FAILED!");
        }
    }

    public static void checkOrderingByAuthorService() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B4", 2021);
        Book secondBook = new Book("A3", "B3", 2023);
        Book thirdBook = new Book("A4", "B2", 2022);
        Book fourthBook = new Book("A2", "B1", 2020);
        bookDB.saveBook(fourthBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(secondBook);
        bookDB.saveBook(firstBook);
        OrderingService orderingService = new OrderingService();
        orderingService.ordering("byTitle", bookDB.getStorage());
        List<Book> expect = new ArrayList<>();
        expect.add(firstBook);
        expect.add(fourthBook);
        expect.add(secondBook);
        expect.add(thirdBook);
        if (bookDB.getStorage().equals(expect)) {
            System.out.println("Ordering by Author Test has PASSED!");
        } else {
            System.out.println("Ordering by Author Test has FAILED!");
        }
    }

    public static void checkOrderingByYearService() {
        BookDatabaseImpl bookDB = new BookDatabaseImpl();
        Book firstBook = new Book("A1", "B4", 2021);
        Book secondBook = new Book("A3", "B3", 2023);
        Book thirdBook = new Book("A4", "B2", 2022);
        Book fourthBook = new Book("A2", "B1", 2020);
        bookDB.saveBook(fourthBook);
        bookDB.saveBook(firstBook);
        bookDB.saveBook(thirdBook);
        bookDB.saveBook(secondBook);
        OrderingService orderingService = new OrderingService();
        orderingService.ordering("byTitle", bookDB.getStorage());
        List<Book> expect = new ArrayList<>();
        expect.add(firstBook);
        expect.add(fourthBook);
        expect.add(secondBook);
        expect.add(thirdBook);
        if (bookDB.getStorage().equals(expect)) {
            System.out.println("Ordering by Year of issue Test has PASSED!");
        } else {
            System.out.println("Ordering by Year of issue Test has FAILED!");
        }
    }

}
