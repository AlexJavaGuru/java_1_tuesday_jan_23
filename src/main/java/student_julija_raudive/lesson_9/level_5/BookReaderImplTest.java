package student_julija_raudive.lesson_9.level_5;


import java.util.ArrayList;
import java.util.List;

class BookReaderImplTest {

    BookReaderImpl bookReader = new BookReaderImpl();
    Book cinderella = new Book("Cinderella", "Charles Perrault");
    Book harryPotter = new Book("", "Joanne Rowling");


    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();
        test.addBookTest();
        test.addExistingBook();
        test.addBookWithoutTitle();
        test.addBookWithoutAuthor();
        test.addBookWithoutAnyData();
        test.deleteExistingBook();
        test.deleteNotExistingBook();
        test.displayBookListTest();
        test.findBookByAuthorTest();
        test.findBookByAuthorBeginningTest();
        test.findBookByTitleTest();
        test.findBookByTitleBeginningTest();
        test.bookIsReadTest();
        test.bookIsNotReadTest();
        test.markAsReadNonExistentBook();
        test.markBookAsUnreadTest();
        test.markNonExistentBookAsUnreadTest();
        test.displayFinishedBookListTest();
        test.displayUnreadBookListTest();

    }

    public void addBookTest() {
        boolean isAdded = bookReader.addBook(cinderella);
        boolean result = bookReader.bookList.contains(cinderella);
        checkResults(isAdded && result, "Book is added test");

    }

    public void addExistingBook() {
        boolean isAdded = bookReader.addBook(cinderella);
        checkResults(!isAdded, "Existing book is not added test");
    }

    public void addBookWithoutTitle() {
        Book harryPotter = new Book("", "Joanne Rowling");
        boolean isAdded = bookReader.addBook(harryPotter);
        boolean result = bookReader.bookList.contains(harryPotter);
        checkResults(!(isAdded && result), "Book without title is not added test");
    }

    public void addBookWithoutAuthor() {
        Book harryPotter2 = new Book("Harry Potter", "");
        boolean isAdded = bookReader.addBook(harryPotter2);
        boolean result = bookReader.bookList.contains(harryPotter2);
        checkResults(!(isAdded && result), "Book without author is not added test");
    }

    public void addBookWithoutAnyData() {
        Book tomSawyer = new Book("", "");
        boolean isAdded = bookReader.addBook(tomSawyer);
        boolean result = bookReader.bookList.contains(tomSawyer);
        checkResults(!(isAdded && result), "Book without data is not added test");
    }

    public void deleteExistingBook() {
        Book theSnowQueen = new Book("The Snow Queen", "Hans Christian Andersen");
        boolean bookIsAdded = bookReader.addBook(theSnowQueen);
        boolean bookIsDeleted = bookReader.deleteBook(theSnowQueen);
        checkResults(bookIsAdded && bookIsDeleted, "Delete book test");

    }

    public void deleteNotExistingBook() {
        Book goldenCockerel = new Book("The Tale of the Golden Cockerel", "Alexander Pushkin");
        boolean bookIsDeleted = bookReader.deleteBook(goldenCockerel);
        checkResults(!bookIsDeleted, "Delete not existing book test");
    }

    public void displayBookListTest() {
        Book theSnowQueen = new Book("The Snow Queen", "Hans Christian Andersen");
        Book goldenCockerel = new Book("The Tale of the Golden Cockerel", "Alexander Pushkin");
        bookReader.addBook(theSnowQueen);
        bookReader.addBook(goldenCockerel);
        List<String> expectedResult = new ArrayList<>() {{
            add("Book Cinderella [Charles Perrault]");
            add("Book The Snow Queen [Hans Christian Andersen]");
            add("Book The Tale of the Golden Cockerel [Alexander Pushkin]");
        }};
        List<String> result = bookReader.displayBookList();
        checkResults(expectedResult.equals(result), "Display book list test");
    }

    public void findBookByAuthorTest() {
        bookReader.addBook(new Book("The Tale of the Fisherman and the Fish", "Alexander Pushkin"));

        List<String> expectedResult = new ArrayList<>() {{
            add("Book The Tale of the Golden Cockerel [Alexander Pushkin]");
            add("Book The Tale of the Fisherman and the Fish [Alexander Pushkin]");
        }};
        List<String> result = bookReader.findBookByAuthor("Alexander Pushkin");
        checkResults(expectedResult.equals(result), "Display book list by author test");

    }

    public void findBookByAuthorBeginningTest() {
        List<String> expectedResult = new ArrayList<>() {{
            add("Book The Tale of the Golden Cockerel [Alexander Pushkin]");
            add("Book The Tale of the Fisherman and the Fish [Alexander Pushkin]");
        }};
        List<String> result = bookReader.findBookByAuthor("Alexander");
        checkResults(expectedResult.equals(result), "Display book list by author beginning test");
    }

    public void findBookByTitleTest() {
        bookReader.addBook(new Book("Joyland", "Stephen King"));
        bookReader.addBook(new Book("Joyland", "Emily Schultz"));

        List<String> expectedResult = new ArrayList<>() {{
            add("Book Joyland [Stephen King]");
            add("Book Joyland [Emily Schultz]");
        }};
        List<String> result = bookReader.findBookByTitle("Joyland");
        checkResults(expectedResult.equals(result), "Display book list by title test");

    }

    public void findBookByTitleBeginningTest() {
        List<String> expectedResult = new ArrayList<>() {{
            add("Book Joyland [Stephen King]");
            add("Book Joyland [Emily Schultz]");
        }};
        List<String> result = bookReader.findBookByTitle("Joy");
        checkResults(expectedResult.equals(result), "Display book list by title beginning test");
    }

    public void bookIsReadTest() {
        boolean result = bookReader.markAsRead(cinderella);
        boolean expectedResult = true;
        checkResults(result == expectedResult, "Book is read test");
    }

    public void bookIsNotReadTest() {
        boolean result = bookReader.bookList.get(1).isRead();
        boolean expectedResult = false;
        checkResults(result == expectedResult, "Book is not read test");
    }

    public void markAsReadNonExistentBook() {
        boolean result = bookReader.markAsRead(harryPotter);
        boolean expectedResult = false;
        checkResults(result == expectedResult, "Mark as read non-existent book test");

    }

    public void markBookAsUnreadTest() {
        boolean result = bookReader.markAsUnread(cinderella);
        boolean expectedResult = true;
        checkResults(result == expectedResult, "Book is marked as unread test");
    }

    public void markNonExistentBookAsUnreadTest() {
        boolean result = bookReader.markAsUnread(harryPotter);
        boolean expectedResult = false;
        checkResults(result == expectedResult, "Book is marked as unread test");
    }

    public void displayFinishedBookListTest() {
        bookReader.markAsRead(cinderella);
        List<String> expectedResult = new ArrayList<>() {{
            add("Book Cinderella [Charles Perrault]");
        }};
        List<String> result = bookReader.displayFinishedBookList();
        checkResults(expectedResult.equals(result), "Display finished book list test");

    }

    public void displayUnreadBookListTest(){
        List<String> expectedResult = new ArrayList<>() {{
            add("Book The Snow Queen [Hans Christian Andersen]");
            add("Book The Tale of the Golden Cockerel [Alexander Pushkin]");
            add("Book The Tale of the Fisherman and the Fish [Alexander Pushkin]");
            add("Book Joyland [Stephen King]");
            add("Book Joyland [Emily Schultz]");
        }};
        List<String> result = bookReader.displayUnreadBookList();
        checkResults(expectedResult.equals(result), "Display unread book list test");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
