package student_natalja_semitseva.Lesson_9_Task_13;

import java.util.List;

public interface BookReader {
    default boolean addBook(Book book) {
        return false;
    }


    void setRead(String book);

    void deleteBook();

    boolean deleteBook(Book book);

    List<String> listOfAllBooks();
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);

    void markAsRead(Book book);
}
