package student_ilya_tihonov.lesson_9.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader{

    private List<Book> library;

    public BookReaderImpl() {
        this.library = new ArrayList<>();
    }

    @Override
    public boolean newBook(Book book) {
        if (book.getTitle() == null || book.getAuthor() == null) {
            return false;
        }

        for (Book thisBook : library) {
            if (thisBook.getAuthor().equals(book.getAuthor()) && thisBook.getTitle().equals(book.getTitle())) {
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

        for (Book thisBook : library) {
            if (thisBook.getAuthor().equals(book.getAuthor()) && thisBook.getTitle().equals(book.getTitle())) {
                library.remove(thisBook);
                return true;
            }
        }

        return false;
    }

    @Override
    public String[] listBooks() {
        List<String> bookList = new ArrayList<>();
        for (Book thisBook : library) {
            bookList.add(thisBook.getTitle() + " [" + thisBook.getAuthor() + "]");
        }

        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByAuthor(String author) {
        List<String> bookList = new ArrayList<>();
        for (Book thisBook : library) {
            if (thisBook.getAuthor().equals(author)) {
                bookList.add(thisBook.getTitle() + " [" + thisBook.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByFullAuthorName(String author) {
        List<String> bookList = new ArrayList<>();
        for (Book thisBook : library) {
            if (thisBook.getAuthor().equals(author)) {
                bookList.add(thisBook.getTitle() + " [" + thisBook.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByTitle(String title) {
        List<String> bookList = new ArrayList<>();
        for (Book thisBook : library) {
            if (thisBook.getTitle().equals(title)) {
                bookList.add(thisBook.getTitle() + " [" + thisBook.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public String[] searchBooksByTitleStartingWith(String title) {
        List<String> bookList = new ArrayList<>();
        for (Book thisBook : library) {
            if (thisBook.getTitle().startsWith(title)) {
                bookList.add(thisBook.getTitle() + " [" + thisBook.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

    @Override
    public boolean markBookAsRead(Book book) {
        for (Book thisBook : library) {
            if (thisBook.getAuthor().equals(book.getAuthor()) && thisBook.getTitle().equals(book.getTitle())) {
                thisBook.setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markBookAsUnread(Book book) {
        for (Book thisBook : library) {
            if (thisBook.getAuthor().equals(book.getAuthor()) && thisBook.getTitle().equals(book.getTitle())) {
                thisBook.setRead(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] listReadBooks() {
        List<String> bookList = new ArrayList<>();
        for (Book thisBook : library) {
            if (thisBook.isRead()) {
                bookList.add(thisBook.getTitle() + " [" + thisBook.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[bookList.size()]);
    }

}

