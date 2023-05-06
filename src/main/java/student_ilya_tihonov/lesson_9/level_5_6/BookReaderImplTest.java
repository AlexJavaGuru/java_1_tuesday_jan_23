package student_ilya_tihonov.lesson_9.level_5_6;

import java.util.Arrays;
import java.util.List;

public class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest bookReaderImplTest = new BookReaderImplTest();
        bookReaderImplTest.testnewBook();
        bookReaderImplTest.testAddBookWithoutTitle();
        bookReaderImplTest.testAddBookWithoutAuthor();
        bookReaderImplTest.testRemoveBook();
        bookReaderImplTest.testListBooksEmptyLibrary();
        bookReaderImplTest.testListBooksNonEmptyLibrary();
        bookReaderImplTest.testSearchBooksByAuthor();
        bookReaderImplTest.testSearchBooksByFullAuthorName();
        bookReaderImplTest.testSearchBooksByTitle();
        bookReaderImplTest.testSearchBooksByTitleStartingWith();
        bookReaderImplTest.testMarkBookAsRead();
        bookReaderImplTest.testMarkBookAsUnread();
        bookReaderImplTest.testListReadBooks();
    }

    public void testnewBook() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");

        boolean added = bookReaderImpl.newBook(book1);
        if (!added) {
            System.out.println("Failed to add book1");
        }

        added = bookReaderImpl.newBook(book1);
        if (added) {
            System.out.println("Failed to detect duplicate book1");
        }

        added = bookReaderImpl.newBook(book2);
        if (!added) {
            System.out.println("Failed to add book2");
        }

        Book book3 = new Book("Title1", "Author1");
        added = bookReaderImpl.newBook(book3);
        if (added) {
            System.out.println("Failed to detect duplicate book3");
        }
    }

    public void testAddBookWithoutTitle() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book(null, "Author1");

        boolean added = bookReaderImpl.newBook(book1);
        if (added) {
            System.out.println("Failed to detect book without title");
        }
    }

    public void testAddBookWithoutAuthor() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", null);

        boolean added = bookReaderImpl.newBook(book1);
        if (added) {
            System.out.println("Failed to detect book without author");
        }
    }

    public void testRemoveBook() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        bookReaderImpl.newBook(book1);

        boolean removed = bookReaderImpl.removeBook(book1);
        if (!removed) {
            System.out.println("Failed to remove book1");
        }

        removed = bookReaderImpl.removeBook(book1);
        if (removed) {
        }
    }

    public void testListBooksEmptyLibrary() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        String[] bookList = bookReaderImpl.listBooks();

        if (bookList.length != 0) {
            System.out.println("Failed to list books in empty library");
        }
    }

    public void testListBooksNonEmptyLibrary() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);

        String[] bookList = bookReaderImpl.listBooks();
        if (bookList.length != 2) {
            System.out.println("Failed to list books in non-empty library");
        }

        if (!bookList[0].equals("Title1 [Author1]")) {
            System.out.println("Failed to list correct book 1");
        }

        if (!bookList[1].equals("Title2 [Author2]")) {
            System.out.println("Failed to list correct book 2");
        }
    }

    public void testSearchBooksByAuthor() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        Book book3 = new Book("Title3", "Author1");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);
        bookReaderImpl.newBook(book3);

        String[] booksByAuthor1 = bookReaderImpl.searchBooksByAuthor("Author1");
        String[] booksByAuthor2 = bookReaderImpl.searchBooksByAuthor("Author2");

        if (booksByAuthor1.length != 2) {
            System.out.println("Failed to list correct number of books for Author1");
        }

        if (!booksByAuthor1[0].equals("Title1 [Author1]")) {
            System.out.println("Failed to list correct book 1 for Author1");
        }

        if (!booksByAuthor1[1].equals("Title3 [Author1]")) {
            System.out.println("Failed to list correct book 2 for Author1");
        }

        if (booksByAuthor2.length != 1) {
            System.out.println("Failed to list correct number of books for Author2");
        }

        if (!booksByAuthor2[0].equals("Title2 [Author2]")) {
            System.out.println("Failed to list correct book for Author2");
        }
    }

    public void testSearchBooksByFullAuthorName() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        Book book3 = new Book("Title3", "Author1");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);
        bookReaderImpl.newBook(book3);

        String[] booksByAuthor1 = bookReaderImpl.searchBooksByFullAuthorName("Author1");
        String[] booksByAuthor2 = bookReaderImpl.searchBooksByFullAuthorName("Author2");
        String[] booksByAuthor3 = bookReaderImpl.searchBooksByFullAuthorName("Author3");

        if (booksByAuthor1.length != 2) {
            System.out.println("Failed to list correct number of books for Author1");
        }

        if (!booksByAuthor1[0].equals("Title1 [Author1]")) {
            System.out.println("Failed to list correct book 1 for Author1");
        }

        if (!booksByAuthor1[1].equals("Title3 [Author1]")) {
            System.out.println("Failed to list correct book 2 for Author1");
        }

        if (booksByAuthor2.length != 1) {
            System.out.println("Failed to list correct number of books for Author2");
        }

        if (!booksByAuthor2[0].equals("Title2 [Author2]")) {
            System.out.println("Failed to list correct book for Author2");
        }

        if (booksByAuthor3.length != 0) {
            System.out.println("Failed to list correct number of books for Author3");
        }
    }

    public void testSearchBooksByTitle() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        Book book3 = new Book("The Title", "Author3");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);
        bookReaderImpl.newBook(book3);

        String[] booksByTitle1 = bookReaderImpl.searchBooksByTitle("Title1");
        String[] booksByTitle2 = bookReaderImpl.searchBooksByTitle("The Title");
        String[] booksByTitle3 = bookReaderImpl.searchBooksByTitle("Non-existent Title");

        if (booksByTitle1.length != 1) {
            System.out.println("Failed to list correct number of books for Title1");
        }

        if (!booksByTitle1[0].equals("Title1 [Author1]")) {
            System.out.println("Failed to list correct book for Title1");
        }

        if (booksByTitle2.length != 1) {
            System.out.println("Failed to list correct number of books for The Title");
        }

        if (!booksByTitle2[0].equals("The Title [Author3]")) {
            System.out.println("Failed to list correct book for The Title");
        }

        if (booksByTitle3.length != 0) {
            System.out.println("Failed to list correct number of books for non-existent title");
        }
    }

    public void testSearchBooksByTitleStartingWith() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("AnotherTitle", "Author2");
        Book book3 = new Book("Title3", "Author1");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);
        bookReaderImpl.newBook(book3);

        String[] booksStartingWithTi = bookReaderImpl.searchBooksByTitleStartingWith("Ti");
        String[] booksStartingWithAn = bookReaderImpl.searchBooksByTitleStartingWith("An");
        String[] booksStartingWithNonexistentTitle = bookReaderImpl.searchBooksByTitleStartingWith("NonexistentTitle");

        if (booksStartingWithTi.length != 2) {
            System.out.println("Failed to list correct number of books starting with 'Ti'");
        }

        if (!booksStartingWithTi[0].equals("Title1 [Author1]")) {
            System.out.println("Failed to list correct book 1 starting with 'Ti'");
        }

        if (!booksStartingWithTi[1].equals("Title3 [Author1]")) {
            System.out.println("Failed to list correct book 2 starting with 'Ti'");
        }

        if (booksStartingWithAn.length != 1) {
            System.out.println("Failed to list correct number of books starting with 'An'");
        }

        if (!booksStartingWithAn[0].equals("AnotherTitle [Author2]")) {
            System.out.println("Failed to list correct book starting with 'An'");
        }

        if (booksStartingWithNonexistentTitle.length != 0) {
            System.out.println("Failed to return empty list for nonexistent title");
        }
    }

    public void testMarkBookAsRead() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);

        boolean markedAsRead = bookReaderImpl.markBookAsRead(book1);
        if (!markedAsRead) {
            System.out.println("Failed to mark book as read");
        }

        String[] bookList = bookReaderImpl.listBooks();
        if (!bookList[0].equals("Title1 [Author1] (Read)")) {
            System.out.println("Failed to list correct book as read");
        }

        markedAsRead = bookReaderImpl.markBookAsRead(book1);
        if (markedAsRead) {
            System.out.println("Failed to detect book already marked as read");
        }

        markedAsRead = bookReaderImpl.markBookAsRead(book2);
        if (!markedAsRead) {
            System.out.println("Failed to mark book as read");
        }

        bookList = bookReaderImpl.listBooks();
        if (!bookList[1].equals("Title2 [Author2] (Read)")) {
            System.out.println("Failed to list correct book as read");
        }
    }

    public void testMarkBookAsUnread() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        bookReaderImpl.newBook(book1);
        bookReaderImpl.newBook(book2);
        bookReaderImpl.markBookAsRead(book1);
        bookReaderImpl.markBookAsRead(book2);

        boolean markedAsUnread = bookReaderImpl.markBookAsUnread(book1);
        if (!markedAsUnread) {
            System.out.println("Failed to mark book1 as unread");
        }

        markedAsUnread = bookReaderImpl.markBookAsUnread(book2);
        if (!markedAsUnread) {
            System.out.println("Failed to mark book2 as unread");
        }

        markedAsUnread = bookReaderImpl.markBookAsUnread(book2);
        if (markedAsUnread) {
            System.out.println("Failed to detect already unread book2");
        }

        String[] bookList = bookReaderImpl.listBooks();
        if (!bookList[0].equals("Title1 [Author1] (unread)")) {
            System.out.println("Failed to list book1 as unread");
        }

        if (!bookList[1].equals("Title2 [Author2]")) {
            System.out.println("Failed to list book2 as read");
        }
    }

    public void testListReadBooks() {
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        String[] readBooks = bookReaderImpl.listReadBooks();
        if (readBooks.length != 0) {
            System.out.println("Failed to list read books in empty library");
        }
    }


}