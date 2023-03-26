package student_andrejs_cekalins.lesson_9.level_5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest test = new BookReaderTest();

        test.addBook();
        test.notAddBookWithoutBookTitle();
        test.notAddBookWithoutAuthor();
        test.delete();
        test.noBookToDelete();
        test.booksList();
        test.authorBooks();
        test.noAuthorBooks();
    }

    public void addBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Don Quixote", "Miguel de Cervantes");
        boolean expectedResult = true;
        boolean realResult = bookReader.add(book);
        if (expectedResult == realResult) {
            System.out.println("Add book test Passed");
        }
    }

    public void notAddBookWithoutBookTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book(" ", "Miguel de Cervantes");
        boolean expectedResult = true;
        boolean realResult = bookReader.add(book);
        if (expectedResult == realResult) {
            System.out.println("Not add book without book title test Passed");
        }
    }

    public void notAddBookWithoutAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Don Quixote", " ");
        boolean expectedResult = true;
        boolean realResult = bookReader.add(book);
        if (expectedResult == realResult) {
            System.out.println("Not add book without author test Passed");
        }
    }

    public void delete() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Don Quixote", "Miguel de Cervantes");
        bookReader.add(book);
        boolean expectedResult = true;
        boolean realResult = bookReader.delete(book);
        if (expectedResult == realResult) {
            System.out.println("Delete book test Passed");
        }
    }

    public void noBookToDelete() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Don Quixote", "Miguel de Cervantes");
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        bookReader.add(book);
        boolean expectedResult = false;
        boolean realResult = bookReader.delete(book1);
        if (expectedResult == realResult) {
            System.out.println("No book to delete test Passed");
        }
    }

    public void booksList() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        expectedResult.add("Alice's Adventures in Wonderland [Lewis Carroll]");
        List<String> realResult = bookReader.listOfBooks();
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (realResult.equals(expectedResult)) {
            System.out.println("Books list test Passed");
        }
    }

    public void authorBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "Lewis Carroll");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [Lewis Carroll]");
        expectedResult.add("Harry Potter and the Sorcerer's Stone [Lewis Carroll]");
        List<String> realResult = bookReader.authorBooks("Lewis");
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (realResult.equals(expectedResult)) {
            System.out.println("Author books list test Passed");
        }
    }
    public void noAuthorBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "Lewis Carroll");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [Lewis Carroll]");
        expectedResult.add("Harry Potter and the Sorcerer's Stone [Lewis Carroll]");
        List<String> realResult = bookReader.authorBooks("Rowling");
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (!realResult.equals(expectedResult)) {
            System.out.println("No author books in the list test Passed");
        }
    }
}





    /*public void addBook() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = true;
        BookReader bookReader = new BookReaderImpl(books);
        Book book = new Book("Pinocchio", "Carlo Collodi");
        boolean realResult = bookReader.addBook(book,);
        if (expectedResult == realResult) {
            System.out.println("Add book test Passed");
        }
    }

    public void notAddBook() {
        Book[] books = {
                new Book("Don Quixote", "Miguel de Cervantes"),
                new Book("Lord of the Rings", "J.R.R. Tolkien"),
                new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
                new Book("Alice's Adventures in Wonderland", "Lewis Carroll")
        };
        boolean expectedResult = false;
        BookReader bookReader = new BookReaderImpl(books);
        NewBook newBook = new NewBook("Don Quixote", "Miguel de Cervantes");
        boolean realResult = bookReader.addBook(newBook);
        if (expectedResult == realResult) {
            System.out.println("Not add book test Passed");
        }
    }

     */

