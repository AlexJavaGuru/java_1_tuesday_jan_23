package student_nikita_visnakovs.lesson_9.level_5;

import java.util.List;

public interface BookReader {

    boolean addBook(Book book);

    boolean hasTitleAndAuthor(Book book);

    boolean deleteBook(Book book);

    String[] getListOfAllBooks();

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    boolean markAsRead(Book book);

    boolean markAsUnread(Book book);

    List<String> getListOfAllReadBooks();

    List<String> getListOfAllUnreadBooks();
}
