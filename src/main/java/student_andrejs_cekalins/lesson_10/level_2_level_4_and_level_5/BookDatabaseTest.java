package student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5;

import student_andrejs_cekalins.lesson_10.level_3.*;

import java.util.*;

public class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.saveBook();
        test.notSaveBook();
        test.deleteBookById();
        test.notDeleteBookById();
        test.deleteBook();
        test.notDeleteBook();
        test.findById();
        test.notFindById();
        test.findByAuthor();
        test.notFindByAuthor();
        test.findByTitle();
        test.notFindByTitle();
        test.countAllBooks();
        test.notCountAllBooks();
        test.deleteByAuthor();
        test.notDeleteByAuthor();
        test.deleteByTitle();
        test.notDeleteByTitle();
        test.andAuthorTitleSearchCriteria();
        test.notAndAuthorTitleSearchCriteria();
        test.orAuthorYearOfIssueSearchCriteria();
        test.notOrAuthorYearOfIssueSearchCriteria();
        test.findUniqueAuthors();
        test.notFindUniqueAuthors();
        test.findUniqueTitles();
        test.notFindUniqueTitles();
        test.findUniqueBooks();
        test.notFindUniqueBooks();
        test.containsBook();
        test.notContainsBook();
        test.getAuthorToBooks();
        test.notGetAuthorToBooks();
        test.getEachAuthorBookCount();
        test.notGetEachAuthorBookCount();
    }

    public void saveBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Long expectedResult = 2L;
        Long realResult0 = bookDatabase.save(book1);
        Long realResult = bookDatabase.save(book2);
        if (expectedResult.equals(realResult)) {
            System.out.println("Save book test Passed");
        }
    }

    public void notSaveBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Long expectedResult = 2L;
        Long realResult = bookDatabase.save(book1);
        if (!expectedResult.equals(realResult)) {
            System.out.println("Not save book test Passed");
        }
    }

    public void deleteBookById() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean expectedResult = true;
        boolean realResult = bookDatabase.delete(1L);
        if (expectedResult == realResult) {
            System.out.println("Delete by Id book test Passed");
        }
    }

    public void notDeleteBookById() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean expectedResult = true;
        boolean realResult = bookDatabase.delete(2L);
        if (!expectedResult == realResult) {
            System.out.println("Not delete by Id book test Passed");
        }
    }

    public void deleteBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean expectedResult = true;
        boolean realResult = bookDatabase.delete(book1);
        if (expectedResult == realResult) {
            System.out.println("Delete book test Passed");
        }
    }

    public void notDeleteBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean expectedResult = false;
        boolean realResult = bookDatabase.delete(book2);
        if (!expectedResult == realResult) {
            System.out.println("Not deleting book test Passed");
        }
    }

    public void findById() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> expectedResult = Optional.of(book1);
        Optional<Book> realResult = bookDatabase.findById(1L);
        if (realResult.equals(expectedResult)) {
            System.out.println("Find by Id book test Passed");
        }
    }

    public void notFindById() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> expectedResult = Optional.of(book1);
        Optional<Book> realResult = bookDatabase.findById(3L);
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not find by Id book test Passed");
        }
    }

    public void findByAuthor() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("J.R.R. Tolkien", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        List<Book> realResult = bookDatabase.findByAuthor("J.R.R. Tolkien");
        if (expectedResult.equals(realResult)) {
            System.out.println("Find author books test Passed");
        }
    }

    public void notFindByAuthor() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("J.R.R. Tolkien", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        List<Book> realResult = bookDatabase.findByAuthor("Miguel de Cervantes");
        if (!expectedResult.equals(realResult)) {
            System.out.println("Not find author books test Passed");
        }
    }

    public void findByTitle() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Lord of the Rings", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        List<Book> realResult = bookDatabase.findByTitle("Lord of the Rings");
        if (realResult.equals(expectedResult)) {
            System.out.println("Find books by title test Passed");
        }
    }

    public void notFindByTitle() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Lord of the Rings", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        List<Book> realResult = bookDatabase.findByTitle("Lord of the Rings");
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not find books by title test Passed");
        }
    }

    public void countAllBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        int expectedResult = 3;
        int realResult = bookDatabase.countAllBooks();
        if (realResult == expectedResult) {
            System.out.println("Count all books test Passed");
        }
    }

    public void notCountAllBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        int expectedResult = 2;
        int realResult = bookDatabase.countAllBooks();
        if (realResult != expectedResult) {
            System.out.println("Not count all books test Passed");
        }
    }

    public void deleteByAuthor() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("J.R.R. Tolkien");
        BookDatabase realResult = bookDatabase;
        BookDatabase expectedResult = new BookDatabaseImpl();
        expectedResult.save(book2);
        expectedResult.save(book3);
        if (expectedResult.equals(realResult)) {
            System.out.println("Delete books by author test Passed");
        }
    }

    public void notDeleteByAuthor() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("J.R.R. Tolkien");
        BookDatabase expectedResult = new BookDatabaseImpl();
        expectedResult.save(book1);
        expectedResult.save(book3);
        BookDatabase realResult = bookDatabase;
        if (!Objects.equals(realResult, expectedResult)) {
            System.out.println("Not delete books by author test Passed");
        }
    }


    public void deleteByTitle() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("Lord of the Rings");
        BookDatabase expectedResult = new BookDatabaseImpl();
        expectedResult.save(book2);
        expectedResult.save(book3);
        BookDatabase realResult = bookDatabase;
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println("Delete books by title test Passed");
        }
    }

    public void notDeleteByTitle() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("Lord of the Rings");
        BookDatabase expectedResult = new BookDatabaseImpl();
        expectedResult.save(book1);
        expectedResult.save(book3);
        BookDatabase realResult = bookDatabase;
        if (!Objects.equals(realResult, expectedResult)) {
            System.out.println("Not delete books by title test Passed");
        }
    }

    public void andAuthorTitleSearchCriteria() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("J.R.R. Tolkien", "Lord of the Rings", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        List<Book> realResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("J.R.R. Tolkien"),
                new TitleSearchCriteria("Lord of the Rings")));
        if (realResult.equals(expectedResult)) {
            System.out.println("Search criteria and: author + title test Passed");
        }
    }

    public void notAndAuthorTitleSearchCriteria() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("J.R.R. Tolkien", "Lord of the Rings", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        List<Book> realResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("J.R.R. Tolkien"),
                new TitleSearchCriteria("Don Quixote")));
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not search criteria and: author + title test Passed");
        }
    }

    public void orAuthorYearOfIssueSearchCriteria() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "2006");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        List<Book> realResult = bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria("J.R.R. Tolkien"),
                new YearOfIssueSearchCriteria("2006")));
        if (realResult.equals(expectedResult)) {
            System.out.println("Search criteria or: author or year of issue test Passed");
        }
    }

    public void notOrAuthorYearOfIssueSearchCriteria() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        List<Book> realResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("Mane"),
                new YearOfIssueSearchCriteria("2022")));
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not search criteria or: author or year of issue test Passed");
        }
    }

    public void findUniqueAuthors() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("J.R.R. Tolkien");
        expectedResult.add("Miguel de Cervantes");
        expectedResult.add("Lewis Carroll");
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        if (realResult.equals(expectedResult)) {
            System.out.println("Find unique authors test Passed");
        }
    }

    public void notFindUniqueAuthors() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Mali");
        expectedResult.add("Shoppe");
        expectedResult.add("Bradly");
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not find unique authors test Passed");
        }
    }

    public void findUniqueTitles() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Lord of the Rings");
        expectedResult.add("Don Quixote");
        expectedResult.add("Alice's Adventures in Wonderland");
        Set<String> realResult = bookDatabase.findUniqueTitles();
        if (realResult.equals(expectedResult)) {
            System.out.println("Find unique titles test Passed");
        }
    }

    public void notFindUniqueTitles() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("Work");
        expectedResult.add("Main deal");
        expectedResult.add("Summer time");
        Set<String> realResult = bookDatabase.findUniqueTitles();
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not find unique titles test Passed");
        }
    }

    public void findUniqueBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        if (realResult.equals(expectedResult)) {
            System.out.println("Find unique books test Passed");
        }
    }

    public void notFindUniqueBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        Book book4 = new Book("Dan Brown", "Da Vinci Code", "2012");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book4);
        expectedResult.add(book2);
        expectedResult.add(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not find unique titles test Passed");
        }
    }

    public void containsBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean expectedResult = true;
        boolean realResult = bookDatabase.contains(book1);
        if (realResult == expectedResult) {
            System.out.println("Contains book test Passed");
        }
    }

    public void notContainsBook() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        Book book2 = new Book("Miguel de Cervantes", "Don Quixote", "1982");
        Book book3 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        Book book4 = new Book("Dan Brown", "Da Vinci Code", "2012");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean expectedResult = false;
        boolean realResult = bookDatabase.contains(book4);
        if (realResult == expectedResult) {
            System.out.println("Not contains book test Passed");
        }
    }

    public void getAuthorToBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Lewis Carroll", "Don Quixote", "1982");
        Book book2 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        Book book3 = new Book("Dan Brown", "Da Vinci Code", "2012");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> lewisCarroll = new ArrayList<>();
        List<Book> danBrown = new ArrayList<>();
        lewisCarroll.add(book1);
        lewisCarroll.add(book2);
        danBrown.add(book3);
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put("Lewis Carroll", lewisCarroll);
        expectedResult.put("Dan Brown", danBrown);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        if (realResult.equals(expectedResult)) {
            System.out.println("Get author to books test Passed");
        }
    }

    public void notGetAuthorToBooks() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Lewis Carroll", "Don Quixote", "1982");
        Book book2 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        Book book3 = new Book("Dan Brown", "Da Vinci Code", "2012");
        Book book4 = new Book("J.R.R. Tolkien", "Lord of the Rings", "2006");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> lewisCarroll = new ArrayList<>();
        List<Book> danBrown = new ArrayList<>();
        lewisCarroll.add(book1);
        lewisCarroll.add(book2);
        danBrown.add(book3);
        danBrown.add(book4);
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put("Lewis Carroll", lewisCarroll);
        expectedResult.put("Dan Brown", danBrown);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not get author to books test Passed");
        }
    }

    public void getEachAuthorBookCount() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Lewis Carroll", "Don Quixote", "1982");
        Book book2 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        Book book3 = new Book("Dan Brown", "Da Vinci Code", "2012");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Lewis Carroll", 2);
        expectedResult.put("Dan Brown", 1);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        if (realResult.equals(expectedResult)) {
            System.out.println("Get each author book count test Passed");
        }
    }
    public void notGetEachAuthorBookCount() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Lewis Carroll", "Don Quixote", "1982");
        Book book2 = new Book("Lewis Carroll", "Alice's Adventures in Wonderland", "1980");
        Book book3 = new Book("Dan Brown", "Da Vinci Code", "2012");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Lewis Carroll", 1);
        expectedResult.put("Dan Brown", 1);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        if (!realResult.equals(expectedResult)) {
            System.out.println("Not get each author book count test Passed");
        }
    }
}
