package student_ilya_tihonov.lesson_10.BookLibraryApplication.search.tests;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.AndSearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.AuthorSearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.SearchCriteria;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.YearOfIssueSearchCriteria;

public class AndSearchCriteriaTest {

    public static void main(String[] args) {
        AndSearchCriteriaTest andSearchCriteriaTest = new AndSearchCriteriaTest();
        andSearchCriteriaTest.testMatch();
    }

    public void testMatch() {

        Book book1 = new Book("Author 1", "Book 1", "1");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author 1");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1");

        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearCriteria);

        if (andSearchCriteria.match(book1)) {
            System.out.println("OK");
        } else {
            System.out.println("Failed");
        }

    }

}
