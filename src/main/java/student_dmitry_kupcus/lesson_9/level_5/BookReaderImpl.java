package student_dmitry_kupcus.lesson_9.level_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookReaderImpl implements BookReader {
    Map<String, String> books = new HashMap<>();

    @Override
    public boolean addBook(Book book) {
        if (books.containsKey(book.getBookName()) && books.containsValue(book.getBookAuthor()) || nullCheck(book)) {
            return false;
        }
        books.put(book.getBookName(), book.getBookAuthor());
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        books.remove(book.getBookName());
        return true;
    }


    @Override
    public String showAllBooks() {
        return books.entrySet().stream().map(e -> e.getValue() + ": " + e.getKey())
                .collect(Collectors.joining(", "));
    }

    @Override
    public boolean finByAuthorName(String bookAuthor) {
        for (String value : books.values()) {
            if (Objects.equals(bookAuthor, value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findByBookName(String bookName) {
        for (String key : books.keySet())
            if (key.contains(bookName)) {
                System.out.println(books.get(key));
                return true;
            }
        return false;
    }

    @Override
    public boolean markAsRead(Book book, String bookName) {
        for (String key : books.keySet())
            if (Objects.equals(bookName, key)) {
                book.setRead(true);
                return true;
        }
        return false;
    }

    @Override
    public boolean markAsUnread(Book book, String bookName) {
        for (String key : books.keySet())
            if (Objects.equals(bookName, key)) {
                book.setRead(false);
                return false;
            }
        return true;
    }


    public boolean nullCheck(Book book) {
        return book.getBookName() == null || book.getBookAuthor() == null;
    }
}

