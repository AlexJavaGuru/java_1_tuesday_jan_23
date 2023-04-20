package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;
import java.util.List;

public interface BookReader {

    boolean add(List<Book> books, Book newBook);

    boolean addNotNull(List<Book> books, Book newBook);

    boolean delete(List<Book> books, Book newBook);

    void printBooks(List<Book> books);

    void collectByAuthors(List<Book> books, String authorBook);

    void researchByAuthor(List<Book> books, String word);

    void collectByTitle(List<Book> books, String nameBook);

    void researchByTitle(List<Book> books, String word);

    boolean isReadBook(List<Book> books, Book book);

    boolean isUnreadBook(List<Book> books, Book book);

    void printListOfReadBook(List<Book> books);
}
