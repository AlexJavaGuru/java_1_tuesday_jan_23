package student_vladislav_romanov.lesson_9.level_5;

import java.util.HashSet;
import java.util.Set;

class BookReaderImpl implements BookReader {

    Set<Book> books = new HashSet<>();

    @Override
    public boolean addBook(Book book) {
        return books.add(book);
    }

}
