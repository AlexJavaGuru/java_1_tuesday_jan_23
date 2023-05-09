package student_anastasiia_bokareva.lesson10.level2.Task6;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);

}
