package student_ilya_tihonov.lesson_10.BookLibraryApplication.unique_word_finder;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.search.YearOfIssueSearchCriteria;

public class YearOfIssueSearchCriteriaTest {

    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest yearOfIssueSearchCriteriaTest = new YearOfIssueSearchCriteriaTest();
        yearOfIssueSearchCriteriaTest.testMatch();
    }

    public void testMatch() {

        Book book1 = new Book("Author 1", "Book 1", "1");

        YearOfIssueSearchCriteria yearOfIssueSearchCriteriaTest = new YearOfIssueSearchCriteria("1");

        if (yearOfIssueSearchCriteriaTest.match(book1)) {
            System.out.println("Ok");
        } else {
            System.out.println("Failed");
        }
    }

}
