package student_vladislav_romanov.lesson_9.level_5;

import java.util.*;

class BookReaderImpl implements BookReader {

    Set<Book> books = new HashSet<>();

    @Override
    public boolean addBook(Book book) {
        if (book.getTitle().length() > 0 && book.getAuthor().length() > 0) {
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
            listOfBooks.add(book.getTitle() + "[" + book.getAuthor() + "]");
        }

        return listOfBooks;
    }

    @Override
    public List<String> listOfBooksByAuthor(String author) {
        List<String> listOfBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                listOfBooks.add(book.getTitle() + "[" + book.getAuthor() + "]");
            }
        }

        return listOfBooks;
    }

    @Override
    public List<String> listOfBooksByTitle(String title) {
        List<String> listOfBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                listOfBooks.add(book.getTitle() + "[" + book.getAuthor() + "]");
            }
        }

        return listOfBooks;
    }

    @Override
    public boolean readBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            book.setRead();
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean unreadBook(Book book) {
        if (books.contains(book)) {
            if (book.isRead()) {
                books.remove(book);
                book.unsetRead();
                books.add(book);
            }
            return true;
        }
        return false;
    }

    @Override
    public List<String> listOfReadBooks() {
        List<String> listOfReadBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.isRead()) {
                listOfReadBooks.add(book.getTitle() + "[" + book.getAuthor() + "]");
            }
        }

        return listOfReadBooks;
    }

}
