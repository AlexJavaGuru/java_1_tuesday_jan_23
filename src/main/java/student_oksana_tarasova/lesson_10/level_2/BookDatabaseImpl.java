package student_oksana_tarasova.lesson_10.level_2;

import student_oksana_tarasova.lesson_10.level_3.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    List<Book> books;

    public BookDatabaseImpl(List<Book> books) {
        this.books = books;
    }

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
        Iterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == bookId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        Iterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(book)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> bookAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                bookAuthor.add(book);
            }
        }
        return bookAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookTitle.add(book);
            }
        }
        return bookTitle;
    }

    @Override
    public int countAllBooks() {
        int countBooks = 0;
        for (Book book : books) {
            if (book != null) {
                countBooks++;
            }
        }
        return countBooks;
    }

    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAuthor().equalsIgnoreCase(author)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchBook = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                searchBook.add(book);
            }
        }
        return searchBook;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> allAuthor = new HashSet<>();
        for (Book book : books) {
            allAuthor.add(book.getAuthor());
        }
        return allAuthor;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> allTitle = new HashSet<>();
        for (Book book : books) {
            allTitle.add(book.getTitle());
        }
        return allTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBook = new HashSet<>();
        for (Book book : books) {
            uniqueBook.add(book);

        }
        return uniqueBook;
    }

    @Override
    public boolean contains(Book book) {
        if (books.contains(book)) {
            return true;
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> libraryAuthorToBooks = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            libraryAuthorToBooks.put(author, findByAuthor(author));
        }
        return libraryAuthorToBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> eachAuthorBookCount = new HashMap<>();
        Set<String> authors = findUniqueAuthors();
        for (String author : authors) {
            eachAuthorBookCount.put(author, countAuthorToBooks(author));
        }
        return eachAuthorBookCount;
    }

    private int countAuthorToBooks (String author) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                count++;
            }
        }
       return count;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                '}';
    }
}
