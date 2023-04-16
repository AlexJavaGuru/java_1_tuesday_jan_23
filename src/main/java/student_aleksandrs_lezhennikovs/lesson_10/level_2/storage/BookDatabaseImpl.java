package student_aleksandrs_lezhennikovs.lesson_10.level_2.storage;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {
    private Long id = 1L;
    private List<Book> storage = new ArrayList<>();

    public List<Book> getStorage() {
        return storage;
    }

    @Override
    public int countAllBooks() {
        return storage.size();
    }
    @Override
    public Long save(Book book) {
        return id++;
    }

    @Override
    public void saveBook(Book book) {
        book.setId(save(book));
        storage.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return storage;
    }

    @Override
    public boolean deleteById(Long id) {
        Optional<Book> optBook = findById(id);
        if (optBook.isPresent()) {
            storage.remove(optBook.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        Optional<Book> optBook = findBook(book);
        if (optBook.isPresent()) {
            storage.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(SearchCriteria searchCriteria) {
        for (Book book : storage) {
            if (searchCriteria.match(book)) {
                storage.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> resultList = new ArrayList<>();
        for (Book book : storage) {
            if (searchCriteria.match(book)) {
                resultList.add(book);
            }
        }
        return resultList;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "id=" + id  +
                ", storage=" + storage +
                '}';
    }

    @Override
    public Optional<Book> findById(Long id) {
        for (Book book : storage) {
            Optional<Book> optBook = Optional.ofNullable(book);
            if (optBook.isPresent()) {
                if (book.getId().equals(id)) {
                    return optBook;
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> resultList = new ArrayList<>();
        for (Book book : storage) {
            if (book.getAuthor().equals(author)) {
                resultList.add(book);
            }
        }
        return resultList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> resultList = new ArrayList<>();
        for (Book book : storage) {
            if (book.getTitle().equals(title)) {
                resultList.add(book);
            }
        }
        return resultList;
    }

    @Override
    public void deleteByAuthor(String author) {
        Optional<Book> optBook = findByAuthorOpt(author);
        if (optBook.isPresent()) {
            storage.remove(optBook.get());
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Optional<Book> optBook = findByTitleOpt(title);
        if (optBook.isPresent()) {
            storage.remove(optBook.get());
        }
    }


    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> resultSet = new HashSet<>();
        for (Book book : storage) {
            resultSet.add(book.getAuthor());
        }
        return resultSet;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> resultSet = new HashSet<>();
        for (Book book : storage) {
            resultSet.add(book.getTitle());
        }
        return resultSet;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> resultSet = new HashSet<>();
        for (Book book : storage) {
            resultSet.add(book);
        }
        return resultSet;
    }

    @Override
    public boolean contains(Book book) {
        Optional<Book> optBook = findBook(book);
        if (optBook.isPresent()) {
            return true;
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBook = new HashMap<>();
        for (Book book : storage) {
            authorToBook.put(book.getAuthor(), findByAuthor(book.getAuthor()));
        }
        return authorToBook;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> countBookForAuthor = new HashMap<>();
        for (Book book : storage) {
            countBookForAuthor.put(book.getAuthor(), bookCountPerAuthor(book.getAuthor()));
        }
        return countBookForAuthor;
    }

    private Integer bookCountPerAuthor(String author) {
        Integer counter = 0;
        for (Book book : storage) {
            if (book.getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    private Optional<Book> findByAuthorOpt(String author) {
        for (Book book : storage) {
            Optional<Book> optBook = Optional.ofNullable(book);
            if (optBook.isPresent()) {
                if (book.getAuthor().equals(author)) {
                    return optBook;
                }
            }
        }
        return Optional.empty();
    }

    private Optional<Book> findByTitleOpt(String title) {
        for (Book book : storage) {
            Optional<Book> optBook = Optional.ofNullable(book);
            if (optBook.isPresent()) {
                if (book.getTitle().equals(title)) {
                    return optBook;
                }
            }
        }
        return Optional.empty();
    }


    private Optional<Book> findBook(Book book) {
        for (Book bookInDB : storage) {
            Optional<Book> optBook = Optional.ofNullable(bookInDB);
            if (optBook.isPresent()) {
                if (bookInDB.equals(book)) {
                    return optBook;
                }
            }
        }
        return Optional.empty();
    }
}
