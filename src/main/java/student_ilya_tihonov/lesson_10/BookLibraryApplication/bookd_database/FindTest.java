package student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.AuthorSearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.SearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.TitleSearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.YearOfIssueSearchCriteria;

import java.util.List;

public class FindTest {

    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Title1", "Author1", "1"));
        bookDatabase.save(new Book("Title2", "Author2", "2"));
        bookDatabase.save(new Book("Title3", "Author1", "3"));
        bookDatabase.save(new Book("Title4", "Author3", "4"));

        SearchCriteria authorCriteria = new AuthorSearchCriteria("Author1");
        SearchCriteria titleCriteria = new TitleSearchCriteria("Title2");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("2010");

        System.out.println("Search by author (Author1): ");
        List<Book> authorResults = bookDatabase.find(authorCriteria);
        printSearchResults(authorResults);

        System.out.println("\nSearch by title (Title2): ");
        List<Book> titleResults = bookDatabase.find(titleCriteria);
        printSearchResults(titleResults);

        System.out.println("\nSearch by release year (4):");
        List<Book> yearResults = bookDatabase.find(yearCriteria);
        printSearchResults(yearResults);
    }

    private static void printSearchResults(List<Book> results) {
        if (results == null) {
            System.out.println("Nothing found.");
        } else {
            System.out.println("Searching results:");
            if (!results.isEmpty()) {
                for (Book book : results) {
                    System.out.println(book.getTitle() + " by " + book.getAuthor());
                }
            } else {
                System.out.println("Nothing found.");
            }
        }
    }

}
