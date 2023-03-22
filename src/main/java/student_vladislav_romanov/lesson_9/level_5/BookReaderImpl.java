package student_vladislav_romanov.lesson_9.level_5;

import java.util.*;

class BookReaderImpl implements BookReader {

    Set<Book> books = new HashSet<>();

    @Override
    public boolean addBook(Book book) {
        if (book.title.length() > 0 && book.author.length() > 0) {
            return books.add(book);
        }

        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    @Override
    public List<String> listOfBooks() {
        List<String> listOfBooks = new ArrayList<>();

        for (Book book : books) {
            listOfBooks.add(book.title + "[" + book.author + "]");
        }

        return listOfBooks;
    }

    @Override
    public List<String> listOfBooks(String author) {
        List<String> listOfBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.author.contains(author)) {
                listOfBooks.add(book.title + "[" + book.author + "]");
            }
        }

        return listOfBooks;
    }

}
