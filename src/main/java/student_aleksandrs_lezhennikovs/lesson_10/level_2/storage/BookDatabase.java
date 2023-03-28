package student_aleksandrs_lezhennikovs.lesson_10.level_2.storage;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {
    Long save(Book book);
    void saveBook(Book book);
    boolean delete(SearchCriteria searchCriteria);
    boolean deleteById(Long bookId);
    boolean deleteBook(Book book);
    List<Book> getAllBooks();
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    void deleteByAuthor(String author);
    void deleteByTitle(String title);
    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
    Set<Book> findUniqueBooks();
    boolean contains(Book book);
    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();
    Map<Integer, List<Book>> pagingSearch(Integer pageSize,  SearchCriteria searchCriteria);
}
