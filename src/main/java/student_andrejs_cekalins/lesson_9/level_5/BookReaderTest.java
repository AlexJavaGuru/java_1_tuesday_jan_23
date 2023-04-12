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
        test.listOfBooksFullTitle();
        test.noListOfBooksFullTitle();
        test.listOfBooksByTitle();
        test.noListOfBooksByTitle();
        test.readBook();
        test.notReadBook();
        test.unreadBook();
        test.notUnreadBook();
        test.listOfReadBooks();
        test.noListOfReadBooks();
        test.listOfUnreadBooks();
        test.noListOfUnreadBooks();
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

    public void listOfBooksFullTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        List<String> realResult = bookReader.listOfBooksFullTitle("Lord of the Rings");
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (realResult.equals(expectedResult)) {
            System.out.println("List of books full title test Passed");
        }
    }

    public void noListOfBooksFullTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        List<String> realResult = bookReader.listOfBooksFullTitle("Lord");
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (!realResult.equals(expectedResult)) {
            System.out.println("No list of books full title test Passed");
        }
    }

    public void listOfBooksByTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        List<String> realResult = bookReader.listOfBooksByTitle("Lord");
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (realResult.equals(expectedResult)) {
            System.out.println("List of books by short title test Passed");
        }
    }

    public void noListOfBooksByTitle() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        List<String> realResult = bookReader.listOfBooksByTitle("Lord");
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (!realResult.equals(expectedResult)) {
            System.out.println("No list of books by short title test Passed");
        }
    }

    public void readBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Lord of the Rings", "J.R.R. Tolkien");
        bookReader.add(book);
        boolean expectedResult = true;
        boolean realResult = bookReader.readBook(book);
        if (expectedResult == realResult) {
            System.out.println("Book is read test Passed");
        }
    }

    public void notReadBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Lord of the Rings", "J.R.R. Tolkien");
        bookReader.add(book);
        boolean expectedResult = false;
        boolean realResult = bookReader.readBook(book);
        if (!expectedResult == realResult) {
            System.out.println("Book is not read test Passed");
        }
    }

    public void unreadBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Lord of the Rings", "J.R.R. Tolkien");
        bookReader.add(book);
        boolean expectedResult = true;
        boolean realResult = bookReader.unreadBook(book);
        if (expectedResult == realResult) {
            System.out.println("Book is unread test Passed");
        }
    }

    public void notUnreadBook() {
        BookReader bookReader = new BookReaderImpl();
        Book book = new Book("Lord of the Rings", "J.R.R. Tolkien");
        bookReader.add(book);
        boolean expectedResult = false;
        boolean realResult = bookReader.unreadBook(book);
        if (!expectedResult == realResult) {
            System.out.println("Book is not unread test Passed");
        }
    }

    public void listOfReadBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        bookReader.readBook(book1);
        bookReader.readBook(book2);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        expectedResult.add("Harry Potter and the Sorcerer's Stone [J.K. Rowling]");
        List<String> realResult = bookReader.listOfReadBooks();
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (realResult.equals(expectedResult)) {
            System.out.println("Read books list test Passed");
        }
    }

    public void noListOfReadBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        Book book4 = new Book("Don Quixote", "Miguel de Cervantes");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        bookReader.add(book4);
        bookReader.readBook(book1);
        bookReader.readBook(book2);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        expectedResult.add("Harry Potter and the Sorcerer's Stone [J.K. Rowling]");
        List<String> realResult = bookReader.listOfReadBooks();
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (!realResult.equals(expectedResult)) {
            System.out.println("No read books in the list test Passed");
        }
    }

    public void listOfUnreadBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        Book book4 = new Book("Don Quixote", "Miguel de Cervantes");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        bookReader.add(book4);
        bookReader.readBook(book3);
        bookReader.readBook(book4);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        expectedResult.add("Harry Potter and the Sorcerer's Stone [J.K. Rowling]");
        List<String> realResult = bookReader.listOfUnreadBooks();
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (realResult.equals(expectedResult)) {
            System.out.println("Unread books list test Passed");
        }
    }

    public void noListOfUnreadBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book3 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");
        Book book4 = new Book("Don Quixote", "Miguel de Cervantes");
        bookReader.add(book1);
        bookReader.add(book2);
        bookReader.add(book3);
        bookReader.add(book4);
        bookReader.readBook(book1);
        bookReader.readBook(book2);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Lord of the Rings [J.R.R. Tolkien]");
        expectedResult.add("Harry Potter and the Sorcerer's Stone [J.K. Rowling]");
        List<String> realResult = bookReader.listOfUnreadBooks();
        Collections.sort(expectedResult);
        Collections.sort(realResult);
        if (!realResult.equals(expectedResult)) {
            System.out.println("No unread books in the list test Passed");
        }
    }
}