package student_anastasiia_bokareva.lesson10.level2.Task6;

import com.sun.source.tree.LambdaExpressionTree;
import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
}
