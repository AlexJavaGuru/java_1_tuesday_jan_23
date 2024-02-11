package student_ilya_tihonov.lesson_10.BookLibraryApplication.search.tests;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.AuthorSearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.OrSearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.SearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.YearOfIssueSearchCriteria;

public class OrSearchCriteriaTest {

    public static void main(String[] args) {
        OrSearchCriteriaTest orSearchCriteriaTest = new OrSearchCriteriaTest();
        orSearchCriteriaTest.testMatch();
    }

    public void testMatch() {

        Book book1 = new Book("Author 1", "Book 1", "1");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author 12");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1");

        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearCriteria);

        if (orSearchCriteria.match(book1)) {
            System.out.println("OK");
        } else {
            System.out.println("Failed");
        }

    }

}
