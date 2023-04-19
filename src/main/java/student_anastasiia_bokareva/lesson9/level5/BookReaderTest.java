package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;
import java.util.Scanner;

public class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();
        test.addBook();
        test.addWrongBook();
        test.addNullBook();
        test.removeBook();
        test.printBook();
        test.printAuthorBook();
        test.researchByAuthor();

    }

    public void addBook() {
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "HR");
        books.add(newBook);
        Book checkBook = new Book("HRE", "Vivian");
        boolean realResult = true;
        boolean expectedResult = impl.add(books, checkBook);
        check(realResult, expectedResult, " Add Book");
    }

    public void addWrongBook(){
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "HR");
        Book checkBook = new Book("Harry Potter", "HR");
        books.add(newBook);
        boolean realResult = false;
        boolean expectedResult = impl.add(books, checkBook);
        check(realResult, expectedResult, " Add Wrong Book");
    }

    public void addNullBook() {
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "HR");
        books.add(newBook);
        Book checkBook = new Book("", "");
        boolean realResult = false;
        boolean expectedResult = impl.addNotNull(books, checkBook);
        check(realResult, expectedResult, " Add Null Book");
    }

    public void removeBook(){
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "HR");
        Book checkBook = new Book("Harry Potter", "HR");
        books.add(newBook);
        boolean realResult = true;
        boolean expectedResult = impl.delete(books, checkBook);
        check(realResult, expectedResult, " delete Book");
    }
    public void printBook(){
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "HR");
        Book checkBook = new Book("Sally Hope", "HtrrR");
        books.add(newBook);
        books.add(checkBook);
        impl.printBooks(books);
    }
    public void printAuthorBook(){
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "TY");
        Book bookSecond = new Book("Sally Hope", "HRe");
        Book checkBook = new Book("Sally Hope", "TY");
        books.add(newBook);
        books.add(checkBook);
        books.add(bookSecond);
        System.out.println("");
        System.out.println("Test - research by author TY");
        impl.collectByAuthors(books,"TY");
    }

    public void researchByAuthor(){
        BookReaderImpl impl = new BookReaderImpl();
        ArrayList<Book> books = new ArrayList<>(10);
        Book newBook = new Book("Harry Potter", "Heg");
        Book bookSecond = new Book("Sally Hope", "HRe");
        Book checkBook = new Book("Sally Hope", "HR");
        books.add(newBook);
        books.add(checkBook);
        books.add(bookSecond);
        System.out.println("");
        System.out.println("Test - research by word HR ");
        impl.researchByAuthor(books,"HR");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println("Test " + testName + " is Ok!");
        } else {
            System.out.println("Test " + testName + " is fail!");
        }
    }
}
