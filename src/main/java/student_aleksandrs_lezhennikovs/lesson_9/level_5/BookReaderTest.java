package student_aleksandrs_lezhennikovs.lesson_9.level_5;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.*;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByAuthorLettersService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByAuthorService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByTitlePartService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByTitleService;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReaderImpl;

import java.util.ArrayList;
import java.util.List;

class BookReaderTest {
    public static void main(String[] args) {
        ExistBookTest();
        notExistBookTest();
        nullBookAddTest();
        nullAuthorAddTest();
        nullTitleAddTest();
        testDeleteNotExistBook();
        testGetAllBooks();
        testSearchByAuthor();
        testSearchByAuthorLetters();
        testSearchByTitle();
        testSearchByTitlePart();
        testMarkReadBook();
        testUnMarkReadBook();
        testOnlyMarkedAsRead();
        testOnlyUnMarkedReadBooks();
    }

    private static void ExistBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity theSameBook = new BookEntity("Lāčplēsis", "Andrejs Pumpurs");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        boolean expectedResult = false;
        boolean calculatedResult = bookReader.notExistBook(theSameBook);
        check("Existing book ", expectedResult, calculatedResult);
    }
    private static void notExistBookTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity theSameBook = new BookEntity("New Book", "New Author");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        boolean expectedResult = true;
        boolean calculatedResult = bookReader.notExistBook(theSameBook);
        check("Not Existing book ", expectedResult, calculatedResult);
    }

    private static void nullBookAddTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        bookReader.add(firstBook);
        BookEntity nullBook = null;
        boolean expectedResult = false;
        boolean calculatedResult = bookReader.notNullBook(nullBook);
        check("Null book add", expectedResult, calculatedResult);
    }

    private static void nullAuthorAddTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        bookReader.add(firstBook);
        BookEntity nullBook = new BookEntity("New Book", null);
        boolean expectedResult = false;
        boolean calculatedResult = bookReader.notNullsTitleAuthor(nullBook);
        check("Null Author add", expectedResult, calculatedResult);
    }

    private static void nullTitleAddTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        bookReader.add(firstBook);
        BookEntity nullBook = new BookEntity(null, "Some Author");
        boolean expectedResult = false;
        boolean calculatedResult = bookReader.notNullsTitleAuthor(nullBook);
        check("Null Title add", expectedResult, calculatedResult);
    }

    private static void testDeleteNotExistBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        DeleteService deleteService = new DeleteService(bookReader);
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "New Author");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        boolean expectedResult = true;
        boolean actualResult = deleteService.checkBookBeforeDelete(thirdBook);
        check("Delete not exist book", expectedResult, actualResult);
    }

    private static void testGetAllBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        GetAllService getAllBooks = new GetAllService(bookReader);
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "New Author");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        List<BookEntity> actualResult = getAllBooks.getAllBooks();
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(firstBook);
        etalonList.add(secondBook);
        etalonList.add(thirdBook);
        check("Get all books", etalonList, actualResult);
    }

    private static void testSearchByAuthor() {
        BookReaderImpl bookReader = new BookReaderImpl();
        SearchByAuthorService actualList = new SearchByAuthorService(bookReader);
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "John Doe");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        List<BookEntity> actualResult = actualList.searchByAuthor("John Doe");
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(firstBook);
        etalonList.add(thirdBook);
        check("Search by Author", etalonList, actualResult);
    }

    private static void testSearchByAuthorLetters() {
        BookReaderImpl bookReader = new BookReaderImpl();
        SearchByAuthorLettersService actualList = new SearchByAuthorLettersService(bookReader);
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "John Doe");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        List<BookEntity> actualResult = actualList.searchByAuthorLetters("Joh");
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(firstBook);
        etalonList.add(thirdBook);
        check("Search by Author first letters", etalonList, actualResult);
    }

    private static void testSearchByTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        SearchByTitleService actualList = new SearchByTitleService(bookReader);
        BookEntity firstBook = new BookEntity("Lāčplēsis", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "John Doe");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        List<BookEntity> actualResult = actualList.searchByTitle("Lāčplēsis");
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(firstBook);
        etalonList.add(secondBook);
        check("Search by Title", etalonList, actualResult);
    }

    private static void testSearchByTitlePart() {
        BookReaderImpl bookReader = new BookReaderImpl();
        SearchByTitlePartService actualList = new SearchByTitlePartService(bookReader);
        BookEntity firstBook = new BookEntity("Lāčplēsis", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "John Doe");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        List<BookEntity> actualResult = actualList.searchByTitlePart("Lāč");
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(firstBook);
        etalonList.add(secondBook);
        check("Search by Title part of word", etalonList, actualResult);
    }

    private static void testMarkReadBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        MarkBookAsReadService markReadService = new MarkBookAsReadService(bookReader);
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        boolean expectedResult = true;
        markReadService.markBookAsRaed(11L);
        boolean actualResult = secondBook.getIsRead();
        check("Mark read book", expectedResult, actualResult);
    }

    private static void testUnMarkReadBook() {
        BookReaderImpl bookReader = new BookReaderImpl();
        MarkBookAsReadService markReadService = new MarkBookAsReadService(bookReader);
        UnreadMarkBookService unMarkReadService = new UnreadMarkBookService(bookReader);
        BookEntity firstBook = new BookEntity("Nemo book", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        boolean expectedResult = false;
        markReadService.markBookAsRaed(11L);
        unMarkReadService.unreadMarkBook(11L);
        boolean actualResult = secondBook.getIsRead();
        check("UnMark read book", expectedResult, actualResult);
    }

    private static void testOnlyMarkedAsRead() {
        BookReaderImpl bookReader = new BookReaderImpl();
        GetReadBooksService actualList = new GetReadBooksService(bookReader);
        MarkBookAsReadService markReadService = new MarkBookAsReadService(bookReader);
        BookEntity firstBook = new BookEntity("None", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "John Doe");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        markReadService.markBookAsRaed(11L);
        markReadService.markBookAsRaed(12L);
        List<BookEntity> actualResult = actualList.returnReadBooks();
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(secondBook);
        etalonList.add(thirdBook);
        check("Get only books marked as read", etalonList, actualResult);
    }

    private static void testOnlyUnMarkedReadBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        GetUnreadBooksService actualList = new GetUnreadBooksService(bookReader);
        MarkBookAsReadService markReadService = new MarkBookAsReadService(bookReader);
        BookEntity firstBook = new BookEntity("None", "John Doe");
        BookEntity secondBook = new BookEntity("Lāčplēsis","Andrejs Pumpurs");
        BookEntity thirdBook = new BookEntity("New Book", "John Doe");
        bookReader.add(firstBook);
        bookReader.add(secondBook);
        bookReader.add(thirdBook);
        markReadService.markBookAsRaed(11L);
        markReadService.markBookAsRaed(12L);
        List<BookEntity> actualResult = actualList.returnUnreadBooks();
        List<BookEntity> etalonList = new ArrayList<>();
        etalonList.add(firstBook);
        check("Get only books marked as unread", etalonList, actualResult);
    }

    private static void check(String actionName, boolean expect, boolean actual) {
        if (expect == actual) {
            System.out.println(actionName + " test has Passed");
        } else {
            System.out.println(actionName + " test has Failed");
        }
    }

    private static void check(String actionName, List<BookEntity> expect, List<BookEntity> actual) {
        if (expect.equals(actual)) {
            System.out.println(actionName + " test has Passed");
        } else {
            System.out.println(actionName + " test has Failed");
        }
    }
}
