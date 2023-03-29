package student_oksana_tarasova.lesson_10.level_2;

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
        List<Book> bookAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(title)) {
                bookAuthor.add(book);
            }
        }
        return bookAuthor;
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
