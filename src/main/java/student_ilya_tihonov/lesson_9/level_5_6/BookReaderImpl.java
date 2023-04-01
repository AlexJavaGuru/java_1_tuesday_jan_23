package student_ilya_tihonov.lesson_9.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader{

    private List<Book> library;

    public BookReaderImpl() {
        this.library = new ArrayList<>();
    }

    @Override
    public boolean addBook(Book book) {
        if (book.getTitle() == null || book.getAuthor() == null) {
            return false;
        }

        for (Book b : library) {
            if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle())) {
                return false;
            }
        }
        book.setRead(false);
        library.add(book);
        return true;
    }


    @Override
    public boolean removeBook(Book book) {
        if (book.getTitle() == null || book.getAuthor() == null) {
            return false;
        }

        for (Book b : library) {
            if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle())) {
                library.remove(b);
                return true;
            }
        }

        return false;
    }

    @Override
    public String[] listBooks() {
        List<String> bookList = new ArrayList<>();
        for (Book b : library) {
            bookList.add(b.getTitle() + " [" + b.getAuthor() + "]");
        }

        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByAuthor(String author) {
        List<String> bookList = new ArrayList<>();
        for (Book b : library) {
            if (b.getAuthor().equals(author)) {
                bookList.add(b.getTitle() + " [" + b.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByFullAuthorName(String author) {
        List<String> bookList = new ArrayList<>();
        for (Book b : library) {
            if (b.getAuthor().equals(author)) {
                bookList.add(b.getTitle() + " [" + b.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByTitle(String title) {
        List<String> bookList = new ArrayList<>();
        for (Book b : library) {
            if (b.getTitle().equals(title)) {
                bookList.add(b.getTitle() + " [" + b.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByTitleStartingWith(String title) {
        List<String> bookList = new ArrayList<>();
        for (Book b : library) {
            if (b.getTitle().startsWith(title)) {
                bookList.add(b.getTitle() + " [" + b.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public boolean markBookAsRead(Book book) {
        for (Book b : library) {
            if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle())) {
                b.setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markBookAsUnread(Book book) {
        for (Book b : library) {
            if (b.getAuthor().equals(book.getAuthor()) && b.getTitle().equals(book.getTitle())) {
                b.setRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] listReadBooks() {
        List<String> bookList = new ArrayList<>();
        for (Book b : library) {
            if (b.isRead()) {
                bookList.add(b.getTitle() + " [" + b.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

}

