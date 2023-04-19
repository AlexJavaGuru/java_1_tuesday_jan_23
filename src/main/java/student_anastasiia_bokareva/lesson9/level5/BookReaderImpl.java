package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;

public class BookReaderImpl implements BookReader {

    public boolean add(ArrayList<Book> books, Book newBook) {
        if (books.contains(newBook)) {
            return false;
        } else {
            books.add(newBook);
            return true;
        }
    }

    public boolean addNotNull(ArrayList<Book> books, Book newBook) {
        if ((newBook.getBookName() != "") && (newBook.getBookAuthor() != "")) {
            return add(books, newBook);
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(ArrayList<Book> books, Book newBook) {
        return books.remove(newBook);
    }

    public void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
        }
    }

    public void collectByAuthors(ArrayList<Book> books, String authorBook) {
        for (Book book : books) {
            if (book.getBookAuthor() == authorBook) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }
    public void researchByAuthor (ArrayList<Book> books, String word){
        for (Book book : books ){
            if (book.getBookAuthor().startsWith(word)){
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    public void collectByTitle (ArrayList<Book> books, String nameBook) {
        for (Book book : books) {
            if (book.getBookName() == nameBook) {
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }

    public void researchByTitle (ArrayList<Book> books, String word){
        for (Book book : books ){
            if (book.getBookName().startsWith(word)){
                System.out.println("Book " + book.getBookName() + " [ Author " + book.getBookAuthor() + " ]");
            }
        }
    }
}