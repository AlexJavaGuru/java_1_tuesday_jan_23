package student_oksana_tarasova.lesson_10.level_2;

import student_oksana_tarasova.lesson_10.level_3.SearchCriteria;

import java.util.*;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}
