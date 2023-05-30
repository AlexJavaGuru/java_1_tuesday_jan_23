package student_dmitry_kupcus.lesson_9.level_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BookReaderImplTest {
    BookReaderImpl bookReader = new BookReaderImpl();


    @Test
    void testAddBookTrue() {
        Book book = new Book("Война и Мир", "Толстой");
        boolean expectedResult = true;
        boolean actualResult = bookReader.addBook(book);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testAddBookFalse() {
        Book book = new Book("Война и Мир", "Толстой");
        boolean expectedResult = false;
        bookReader.addBook(book);
        boolean actualResult = bookReader.addBook(book);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testAddNullBook() {
        Book book = new Book(null, null);
        boolean expectedResult = false;
        boolean actualResult = bookReader.addBook(book);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testDeleteBook() {
        Book book = new Book("Война и Мир", "Толстой");
        boolean expectedResult = true;
        boolean actualResult = bookReader.deleteBook(book);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testShowAllBooks() {
        Book book = new Book("Война и Мир", "Толстой");
        Book book2 = new Book("Ромео и Джульетта", "Шекспир");
        Book book3 = new Book("Пророк", "Пушкин");
        bookReader.addBook(book);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        String expectedResult = "Шекспир: Ромео и Джульетта, Пушкин: Пророк, Толстой: Война и Мир";
        String actualResult = bookReader.showAllBooks();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testFindAuthorTrue() {
        Book book = new Book("Война и Мир", "Толстой");
        Book book2 = new Book("Ромео и Джульетта", "Шекспир");
        Book book3 = new Book("Пророк", "Пушкин");
        bookReader.addBook(book);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean expectedResult = true;
        boolean actualResult = bookReader.finByAuthorName("Толстой");
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testFindAuthorFalse() {
        Book book = new Book("Война и Мир", "Толстой");
        Book book2 = new Book("Ромео и Джульетта", "Шекспир");
        Book book3 = new Book("Пророк", "Пушкин");
        bookReader.addBook(book);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean expectedResult = false;
        boolean actualResult = bookReader.finByAuthorName("Чехов");
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testFindByBookName() {
        Book book = new Book("Война и Мир", "Толстой");
        Book book2 = new Book("Анна Каренина", "Толстой");
        Book book3 = new Book("Детство", "Толстой");
        bookReader.addBook(book);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean expectedResult = true;
        boolean actualResult = bookReader.findByBookName("Детство");
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMarkAsRead() {
        Book book = new Book("Война и Мир", "Толстой");
        Book book2 = new Book("Анна Каренина", "Толстой");
        Book book3 = new Book("Детство", "Толстой");
        bookReader.addBook(book);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean expectedResult = true;
        boolean actualResult = bookReader.markAsRead(book, "Детство");
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testMarkAsUnread() {
        Book book = new Book("Война и Мир", "Толстой");
        Book book2 = new Book("Анна Каренина", "Толстой");
        Book book3 = new Book("Детство", "Толстой");
        bookReader.addBook(book);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        boolean expectedResult = false;
        boolean actualResult = bookReader.markAsUnread(book, "Детство");
        Assertions.assertEquals(expectedResult, actualResult);
    }


}