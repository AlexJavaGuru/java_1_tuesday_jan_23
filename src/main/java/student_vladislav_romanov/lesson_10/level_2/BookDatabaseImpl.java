package student_vladislav_romanov.lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;

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
    public String toString() {
        return "BookDatabaseImpl{" +
                "books=" + books +
                '}';
    }
}
