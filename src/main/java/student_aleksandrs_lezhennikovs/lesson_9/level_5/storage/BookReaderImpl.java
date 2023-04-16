package student_aleksandrs_lezhennikovs.lesson_9.level_5.storage;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.domain.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    private long bookId = 10L;
    private List<BookEntity> bookDatabase = new ArrayList<>();

    @Override
    public void add(BookEntity book) {
        if (validateBook(book)) {
            book.setBookId(bookId);
            bookId++;
            bookDatabase.add(book);
        }
    }

    @Override
    public void delete(BookEntity book) {
        bookDatabase.remove(book);
    }

    @Override
    public boolean notNullsTitleAuthor(BookEntity checkBook) {
        return checkBook.getAuthor() != null && checkBook.getTitle() != null &&
                !checkBook.getAuthor().isBlank() && !checkBook.getTitle().isBlank();
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "bookId=" + bookId +
                ", bookDatabase=" + bookDatabase +
                '}';
    }

    private boolean isEmptyBookDatabase(List<BookEntity> bookDatabase) {
        return bookDatabase.size() == 0;
    }
    private boolean checkTitleAuthor(BookEntity book, BookEntity newBook) {
        return book.getTitle().equals(newBook.getTitle()) && book.getAuthor().equals(newBook.getAuthor());
    }

    @Override
    public boolean notExistBook(BookEntity newBook) {
        for (BookEntity book : bookDatabase) {
            if (checkTitleAuthor(book, newBook)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<BookEntity> getAll() {
        return bookDatabase;
    }

    @Override
    public List<BookEntity> searchByAuthor(String author) {
        List<BookEntity> resultOfSearch = new ArrayList<>();
        for (BookEntity book : bookDatabase) {
            if (author.equals(book.getAuthor())) {
                resultOfSearch.add(book);
            }
        }
        return resultOfSearch;
    }

    @Override
    public List<BookEntity> searchByTitle(String title) {
        List<BookEntity> resultOfSearch = new ArrayList<>();
        for (BookEntity book : bookDatabase) {
            if (title.equals(book.getTitle())) {
                resultOfSearch.add(book);
            }
        }
        return resultOfSearch;
    }
    @Override
    public List<BookEntity> searchByAuthorLetters(String partOfAuthorName) {
        List<BookEntity> resultOfSearch = new ArrayList<>();
        for (BookEntity book : bookDatabase) {
            if (checkPartOfWord(book.getAuthor(), partOfAuthorName)) {
                resultOfSearch.add(book);
            }
        }
        return resultOfSearch;
    }

    @Override
    public List<BookEntity> searchByTitleLetters(String partOfTitle) {
        List<BookEntity> resultOfSearch = new ArrayList<>();
        for (BookEntity book : bookDatabase) {
            if (checkPartOfWord(book.getTitle(), partOfTitle)) {
                resultOfSearch.add(book);
            }
        }
        return resultOfSearch;
    }

    @Override
    public void markAsRead(long bookId) {
        for (int i = 0; i < bookDatabase.size(); i++) {
            if (bookDatabase.get(i).getBookId() == bookId) {
                bookDatabase.get(i).setRead(true);
            }
        }
    }

    @Override
    public void markAsUnread(long bookId) {
        for (int i = 0; i < bookDatabase.size(); i++) {
            if (bookDatabase.get(i).getBookId() == bookId) {
                bookDatabase.get(i).setRead(false);
            }
        }
    }

    @Override
    public List<BookEntity> returnUnreadBooks() {
        List<BookEntity> resultOfSearch = new ArrayList<>();
        for (BookEntity book : bookDatabase) {
            if (!book.getIsRead()){
                resultOfSearch.add(book);
            }
        }
        return resultOfSearch;
    }

    @Override
    public List<BookEntity> returnReadBooks() {
        List<BookEntity> resultOfSearch = new ArrayList<>();
        for (BookEntity book : bookDatabase) {
            if (book.getIsRead()){
                resultOfSearch.add(book);
            }
        }
        return resultOfSearch;
    }

    public boolean notNullBook(BookEntity checkBook) {
        return checkBook != null;
    }

    private boolean checkPartOfWord(String checkWord, String partOfWord) {
        boolean isIndexZero = checkWord.indexOf(partOfWord) == 0;
        boolean check = checkWord.contains(partOfWord);
        return check && isIndexZero;
    }


    private boolean validateBook(BookEntity book) {
        if (notNullBook(book)) {
            return notNullsTitleAuthor(book) && (isEmptyBookDatabase(bookDatabase) || notExistBook(book));
        }
        return false;

    }


}
