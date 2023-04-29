package student_anastasiia_bokareva.lesson10.level2.Task6;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {
    private Long id;
    private List<Book> books = new ArrayList<>();


    @Override
    public Long save(Book book) {
        return id++;
    }

    @Override
    public boolean delete(Long bookId) {
        Optional<Book> optionalBook = findBookById(bookId);
        if (optionalBook.isPresent()) {
            books.remove(optionalBook);
            return true;
        }
        return false;
    }

    private Optional<Book> findBookById(Long bookId) {
        for (Book book : books) {
            Optional<Book> optiBook = Optional.ofNullable(book);
            if ((optiBook.isPresent()) && (book.getId().equals(bookId))) {
                return optiBook;
            }
        }
        return Optional.empty();
    }

    public void saveBook(Book book) {
        books.add(book);
        book.setId(save(book));
    }

}
