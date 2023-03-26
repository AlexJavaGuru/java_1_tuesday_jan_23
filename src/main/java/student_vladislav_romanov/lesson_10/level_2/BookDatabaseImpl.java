package student_vladislav_romanov.lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        long id = books.size() + 1;
        book.setId(id);
        books.add(book);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookFromList : books) {
            if (bookFromList.equals(book)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                '}';
    }
}
