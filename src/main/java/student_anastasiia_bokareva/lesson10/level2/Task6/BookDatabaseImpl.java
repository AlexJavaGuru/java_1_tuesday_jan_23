package student_anastasiia_bokareva.lesson10.level2.Task6;

import com.sun.source.tree.LambdaExpressionTree;
import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabase;
import student_anastasiia_bokareva.lesson10.level3.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    private Long id;
    private List<Book> books = new ArrayList<>();


    @Override
    public Long save(Book book) {
        books.add(book);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                long idBook = i + 1L;
                book.setId(idBook);
            }
        }
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books){
            if (book.getId().equals(bookId)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book findBook) {
        for (Book book : books){
            if (books.equals(findBook)) {
                books.remove(findBook);
                return true;
            }
        }
        return  false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books){
            if (book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> real = new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().equalsIgnoreCase(author)){
                real.add(book);
            }
        }
        return real;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> real = new ArrayList<>();
        for (Book book:books){
            if (book.getTitle().equalsIgnoreCase(title)){
                real.add(book);
            }
        }
        return real;
    }

    @Override
    public int countAllBooks() {
        int counter=0;
        for (Book book : books){
            counter++;
        }
        return counter;
    }

    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getAuthor().equals(author)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> real = new ArrayList<>();
        for (Book book : books){
            if (searchCriteria.match(book)){
                real.add(book);
            }
        }
        return real;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> real = new HashSet<>();
        for (Book book : books) {
            real.add(book.getAuthor());
        }
        return real;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> real = new HashSet<>();
        for (Book book : books) {
            real.add(book.getTitle());
        }
        return real;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> real  = new HashSet<>();
        for (Book book : books) {
            boolean isUnique = true;
            for (Book otherBook : real) {
                if (book.getTitle().equals(otherBook.getTitle()) && book.getAuthor().equals(otherBook.getAuthor())) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                real.add(book);
            }
        }
        return real;
    }

    @Override
    public boolean contains(Book book) {
        for (Book book1 : books) {
            boolean a = book1.getAuthor().equalsIgnoreCase(book.getAuthor());
            boolean b = book1.getTitle().equalsIgnoreCase(book.getTitle());
            if ((a && b) == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> listAuthorBook = new HashMap<>();
        for (Book book: books){
            listAuthorBook.put(book.getAuthor(),findByAuthor(book.getAuthor()));
        }
        return listAuthorBook;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBookCount = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            if (authorBookCount.containsKey(author)) {
                authorBookCount.put(author, authorBookCount.get(author) + 1);
            } else {
                authorBookCount.put(author, 1);
            }
        }
        return authorBookCount;
    }

}
