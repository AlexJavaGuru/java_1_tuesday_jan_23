package student_aleksandrs_lezhennikovs.lesson_9.level_5.storage;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.storage.BookReader;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    private long bookId = 10L;
    private List<BookEntity> bookDatabase = new ArrayList<>();
    @Override
    public void add(BookEntity book) {
        if (allChecks(book)) {
            book.setBookId(bookId);
            bookId++;
            bookDatabase.add(book);
        }
    }

    @Override
    public void delete(BookEntity book) {
        bookDatabase.remove(book);
    }

    @Override
    public boolean notNulls(BookEntity checkBook) {
        return checkBook.getAuthor() != null && checkBook.getTitle() != null &&
                !checkBook.getAuthor().equals("") && !checkBook.getTitle().equals("");
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookId=" + bookId +
                ", bookDatabase=" + bookDatabase +
                '}';
    }

    private boolean isEmptyBookDatabase(List<BookEntity> bookDatabase) {
        return bookDatabase.size() == 0;
    }
    private boolean checkTitleAuthor(BookEntity book, BookEntity newBook) {
        return book.getTitle().equals(newBook.getTitle()) && book.getAuthor().equals(newBook.getAuthor());
    }

    @Override
    public boolean notExistBook(BookEntity newBook) {
        for (BookEntity book : bookDatabase) {
            if (checkTitleAuthor(book, newBook)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<BookEntity> getAll() {
        return bookDatabase;
    }

    private boolean allChecks(BookEntity book) {
        return (isEmptyBookDatabase(bookDatabase) || notExistBook(book)) && notNulls(book);
    }
}
