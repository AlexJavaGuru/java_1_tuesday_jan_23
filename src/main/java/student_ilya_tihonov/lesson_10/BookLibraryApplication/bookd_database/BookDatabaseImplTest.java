package student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.unique_word_finder.UniqueWordFinder;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();
        bookDatabaseImplTest.testDelete();
        bookDatabaseImplTest.testDeleteByBook();
        bookDatabaseImplTest.testFindById();
        bookDatabaseImplTest.testFindByAuthor();
        bookDatabaseImplTest.testFindByTitle();
        bookDatabaseImplTest.testCountAllBooks();
        bookDatabaseImplTest.testDeleteByAuthor();
        bookDatabaseImplTest.testDeleteByTitle();
        bookDatabaseImplTest.testFindUniqueAuthors();
        bookDatabaseImplTest.testFindUniqueTitles();
        bookDatabaseImplTest.testContains();
        bookDatabaseImplTest.testUniqueWordFinder();
        bookDatabaseImplTest.testGetAuthorToBooksMap();
        bookDatabaseImplTest.testGetEachAuthorBookCount();
    }

    public void testDelete() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "100");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);

        boolean result1 = bookDatabase.delete(1L);
        boolean result2 = bookDatabase.delete(3L);

        if (result1) {
            System.out.println("Book with ID 1 was successfully deleted.");
        } else {
            System.out.println("Book with ID 1 was not found in the database.");
        }

        if (result2) {
            System.out.println("Book with ID 3 was successfully deleted.");
        } else {
            System.out.println("Book with ID 3 was not found in the database.");
        }
    }

    public void testDeleteByBook() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "100");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);

        boolean result1 = bookDatabase.delete(book1);
        boolean result2 = bookDatabase.delete(new Book("1984", "George Orwell", "100"));

        if (result1) {
            System.out.println("Book " + book1.getTitle() + " by " + book1.getAuthor() + " was successfully deleted.");
        } else {
            System.out.println("Book " + book1.getTitle() + " by " + book1.getAuthor() + " was not found in the database.");
        }

        if (result2) {
            System.out.println("Book with title 1984 by George Orwell was successfully deleted.");
        } else {
            System.out.println("Book with title 1984 by George Orwell was not found in the database.");
        }
    }

    public void testFindById() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "100");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Optional<Book> optionalBook = bookDatabase.findById(1L);

        if (optionalBook.isPresent()) {
            Book foundBook = optionalBook.get();
            System.out.println("Book with ID 1 was found: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book with ID 1 was not found in the database.");
        }
    }

    public void testFindByAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby", "100");
        Book book2 = new Book("Harper Lee", "To Kill a Mockingbird", "100");
        Book book3 = new Book("F. Scott Fitzgerald", "Tender Is the Night", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        List<Book> result1 = bookDatabase.findByAuthor("F. Scott Fitzgerald");
        List<Book> result2 = bookDatabase.findByAuthor("Ernest Hemingway");

        if (result1.size() == 2) {
            System.out.println("Two books by F. Scott Fitzgerald were found in the database.");
        } else {
            System.out.println("Expected to find two books by F. Scott Fitzgerald, but found " + result1.size() + ".");
        }

        if (result2.isEmpty()) {
            System.out.println("No books by Ernest Hemingway were found in the database.");
        } else {
            System.out.println("Expected to find no books by Ernest Hemingway, but found " + result2.size() + ".");
        }
    }

    public void testFindByTitle() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("George Orwell", "1984", "100");
        Book book2 = new Book("F. Scott Fitzgerald", "The Great Gatsby", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);

        List<Book> result1 = bookDatabase.findByTitle("1984");
        List<Book> result2 = bookDatabase.findByTitle("A Clockwork Orange");

        if (result1.isEmpty()) {
            System.out.println("The result was found in the database for the query: " + result1);
        } else {
            System.out.println("No result found in database for query: " + result1);
        }

        if (result2.isEmpty()) {
            System.out.println("The result was found in the database for the query: " + result2);
        } else {
            System.out.println("No result found in database for query: " + result2);
        }

    }

    public void testCountAllBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("William Golding", "Lord of the Flies ", "100");
        Book book2 = new Book("Charles Dickens", "A Tale of Two Cities", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);

        int count = bookDatabase.countAllBooks();
        System.out.println("Number of books in the library:" + count);
    }

    public void testDeleteByAuthor() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("George Orwell", "1984 ", "100");
        Book book2 = new Book("George Orwell", "Animal Farm", "100");
        Book book3 = new Book("Oscar Wilde", "The Picture of Dorian Gray", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        boolean result1 = bookDatabase.deleteByAuthor("George Orwell");

        if (result1) {
            System.out.println("Books written by George Orwell removed");
        } else {
            System.out.println("Books written by George Orwell not found");
        }

    }

    public void testDeleteByTitle() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("George Orwell", "1984 ", "100");
        Book book2 = new Book("Oscar Wilde", "The Picture of Dorian Gray", "100");

        bookDatabase.save(book1);
        bookDatabase.save(book2);

        boolean result1 = bookDatabase.deleteByTitle("1984");

        if (result1) {
            System.out.println("Books with title 1984 removed.");
        } else {
            System.out.println("No books found with the title 1984");
        }
    }

    public void testFindUniqueAuthors() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Author 1", "Book 1", "1"));
        bookDatabase.save(new Book("Author 2", "Book 2", "1"));
        bookDatabase.save(new Book("Author 3", "Book 1", "1"));
        bookDatabase.save(new Book("Author 4", "Book 3", "1"));

        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        System.out.println(uniqueAuthors);
        System.out.println(uniqueAuthors.size());
    }

    public void testFindUniqueTitles() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Author 1", "Book 1", "1"));
        bookDatabase.save(new Book("Author 2", "Book 2", "1"));
        bookDatabase.save(new Book("Author 3", "Book 1", "1"));
        bookDatabase.save(new Book("Author 4", "Book 3", "1"));

        Set<String> uniqueTitles = bookDatabase.findUniqueTitles();
        System.out.println(uniqueTitles);
        System.out.println(uniqueTitles.size());
    }

    public void testContains() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Author 1", "Book 1", "1");
        Book book2 = new Book("Author 2", "Book 2", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        System.out.println(bookDatabase.contains(book1));
        System.out.println(bookDatabase.contains(book2));

    }

    public void testUniqueWordFinder() {
        UniqueWordFinder wordFinder = new UniqueWordFinder();

        String text1 = "This is a sample text. Text can contain repeated words.";
        Set<String> uniqueWords1 = wordFinder.find(text1);
        System.out.println(uniqueWords1);

        String text2 = "";
        Set<String> uniqueWords2 = wordFinder.find(text2);
        System.out.println(uniqueWords2);

        String text3 = "apple apple orange banana orange apple";
        Set<String> uniqueWords3 = wordFinder.find(text3);
        System.out.println(uniqueWords3);

        String text4 = "Hello! hello world World";
        Set<String> uniqueWords4 = wordFinder.find(text4);
        System.out.println(uniqueWords4);
    }

    public void testGetAuthorToBooksMap() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Author 1", "Book 1", "2"));
        bookDatabase.save(new Book("Author 1", "Book 2", "1"));
        bookDatabase.save(new Book("Author 1", "Book 3", "1"));

        Map<String, List<Book>> authorToBooksMap = bookDatabase.getAuthorToBooksMap();

        for (String author : authorToBooksMap.keySet()) {
            List<Book> booksByAuthor = authorToBooksMap.get(author);
            System.out.println("Author: " + author);
            System.out.println("Books: " + booksByAuthor);
        }

    }

    public void testGetEachAuthorBookCount(){
        BookDatabase bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Author 1", "Book 1","3"));
        bookDatabase.save(new Book("Author 1", "Book 2","3"));
        bookDatabase.save(new Book("Author 2", "Book 3","3"));
        bookDatabase.save(new Book("Author 2", "Book 4","3"));
        bookDatabase.save(new Book("Author 2", "Book 5","3"));

        Map<String, Integer> authorBookCountMap = bookDatabase.getEachAuthorBookCount();

        for (String author : authorBookCountMap.keySet()) {
            int bookCount = authorBookCountMap.get(author);
            System.out.println("Author: " + author);
            System.out.println("Number of books:" + bookCount);
        }

    }
}

