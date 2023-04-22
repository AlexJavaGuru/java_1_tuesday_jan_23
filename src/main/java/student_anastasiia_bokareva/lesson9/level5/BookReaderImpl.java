package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    public boolean add(List<Book> books, Book newBook) {
        if (books.contains(newBook)) {
            return false;
        } else {
            books.add(newBook);
            return true;
        }
    }

    public boolean addNotNull(List<Book> books, Book newBook) {
        if ((newBook.getBookName() != "") && (newBook.getBookAuthor() != "")) {
            return add(books, newBook);
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(List<Book> books, Book newBook) {
        return books.remove(newBook);
    }

    public void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
        }
    }

    public void collectByAuthors(List<Book> books, String authorBook) {
        for (Book book : books) {
            if (book.getBookAuthor() == authorBook) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    public void researchByAuthor(List<Book> books, String word) {
        for (Book book : books) {
            if (book.getBookAuthor().startsWith(word)) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    public void collectByTitle(List<Book> books, String nameBook) {
        for (Book book : books) {
            if (book.getBookName() == nameBook) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    public void researchByTitle(List<Book> books, String word) {
        for (Book book : books) {
            if (book.getBookName().startsWith(word)) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    public boolean isReadBook(List<Book> books, Book book) {
        if (books.contains(book)) {
            book.setRead(true);
            return true;
        }
        return false;
    }

    public boolean isUnreadBook(List<Book> books, Book book) {
        if (books.contains(book)) {
            book.setUnread(true);
            return true;
        }
        return false;
    }

    public void printListOfReadBook(List<Book> books) {
        for (Book book : books) {
            if  (book.isRead()) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    @Override
    public void printListOfUnreadBook(List<Book> books) {
        for (Book book : books) {
            if (book.isUnread()) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }
}