package student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5;


import student_andrejs_cekalins.lesson_10.level_3.SearchCriteria;
import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> booksRepository = new ArrayList<>();

    @Override
    public Long save(Book book) {
        long id = booksRepository.size() + 1;
        book.setId(id);
        booksRepository.add(book);
        return id;
    }

    @Override
    public boolean delete(Long id) {
        Optional<Book> findByIdBook = findById(id);
        if (findByIdBook.isPresent()) {
            booksRepository.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        Optional<Book> findBook = findBook(book);
        if (findBook.isPresent()) {
            booksRepository.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long id) {
        for (Book book : booksRepository) {
            Optional<Book> findByIdBook = Optional.ofNullable(book);
            if (findByIdBook.isPresent()) {
                if (book.getId().equals(id)) {
                    return Optional.of(book);
                }
            }
        }
        return Optional.empty();
    }


    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authorList = new ArrayList<>();
        for (Book book : booksRepository) {
            if (book.getAuthor().equals(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleList = new ArrayList<>();
        for (Book book : booksRepository) {
            if (book.getTitle().equals(title)) {
                titleList.add(book);
            }
        }
        return titleList;
    }

    @Override
    public int countAllBooks() {
        return booksRepository.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        Optional<Book> findAuthor = findAuthorBooks(author);
        if (findAuthor.isPresent()) {
            booksRepository.remove(findAuthor.get());
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Optional<Book> findTitle = findTitleBooks(title);
        if (findTitle.isPresent()) {
            booksRepository.remove(findTitle.get());
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchCriteriaList = new ArrayList<>();
        for (Book book : booksRepository) {
            if (searchCriteria.match(book)) {
                searchCriteriaList.add(book);
            }
        }
        return searchCriteriaList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authorBooks = new HashSet<>();
        for (Book book : booksRepository) {
            authorBooks.add(book.getAuthor());
        }
        return authorBooks;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titleBooks = new HashSet<>();
        for (Book book : booksRepository) {
            titleBooks.add(book.getTitle());
        }
        return titleBooks;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : booksRepository) {
            uniqueBooks.add(new Book(book.getAuthor(), book.getTitle(), book.getYearOfIssue()));
        }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        for (Book bookDuplicate : booksRepository) {
            if (bookDuplicate.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorBooks = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            authorBooks.put(author, findByAuthor(author));
        }
        return authorBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBooksCount = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            int count = 0;
            for (Book book : booksRepository) {
                if (book.getAuthor().equals(author)) {
                    count++;
                }
            }
            authorBooksCount.put(author, count);
        }
        return authorBooksCount;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                ", bookRepository=" + booksRepository +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDatabaseImpl that = (BookDatabaseImpl) o;
        return booksRepository.equals(that.booksRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(booksRepository);
    }

    private Optional<Book> findBook(Book book) {
        for (Book books : booksRepository) {
            Optional<Book> findBook = Optional.ofNullable(books);
            if (findBook.isPresent()) {
                if (books.equals(book)) {
                    return findBook;
                }
            }
        }
        return Optional.empty();
    }


    private Optional<Book> findAuthorBooks(String author) {
        for (Book book : booksRepository) {
            Optional<Book> findAuthorBook = Optional.ofNullable(book);
            if (findAuthorBook.isPresent()) {
                if (book.getAuthor().equals(author)) {
                    return findAuthorBook;
                }
            }
        }
        return Optional.empty();
    }

    private Optional<Book> findTitleBooks(String title) {
        for (Book book : booksRepository) {
            Optional<Book> findTitleBook = Optional.ofNullable(book);
            if (findTitleBook.isPresent()) {
                if (book.getTitle().equals(title)) {
                    return findTitleBook;
                }
            }
        }
        return Optional.empty();
    }
}

