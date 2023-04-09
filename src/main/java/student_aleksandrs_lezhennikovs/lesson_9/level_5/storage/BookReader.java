package student_aleksandrs_lezhennikovs.lesson_9.level_5.storage;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;

import java.util.List;

public interface BookReader {
    void add(BookEntity book);

    void delete(BookEntity book);

    boolean notExistBook(BookEntity book);

    boolean notNullsTitleAuthor(BookEntity book);

    List<BookEntity> getAll();
    List<BookEntity> searchByAuthor(String author);
    List<BookEntity> searchByAuthorLetters(String partOfAuthorName);
    List<BookEntity> searchByTitle(String title);
    List<BookEntity> searchByTitleLetters(String partOfWord);
    void markAsRead(long bookId);
    void markAsUnread(long bookId);
    List<BookEntity> returnUnreadBooks();
    List<BookEntity> returnReadBooks();
}
