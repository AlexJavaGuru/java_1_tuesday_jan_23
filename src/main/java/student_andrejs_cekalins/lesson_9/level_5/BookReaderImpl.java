package student_andrejs_cekalins.lesson_9.level_5;


import java.util.*;

class BookReaderImpl implements BookReader {

    Set<Book> books = new HashSet<>();


    @Override
    public boolean add(Book book) {
        if (book.getBookTitle() != null && book.getAuthor() != null) {
            return books.add(book);
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {
        if (book.getBookTitle() != null) {
            return books.remove(book);
        }
        return false;
    }

    @Override
    public List<String> listOfBooks() {
        List<String> listOfBooks = new ArrayList<>();
        for (Book book : books) {
            listOfBooks.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
        }
        return listOfBooks;
    }

    @Override
    public List<String> authorBooks(String author) {
        List<String> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                authorBooks.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return authorBooks;
    }

    @Override
    public List<String> listOfBooksFullTitle(String title) {
        List<String> listOfBooksFullTitle = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getBookTitle(), title)) {
                listOfBooksFullTitle.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return listOfBooksFullTitle;
    }

    @Override
    public List<String> listOfBooksByTitle(String title) {
        List<String> listOfBooksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookTitle().contains(title)) {
                listOfBooksByTitle.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return listOfBooksByTitle;
    }

    @Override
    public boolean readBook(Book book) {
        if (books.contains(book)) {
            book.setRead();
            return true;
        }
        return false;
    }

    @Override
    public boolean unreadBook(Book book) {
        if (books.contains(book)) {
            book.setUnread();
            return true;
        }
        return false;
    }

    @Override
    public List<String> listOfReadBooks() {
        List<String> listOfReadBook = new ArrayList<>();
        for (Book book : books) {
            if (book.getRead()) {
                listOfReadBook.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return listOfReadBook;
    }

    @Override
    public List<String> listOfUnreadBooks() {
        List<String> listOfUnreadBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.getRead()) {
                listOfUnreadBooks.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return listOfUnreadBooks;
    }
}

